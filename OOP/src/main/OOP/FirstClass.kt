package OOP

class Person {
    var name: String = "Sarah"
    var age: Int = 42

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth(): Int {
        return 2021 - 42
    }

    fun getYearOfBirth2() = 2021 - age
}

class Person2(var name: String, var age: Int) {
    var birthyear = 2021 - age
}

class Person3(name: String, age: Int) {
    var name: String
    var age: Int
    var birthYear = 2021 - age

    init {
        println("Object was created")
        this.name = name
        this.age = age
    }

    fun getYearOfBirth() = 2021 - age

}

class Book(var title: String, var author: String, var publicationYear: Int, var isborrowed: Boolean) {
    fun print() {
        println("The book title: $title, author: $author, publication year is $publicationYear")
    }

    // You do not necessarily need to return a Boolean.
    fun borrow(): Boolean {
        if (!isborrowed) {
            isborrowed = true
            return true
        } else {
            println("Sorry, the book is already borrowed.")
            return false;
        }
    }

    // You do not necessarily need to return a Boolean.
    fun returnBook(): Boolean {
        if (isborrowed) {
            isborrowed = false
            return true
            /*
            return if (isborrowed) {
            isborrowed = false
            true
             */
        } else {
            println("The book was not borrowed so it cannot be returned.")
            return false
        }
    }

}

fun main() {
    val book1 = Book("Little prince", "Exupery", 1960, true)
    book1.print()
    println("Is the book borrowed: " + book1.isborrowed)
    println()

    val book = Book("The One Thing", "Gary Keller", 2013, false)
    book.print()        // And print it out.
    book.returnBook()   // Does not work because we did not borrow it yet.
    book.borrow()       // Let's borrow it.
    book.borrow()       // We cannot borrow again without returning.
    book.returnBook()   // Let's return it.
    println()


    val person = Person()
    println(person.name)
    println(person.age)

    person.name = "Peter"
    println(person.name)

    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())
    println(person.getYearOfBirth2())

    val person2 = Person2("Jennie", 40)
    println(person2.name)
    println(person2.birthyear)

}