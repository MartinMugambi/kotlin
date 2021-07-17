package com.example.practice
// Kotlin Recap
// fun is the shortcut of function in Kotlin

// the fun main is used in kotlin to run application
// write a programs that prints hello  world in kt

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
    //expected output false
    println(a==b);

    // nullable equations in Kotlin
    // if we want a nullable equation in Kotlin we add the equation mark since basic types
    // are not nullable
    var currentSchool : String  ? = "";
    currentSchool = null; // we can now assign to null using the  ? ;
    var currentPrice : Int ? = 1998;
    currentPrice = 1_000_000;
    println("${currentPrice.toString()}".length);

    //Kotlin elvis operator
    var textName : String ? = "Sharon";
    textName= null;
     var textLength : Int? = textName?.length ?: 0;
    // expected output 0
    println(textLength);
    // Kotlin function check down
    favouriteFood();
    // Kotlin with return function
    var xyz = getUser();
    println(xyz);
    // func with return type
    var xy = getAge();
    println(xy);
    // kotlin function with arguments/paramteter & return type
    var area = calcArea(4, 5)
    var calcArea = calcArea(20,20)
    println(area);
    println(calcArea);
    // Kotlin function with parameter
    calcPerimeter(10, 10);
}

//<------------------------------------------------------------->//

//Kotlin functions
// keywords of kotlin function is kt
fun favouriteFood(){
    // we are going to call the function in the main function to run
    println("I basically like eating Rice");
}

// functions with return Types
 fun getUser() : String{
     var firstName: String = "Sharon";
    var lastName: String = "Nyambega";
    var fullName : String = "$firstName $lastName";
    return fullName;
   ;
 }
//kotlin function with return type
fun getAge() : Int{
    var currentYear : Int  = 2021;
    var dateOfBirth: Int  = 2002;
    val currentAge: Int = currentYear.minus(dateOfBirth);
    return  currentAge;
}

//Kotlin functions with named parameters apnd return type
 fun calcArea(width: Int, height: Int): Int{
    val area = width * height;
    return  area;
 }

//Kotlin function with parameter and no return type
fun calcPerimeter(length : Int, width: Int){
    val area = length * width;
    println(area);

}

class Person(var firstName: String){

}