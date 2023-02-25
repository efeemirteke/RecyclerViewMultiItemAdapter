package com.example.recyclerviewmultiitemadapter

object LanguagesObject {
    var LanguageArrayList=ArrayList<isAndroid>()
    fun verileriYerlestir():ArrayList<isAndroid>{
        val java = isAndroid("Java", R.drawable.javaicon, true)
        val python = isAndroid("Python", R.drawable.python, false)
        val kotlin = isAndroid("Kotlin", R.drawable.kotlinicon, true)
        val Swift = isAndroid("Swift", R.drawable.swiftimg, false)
        val Flutter = isAndroid("Flutter", R.drawable.flutter, true)
        val SQL=isAndroid("SQL",R.drawable.sql,false)
        val cPlusPlus = isAndroid("C++", R.drawable.cplusplus, true)
        val Html=isAndroid("HTML",R.drawable.html,false)
        val css=isAndroid("CSS",R.drawable.css,false)
        val js=isAndroid("JavaScript",R.drawable.js,false)
        val languageArray = arrayOf(java, python, kotlin,Swift,cPlusPlus,SQL,Html,Flutter,css,js)
        for(i in languageArray){
            LanguageArrayList.add(i)
        }
        return LanguageArrayList
    }
}