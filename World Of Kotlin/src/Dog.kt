//class Dog {
//    var breed: String = "Labra"
//    var color: String = "Broen"
//    var age: Int = 6
//
//    fun bark(){
//        println("${breed} is barknig")
//    }
//    fun eat(){
//        println("${breed} is eating")
//    }
//}
//
//fun main(){
//    val d1 = Dog()
//
//    d1.breed = "German"
//    d1.color = "Black"
//
//    d1.eat()
//    d1.bark()
//}

//class Dog(breed: String, color: String, age: Int) { // primary constructor variables
//    // member variables
//    var breed: String
//    var color: String
//    var age: Int
//
//    init{
//        this.breed = breed
//        this.color = color
//        this.age = age
//    }
//
//    fun bark(){
//        println("${breed} is barknig")
//    }
//    fun eat(){
//        println("${breed} is eating")
//    }
//}

//class Dog(breed: String, color: String, age: Int) { // primary constructor variables
//    // member variables
//    var breed: String = breed
//    var color: String = color
//    var age: Int = age
//
//    fun bark(){
//        println("${breed} is barknig")
//    }
//    fun eat(){
//        println("${breed} is eating")
//    }
//}

class Dog(var breed: String, var color: String, var age: Int) { // primary constructor variables
    fun bark(){
        println("${breed} is barknig")
    }
    fun eat(){
        println("${breed} is eating")
    }
}

fun main(){
    val d1 = Dog("labra","brown",6)
    val d2 = Dog("German","black",8)
    d1.eat()
    d1.bark()
    d2.eat()
    d2.bark()
}




//Secondary Constructors
//class Dog {
//    var breed: String
//    var color: String
//    var age: Int
//
//    constructor(breed: String, color: String, age: Int){
//        this.breed=breed;
//        this.color=color
//        this.age=age
//    }
//    fun bark(){
//        println("${breed} is barknig")
//    }
//    fun eat(){
//        println("${breed} is eating")
//    }
//}


//class Dog(var breed: String, var color: String, var age: Int) { // primary + secondary constructor variables
//
//    var name: String? = null
//
//    constructor(breed: String, color: String, age: Int, name: String):this(breed,color,age){
//        this.name = name
//    }
//
//    fun bark(){
//        println("${breed} is barknig")
//    }
//    fun eat(){
//        println("${breed} is eating")
//    }
//}
//
//fun main(){
//    val d1 = Dog("labra","brown",6)
//    val d2 = Dog("German","blavk",8,"Sheru")
//}


// Data class is used to store only data not having any functionalities and data keyword is used before class keyword