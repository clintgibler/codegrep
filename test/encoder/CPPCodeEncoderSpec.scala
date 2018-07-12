package encoder

import models.{CodeModel, CodeSourceModel}
import org.scalatestplus.play._

class CPPCodeEncoderSpec extends PlaySpec {
  val validCPP =
    """#include <iostream>
  using namespace std;

  class Foo {

  public:
    int add(int i, int j) {
      return i+j;
    }
  int mult(int i, int j) {
    return i*j;
  }
  static int negate(int i) {
    return -i;
  }
  };

  int bar1(int i, int j, Foo* pFoo, int(Foo::*pfn)(int,int)) {
  return (pFoo->*pfn)(i,j);
  }

  typedef int(Foo::*Foo_pfn)(int,int);

  int bar2(int i, int j, Foo* pFoo, Foo_pfn pfn) {
  return (pFoo->*pfn)(i,j);
  }

  typedef int(*PFN)(int);

  int bar3(int i, PFN pfn) {
  return pfn(i);
  }

  int main() {
  Foo foo;
  cout << "Foo::add(2,4) = " << bar1(2,4, &foo, &Foo::add) << endl;
  cout << "Foo::mult(3,5) = " << bar2(3,5, &foo, &Foo::mult) << endl;
  cout << "Foo::negate(6) = " << bar3(6, &Foo::negate) << endl;
  return 0;
  }
  """
  val validCPPNamespace =
    """
      namespace ContosoData
      {
          class ObjectManager
          {
          public:
              void DoSomething() {}
          };
          void Func(ObjectManager) {}
      }
    """

  def extractToken(model: CodeModel,
                   tokenType: String,
                   tokenText: String): String = {
    model.tokens.find((t) => t.tokenType == tokenType && t.text == tokenText) match {
      case Some(t) => t.text
      case _       => "Token not found"
    }
  }

  "CPPCodeEncoder" must {
    "must parse C++ code correctly " in {
      val code = CodeSourceModel(
        id = "abc",
        repository = "https://github.com/x.git",
        filename = "test/a.cpp",
        content = validCPP
      )
      val encoder: Either[CodeEncoderError, CodeModel] = CodeEncoder.from(code)
      val r = encoder match {
        case Left(failure) => fail(failure.toString)
        case Right(model) =>
          extractToken(model, "function", "add") mustBe "add"
          extractToken(model, "function", "bar1") mustBe "bar1"
          extractToken(model, "class", "Foo") mustBe "Foo"
      }
    }
    "must parse C++ namespaces correctly " in {
      val code = CodeSourceModel(
        id = "abc",
        repository = "https://github.com/x.git",
        filename = "test/a.cpp",
        content = validCPPNamespace
      )
      val encoder: Either[CodeEncoderError, CodeModel] = CodeEncoder.from(code)
      val r = encoder match {
        case Left(failure) => fail(failure.toString)
        case Right(model) =>
          extractToken(model, "namespace", "ContosoData") mustBe "ContosoData"
          extractToken(model, "namespace", "ObjectManager") mustBe "Token not found"
      }
    }
  }

}
