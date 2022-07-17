open class Animals(var legs: Int, var color: String) {
    fun eat(){
        println("Eating")
    }
    fun sleep(){
        println("Sleeping")
    }
    open fun sounds(){
        println("Sounding")
    }
}