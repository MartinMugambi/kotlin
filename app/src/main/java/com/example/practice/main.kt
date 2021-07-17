package com.example.practice
// Kotlin Recap
// fun is the shotcut of fucntion in Kotlin

// the fun main is used in kotlin to run application
// write a programs that prints hellow orld in kt

// Kotlin variable in is either mutable of immutable

fun main(){
    //immutbale varibales in kotlin they dont change
    // val cannot be changed at any time or situation
    val firstName: String = "Martin";
    val lastName: String = "Mwenda";
    val fullName: String =  firstName + lastName;
    println(fullName)
    // Kotlin mutable variable use var keyword
    // var can be changed anywhere and any time
    var currentYear: Int = 2021;
    var dateOfBirth: Int = 1998;
    currentYear = 2022;
    var age = currentYear.minus(dateOfBirth);
    println("$fullName $age");

    //Kotlin Booleans
    var favouriteCOlor: Boolean = true;
    println("$favouriteCOlor");
    if(favouriteCOlor === true){
        println("I like color blue");
    } else{
        println("I like color yellow");
    }

    //Kotlin if else Statement
    // Used to check the condition of something in Kotlin
    var learningLanguage: String = "Kotlin";
    if(learningLanguage==="Kotlin") {
        println("Kotlin is super fan");
    } else{
        println("Learning Kotlin for android development");
    }
}
