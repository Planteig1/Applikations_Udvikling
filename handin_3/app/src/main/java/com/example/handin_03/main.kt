package com.example.handin_03

import com.example.handin_03.exercise01.Article
import com.example.handin_03.exercise02.FastFood
import com.example.handin_03.exercise02.Pasta
import com.example.handin_03.exercise02.Pizza
import com.example.handin_03.exercise02.Sandwich
import com.example.handin_03.exercise03.Car
import com.example.handin_03.exercise04.RedditFrontPage
import com.example.handin_03.exercise04.RedditPost

fun main() {

    exercise01()

    exercise02()

    exercise03()

    exercise04()


    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")
    exercise05(words)
}


//1.
//Write a class: Article
//An article has an author and a title
//Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method

fun exercise01() {

    val article1: Article = Article("Henning","Borgmester besøger ukendt dansk by")
    val article2: Article = Article("Kenny","Lokalbefolking raser over denne ny øl")
    val article3: Article = Article("Henriette","Læger hader dette simple trick")
    val article4: Article = Article("Manny","Maccen sprang i luften")
    val article5: Article = Article("Jens","Jens kan godt lide baghaver")

    val listOfArticles: List<Article> = listOf(article1,article2,article3,article4,article5)

    listOfArticles.forEach {
        println(it)
    }
}

//2.
//Create an interface called FastFood (with appropriate methods)
//and create a Sandwich class, a Pizza class and a class you decide that implements the FastFood interface.
//Add some different Fastfood objects to an array. Now iterate through that array and use some of the methods you have created above.

fun exercise02() {

    val pasta: Pasta = Pasta("Carbonara", listOf("Cheese","Bacon","Egg","Pasta"),30)
    val sandwich: Sandwich = Sandwich("Big Mike", listOf("Bacon","Lettuce","Bread","Tomato"),15)
    val pizza: Pizza = Pizza("Margherita", listOf("Chesse","Pizza dough","Tomato sauces"),115,20)

    val listOfFastFoodItems: List<FastFood> = listOf(pasta,sandwich,pizza)

    listOfFastFoodItems.forEach {
        it.prepareFood()
        it.serveFood()
    }

}

// 3.
//Create a class that implements the following interface. Now create two objects using the class created
fun exercise03() {

    val car: Car = Car(7,210,"Red")
    car.speedUp(20)
    car.speedUp(20)
    car.speedUp(40)

    car.applyBrakes(20)
    car.changeGear(4)

}

//Write a class: RedditPost
// A Redditpost has : A date of which is has been posted An author balance of upvotes / downvotes, A Title
//When a new instance of RedditPost is instantiated:
//The current date will be generated.
//The balance of upvotes and downvotes starts at 1.
//The title and author has to be provided by the constructor.
//Ensure all attributes are private, but accesible by getters & setters.
//Implement functionality such that redditposts can be sorted by upvotes/downvotes

//Write a class: RedditFrontPage
//The RedditFrontPage has:
//A List of all RedditPosts
//A method in RedditFrontPage deletes a RedditPost from the list, by its index number

fun exercise04() {

    val redditPost1: RedditPost = RedditPost("Hello my first post","Planteig")
    val redditPost2: RedditPost = RedditPost("Hello my second post","Planteig")
    val redditPost3: RedditPost = RedditPost("Hello my third post","Planteig")
    val redditPost4: RedditPost = RedditPost("Hello my fourth post","Planteig")

    redditPost1.addLike()
    redditPost1.addLike()

    redditPost2.addLike()

    redditPost3.addLike()
    redditPost3.addLike()
    redditPost3.addLike()

    redditPost4.addLike()

    val listOfRedditPost: List<RedditPost> = listOf(redditPost1,redditPost2,redditPost3,redditPost4)

    println(listOfRedditPost.sorted().reversed()) // Highest -> lowest
    println(listOfRedditPost.sorted()) // Lowest -> Highest
    val mutableListOfRedditPost: MutableList<RedditPost> = mutableListOf(redditPost1,redditPost2,redditPost3,redditPost4)
    val frontPageReddit: RedditFrontPage = RedditFrontPage(mutableListOfRedditPost)

    frontPageReddit.showAllPost()
    println("----")
    frontPageReddit.removeRedditPost(2) // 3rd post
    frontPageReddit.showAllPost()


}


//Write a program that takes a list of words as input and prints the frequency of each word.
//Hint: Use a MutableMap
fun exercise05(listOfWords: List<String>) {

    val frequencyOfWordMap = mutableMapOf<String, Int>()

    for (word in listOfWords) {
        if (frequencyOfWordMap[word] == null) {
            frequencyOfWordMap[word] = 1
        } else {
            frequencyOfWordMap[word] = frequencyOfWordMap[word]!! + 1
        }
    }

    println(frequencyOfWordMap)
}
