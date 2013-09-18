// Hashset is a special type of Set, in which the elements are unique (as per set behaviour), 
// as well as they are stored as hashes. 
// Hashsets were build to have a faster mechanisn of determining wether an object is already
// in the set. However we loose the order in which the elements are inserted. So the elements 
// are not in ordered format.
// It is a set with hashvalues of inserted objects.

// How is it diff from Hashmap
// A HashSet is a set having hashvalues of inserted objects whereas A Hashmap is a proper Map having 
// key-value pair

// Reference: http://stackoverflow.com/questions/4558754/define-what-is-a-hashset

import scala.collection.immutable.HashSet

var hashset = HashSet("Tomatoes", "Corriander")

println(hashset)
