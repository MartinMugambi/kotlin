package com.example.practice;

class User constructor(var firstName: String, var lastName: String){
    companion object{
        var user = mutableListOf<User>();
        fun getList(count: Int): List<User>{
            for (i in 0 ..count){
                user.add(User("fristNamec$i", "Mwenda $i"))
            }
            return user;
        }

    }
}