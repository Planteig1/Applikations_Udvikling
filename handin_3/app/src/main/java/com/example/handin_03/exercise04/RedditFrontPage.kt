package com.example.handin_03.exercise04

class RedditFrontPage( var listOfPost: MutableList<RedditPost>) {

    fun removeRedditPost(indexNumber: Int) {
        listOfPost.removeAt(indexNumber)
    }

    fun showAllPost() {
        listOfPost.forEach {
            println(it)
        }
    }
}