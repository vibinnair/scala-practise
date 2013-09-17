val oneTwo = 	List("one", "two")
val threeFour = List("three", "four")

val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and" + threeFour + " were not mutated.")
println("Thus " + oneTwoThreeFour + "is a new list.")