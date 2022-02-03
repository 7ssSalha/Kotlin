fun main(){
    val list = listOf(2,5,-4,4,-9,1)

    val positives = list.filter { it > 0 }

    val negatives = list.filter { num -> num < 0 }

    println("positives : $positives")

    println("negatives : $negatives")

    if (-9 in negatives){
        println("-9 is in negatives")
    }
    if (-8 !in negatives)
        println("-8 is not in negatives")
}