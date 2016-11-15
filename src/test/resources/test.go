package main

import "test/import1"
import . "test/import2"
import testimp "test/import3"

type testType struct {
  testField1 string
  testField2 *a.b
}

func (t testType) testMethod() int {
  return 0
}

func main() {
  var testLongVarDecl string
  shortVarDecl := 0
}
