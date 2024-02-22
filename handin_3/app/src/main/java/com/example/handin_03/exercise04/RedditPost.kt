package com.example.handin_03.exercise04

import java.text.SimpleDateFormat
import java.util.Date

class RedditPost(private var title: String, private val author: String) : Comparable<RedditPost> {
    private var timestamp: String = ""
    private var likes: Int = 1

    init {
        val sdf = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
        timestamp = sdf.format(Date())
    }

    fun addLike() {
        likes ++
    }

    fun removeLike() {
        likes --
    }

    override fun compareTo(other: RedditPost): Int {
        return this.likes - other.likes
    }

    override fun toString(): String {
        return "$title by $author"
    }
}
