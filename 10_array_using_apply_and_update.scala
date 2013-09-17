val greetStrings = new Array[String](4)

greetStrings.update(0, "Hello")            // ----> greetStings[0] = "Hello"
greetStrings.update(1, "World")            // ----> greetStings[1] = "World"
greetStrings.update(2, "Good")             // ----> greetStings[2] = "Good"
greetStrings.update(3, "Morning!!!!!")     // ----> greetStings[3] = "Morning!!!!!"

for(i <- 0.to(3))                  // -------> for(i <- 0 to 3)
  println(greetStrings.apply(i))   // -------> 	println(greetStrings(i))