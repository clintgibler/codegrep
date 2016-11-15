val ext = """.*\.(\w+)$""".r
"boo.java" match {
  case ext(fileType) => println(fileType)
}

val l = 1 :: 2 :: Nil
l.foreach(println(_))