# Data-Structures-and-Algorithms-Linked-Lists

A linked list is an alternstive to an array.
The most important characteristic of a linked list differentiating it froman an array is the fact that the data elements are not stored in adjacent memory positions as is the case with arrays.
In Linked lists each item needs to contain information on the memory position of the next item.
The programmer needs to know where the first node is, it is also useful to know thw address of the last node.
Each node consists of 
1. Data element.
2. Address of the following node.

How can the functionality of the Linked list class be further improved? Functionality can be improved by adding additional methods for common operations on a Linked list needed by your application.

Can you think of any? I can, see my list below.

getMax() return the largest value found in the linked list. (uses compareTo)

getMin() return the smallest value in the linked list. (uses compareTo)

equals(..) receives an array list a parameter and compare every object in the calling list with every object in the parameter list to determine equality. (can use equals or compareTo)

getUnique() return a list without duplicates example (1,2,1,3,5,4,2,1) return (1,2,3,4,5) (can use equals or compareTo)

getFiltered(..) this method receives a parameter and will return values larger (if needed smaller) than the parameter. example (1,2,5,4,6,3,7,9) parameter (4) return (5,6,7,9). (uses compareTo)
