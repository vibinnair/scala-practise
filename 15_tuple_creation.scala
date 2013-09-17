val pair = (99, "Luftballons") // tuples are immutable and can have elements of different types, whereas
                   			   // lists are immutable but they can hold elements of same type.

println(pair)                  // Here the tuple type is Tuple2[Int, String]
                               // i.e tuple is of length 2 with one element of type Int and 
                               //     other of type String.


val pair_5 = (1, 2, 3, 'a', "hello")   // Similiarly, this tuple type is 
                                       // Tuple5[Int, Int, Int, Char, String]

                                       // Max : Tuple22 is available in scala.  

println(pair_5)