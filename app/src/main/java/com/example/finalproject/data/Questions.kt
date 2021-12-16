package com.example.finalproject.data

import com.example.finalproject.model.QuestionModel

object Questions {
    private val questionsArray: ArrayList<QuestionModel> = ArrayList()
    private val questionsText: ArrayList<String> = ArrayList()
    private val choice1: ArrayList<String> = ArrayList()
    private val choice2: ArrayList<String> = ArrayList()
    private val choice3: ArrayList<String> = ArrayList()
    private val choice4: ArrayList<String> = ArrayList()
    private val answers: ArrayList<Int> = ArrayList()

    fun getQuestionsByLevel(questionsLevel: Int): ArrayList<QuestionModel> {
        getLevelOneData()
        return questionsArray
    }

    private fun getLevelOneData() {
        setDataInArrays()
         for (i in 0.. questionsText.size){
            questionsArray.add(
                QuestionModel(
                    i,
                    questionsText[i],
                    choice1[i],
                    choice2[i],
                    choice3[i],
                    choice4[i],
                    answers[i]
                )
            )
        }
    }
    private fun setDataInArrays(){
        questionsText.add("How to get a response from an activity in Android?")
        choice1.add("startActivityToResult()")
        choice2.add("startActivityForResult()")
        choice3.add("Bundle()")
        choice4.add("None of the above")

        questionsText.add("How to get a response from an activity in Android?")
        choice1.add("startActivityToResult()")
        choice2.add("startActivityForResult()")
        choice3.add("Bundle()")
        choice4.add("None of the above")

        questionsText.add("How to get a response from an activity in Android?")
        choice1.add("startActivityToResult()")
        choice2.add("startActivityForResult()")
        choice3.add("Bundle()")
        choice4.add("None of the above")

        questionsText.add("How to get a response from an activity in Android?")
        choice1.add("startActivityToResult()")
        choice2.add("startActivityForResult()")
        choice3.add("Bundle()")
        choice4.add("None of the above")

        questionsText.add("How to get a response from an activity in Android?")
        choice1.add("startActivityToResult()")
        choice2.add("startActivityForResult()")
        choice3.add("Bundle()")
        choice4.add("None of the above")

        questionsText.add("How to get a response from an activity in Android?")
        choice1.add("startActivityToResult()")
        choice2.add("startActivityForResult()")
        choice3.add("Bundle()")
        choice4.add("None of the above")

        questionsText.add("How to get a response from an activity in Android?")
        choice1.add("startActivityToResult()")
        choice2.add("startActivityForResult()")
        choice3.add("Bundle()")
        choice4.add("None of the above")


    }
}