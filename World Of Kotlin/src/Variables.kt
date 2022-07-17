fun main() {
    // Write your code here
    var a: Double = 20.0        // explicitly defined data type     mutable
    val b = true                // undersood by own                 immutable
    val c = 1.4f                // for floating numbers used f      immutable
    val d = "Hello"             // Strings in double quotes         immutable
    val x: String = "New String"
    var e = 'z'                 // Charachters in single quote      mutable

    a = 20.8                    // value of var can be muted
    e = 'v'                     // value of var can be muted

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
}