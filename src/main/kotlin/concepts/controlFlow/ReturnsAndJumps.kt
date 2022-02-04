package concepts.controlFlow

fun fooWithoutLabel() {
    arrayOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        print("$it ")
    }
    println("this point is unreachable")
}

fun fooWithLabel() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        print("$it ")
    }
    print(" done with explicit label")
}
fun main(){
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            println("$i $j")
            if (i==5 && j==5) break@loop
        }
    }

    fooWithoutLabel()
    fooWithLabel()
}