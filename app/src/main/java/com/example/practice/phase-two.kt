package com.example.practice

class Phase constructor(var Length: Int, var width: Int= 100){
    // Initialization Blocks are called after the primary constructor
    // We can have multiple initialization Blocks
    var sharon : String = "I love you so much";
    init{
        println("Hello World");
        sharon= "My heart is with you"
    }
    init{
        println("Martin Mwenda");
        sharon = "My heart desires you";
    }
    init{
        println("Sharon Nyambega");
        sharon = "You are good";
    }
    init{
        println("$sharon Is looking for an attachment");
        sharon = "I desire you";
    }
    fun getArea(){
        var result= Length * width;
        println("The length of the circle is $result");
    }
    // in classes we can create properties and then initializing them
    // inint block statements do not detect blocks detailed after they detect those ith them

}