fun main(){
    val listOfStrings = listOf("Hello", "World");           // immutable
    val listOfStrings1 = mutableListOf("Hi","Namaste")      // mutable
    listOfStrings1[0] = "helloxxx"
    listOfStrings1.add("Kya haaal")
    listOfStrings1.add(2,"Kya haaal at 2")
    listOfStrings1.removeAt(3)
    val arr = arrayOf("jkkl","lopi")
    listOfStrings1.addAll(arr)
    println(listOfStrings)
    println(listOfStrings1)
}