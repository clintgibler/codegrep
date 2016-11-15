package encoder

import org.antlr.v4.runtime.Token

object TextCodeEncoder extends CodeEncoder{
  override def parse(content: String): Map[String, Set[Token]] = {
    Map.empty
  }
}
