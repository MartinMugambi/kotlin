package com.example.practice
// Kotlin Recap
// fun is the shotcut of fucntion in Kotlin

// the fun main is used in kotlin to run application
// write a programs that prints hellow orld in kt

// Kotlin variable in is either mutable of immutable

fun main(){
    //immutbale varibales in kotlin they dont change
    val firstName: String = "Sharon";
    val lastName: String = "Nyambega";
    val fullName: String =  firstName + lastName;
    println(fullName)
    // Kotlin mutable variable use var keyword
    var currentYear: Int = 2021;
    var dateOfBirth: Int = 1998;
    currentYear = 2022;
    var age = currentYear.minus(dateOfBirth);
    println("$fullName $age");
}
