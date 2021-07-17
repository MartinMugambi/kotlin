package com.example.practice
// Kotlin Recap
// fun is the shortcut of function in Kotlin

// the fun main is used in kotlin to run application
// write a programs that prints hellow orld in kt

// Kotlin variable in is either mutable of immutable

fun main(){
    //immutbale variables in kotlin they dont change
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
    //Kotlin Truth Tables
    // AND -> symbol &&
    // OR symbol -> |
    //AND Truth Table-
     // T T -> T
    // pratice
    var currentDate: Int = 2021;
    var currentTime : Double = 11.59;
    // expected output is True
     if((currentDate===2021) && (currentTime==11.59)){
         println("true")
     } else{
         println("false")
     }
     //T  F -> F
    //expected output is false
     if((currentDate==2021) && currentTime==1.58){
         println("true")
     } else{
         println("false");
     }
    // F T -> F
    var currentPassword : String  = "qwerty";
    var updatedPassword : String = "shazam";
    if((currentPassword== "martin") && (updatedPassword === "shazm")){
        println("true");
    } else{
        println("false");
    }
   // final Truth Table  F F -> F
    // expected output is false;
    if((currentPassword === "home ") &&(updatedPassword==="mongo")){
        println("true")
    } else {
        println("false");
    }

        // OR logical opertator
        //T T -> T
    // T F- T
    // expected output  true
    if((currentPassword==="qwerty") || (updatedPassword==="true")){
        println("true");
    } else{
        println("false");
    }
    //F T - T
    // F F -> F
       // Kotlin Structural Equality use ===
     var  favouriteBook : String  = "Secret Seven";
     var favouriteGame: String = "Ruby";
    //expected output is false;
    println(favouriteBook==favouriteGame);
    //Kotlin referential Equality for objects
    var a  = Person("jane");
    var b  = Person("Jane");
    //exoected output false
    println(a==b);

}

class Person(var firstName: String){

}