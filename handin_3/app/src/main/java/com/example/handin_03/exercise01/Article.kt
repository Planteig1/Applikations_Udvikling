package com.example.handin_03.exercise01

//1.
//Write a class: Article
//An article has an author and a title
//Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method

class Article(val author: String, val title: String) {

    override fun toString(): String {
        return "$title - by $author"
    }
}