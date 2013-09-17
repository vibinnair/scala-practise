val pair = (99, "Luftballons")

println(pair._1)           // tuples do not support update method i.e we cannot call pair(0)
println(pair._2)           // this is because a tuple can have different types of objects, whereas
                           // an update function is defined to return only same type of object.

                           // instead tuples have dynamic methods such as _1, _2 where each returns 
                           // a specific type of objects i.e one which is belonged in that location.
                           // These are one-based index and not zero based i.e they start from 1
                           // instead of zero.   