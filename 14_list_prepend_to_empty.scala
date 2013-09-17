val oneTwoThree = 1 :: 2 :: 3 :: Nil  // :: is method of the empty list. Hence 1 :: 2 :: 3 wont work.
                                      // Here we have not declared a list, because once we say Nil, scala
                                      // understands that we are taking about an empty list. 

println(oneTwoThree)   // REMEMBER ---> :: takes constant time in prepending whereas 
                       // another available method  :+ increases with the increase in 
                       // length of list. 