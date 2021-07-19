package com.example.practice

//class Food with constructor and Init
// Init are usually called immediately after the primary constructor
// when using mutiple constructors we use the keyword this

class Food constructor(var foodName: String, var foodType: String,var isGood: Boolean){

    constructor(foodName: String, foodType: String) : this("Githeri", foodType,true){
     println("This is the second constructor");
    }
    constructor(foodName: String) : this(foodName, "Unknown"){
        println("This is the third constructor")
    }
    init{
        foodName = "Chips and Chicken";
        foodType = "Falvor is good";
        isGood = true;
        println("$foodName, $foodType, $isGood");
    }
    fun getFood(){
        println("$foodName,$foodType, $isGood");
    }

}

