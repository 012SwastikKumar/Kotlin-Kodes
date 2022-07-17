//fun main(){
//
//    var arr = arrayOf(1,2,3,4,5)
//    try{
//        arr[5] = 6
//    }
//    catch (e1: ArrayIndexOutOfBoundsException){
//        println("There was some exception")
//    }
//    finally{
//        print(arr)
//    }
//}

fun main(){
    var nullVariable: String? = null        // ? is null seafty opreator used after data type for giving the null value it allows null values
    println(nullVariable?.length)             // !! non null asserted call
    println(nullVariable ?: "This is null")             // ?: elvis operator

    val nullList = listOf(1,2,null,4,null)
    println(nullList.filterNotNull())
}