package com.example.ncert.recycler.view

import com.example.ncert.R

 class Data {
     companion object{
         val list  = mutableListOf(
             Item("5000",R.drawable.kbc),
             Item( "10,000",R.drawable.kbc),
             Item( "20,000",R.drawable.kbc),
             Item("40,000",R.drawable.kbc),
             Item("80,000",R.drawable.kbc),
             Item("160,000",R.drawable.kbc),
             Item("320,000", R.drawable.kbc),
             Item("640,000",R.drawable.kbc),
             Item("1,250,000",R.drawable.kbc),
             Item("2,500,000",R.drawable.kbc),
             Item("5,000,000",R.drawable.kbc),
             Item("1-crore",R.drawable.kbc),
             Item("7-crore",R.drawable.kbc)
         )

         val image : Int  = R.drawable.ic_launcher_foreground

         //hash map for questions and ans put ed in it they do not make sure order
         val hashmap = mutableListOf(
             Pair("Elements in an array are accessed __",1),
             Pair("In general, the index of the first element in an array is __",1),
             Pair("When does the ArrayIndexOutOfBoundsException occur? ",2),
             Pair("In a stack, if a user tries to remove an element from an empty stack it is called ___ ",1),
             Pair("What is the value of the postfix expression 6 3 2 4 + – *?",4),
             Pair("How many arguments are required by the predefined function rotate() in C++?",3),
             Pair("How many types of insertion are performed in a binary tree?",2),
             Pair("The average depth of a binary tree is given as?",4),
             Pair("Matrix A when multiplied with Matrix C gives the Identity matrix I, what is C?",2),
             Pair("Which of the following is an advantage of matrices?",4),
             Pair("What is the complexity of adding an element to the heap.",3),
             Pair("Heap can be used as _______",3) ,
             Pair("What traversal over trie gives the lexicographical sorting of the set of the strings?",3)
         )

         //An matrix storing the option
         val options : Array<Array<String>> = arrayOf(
             arrayOf(
                 "a) randomly",
                 "b) sequentially",
                 "c) exponentially",
                 "d) logarithmically"
             ),
             arrayOf(
                 "a) 0",
                 "b) -1",
                 "c) 2",
                 "d) 1"
             ),
             arrayOf(
                 "a) Compile-time",
                 "b) Run-time",
                 "c) Not an error",
                 "d) Not an exception at all"
             ),
             arrayOf(
                 "a) Underflow",
                 "b) Empty collection",
                 "c) Overflow",
                 "d) Garbage Collection"
             ),
             arrayOf(
                 "a) 1",
                 "b) 40",
                 "c) 74",
                 "d) -18"
             ),
             arrayOf(
                 "a) 1",
                 "b) 2",
                 "c) 3",
                 "d) 4"
             ),
             arrayOf(
                 "a) 1",
                 "b) 2",
                 "c) 3",
                 "d) 4"
             ),
             arrayOf(
                 "a) O(N)",
                 "b) O(√N)",
                 "c)  O(N2)",
                 "d) O(log N)"
             ),
             arrayOf(
                 "a) Identity matrix",
                 "b) Inverse of A",
                 "c) Square of A",
                 "d) Transpose of A"
             ),
             arrayOf(
                 "a) Internal complexity",
                 "b) Searching",
                 "c) space efficient",
                 "d) Graph Plotting"
             ),
             arrayOf(
                 "a) O(log n)",
                 "b) O(h)",
                 "c) O(log n) & O(h)",
                 "d) O(n)"
             ),
             arrayOf(
                 "a) Priority queue",
                 "b) Stack",
                 "c) A decreasing order array",
                 "d) Normal Array"
             ),
             arrayOf(
                 "a) postorder",
                 "b) preorders",
                 "c) inorder",
                 "d) inorder"
             )
             )

     }

}