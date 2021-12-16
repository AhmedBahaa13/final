package com.example.finalproject.model

data class QuestionModel(
    var id:Int,
    var question: String,
    var choice1: String,
    var choice2: String,
    var choice3: String,
    var choice4: String,
    var answer: Int
)