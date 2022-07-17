fun main(){
    val a: Int = 5
    val b: Int = 3
//    val c = if(a>b){
//        a
//    }
//    else{
//        b
//    }
//    println(c);

//    val num: Int = 3
//    when(num){
//        0 -> println("Zero")
//        1 -> println("One")
//        2 -> println("Two")
//        3 -> println("Three")
//        4 -> println("Four")
//        else -> println("greater than 4 or less than 0")
//    }

    val num: Int = 10;
    when(num){
        in 1..10 -> println("Range 1-10")
        in 10..20 -> println("Range 11-20")
        else -> println("Greater than 20")
    }
}