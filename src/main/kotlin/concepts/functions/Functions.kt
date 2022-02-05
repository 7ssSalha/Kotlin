package concepts.functions

import kotlin.math.sqrt

fun foo(
    a: Int = 0,
    b: Int = 1,
    c: () -> Unit,
) {
    println("a =$a")
    println("b =$b")
    println("c =$c")
}

fun printHello(name: String?) {//Unit
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    return
}

fun square(num:Int):Int = num*num
fun cube(num:Int) = num*num*num
fun squareRoot(num:Number) = sqrt(num.toDouble())

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun <T> printArrayList(elements: List<T>) {
    for(element in elements) print("$element ")
    println()
}

infix fun Int.add(num:Int): Int = this + num
infix fun Int.subtract(num:Int): Int = this - num

fun main(){
    foo(1) { println("hello") }
    foo(c = { println("hello") })
    foo { println("hello") }

    printHello("Sami")

    println(square(5))
    println(cube(6))
    println(squareRoot(2))

    val oddNumbers  = asList(1,3,5,7,9)
    val evenNumbers = intArrayOf(2,4,6,8)

    printArrayList(oddNumbers)
    printArrayList(asList(0,*evenNumbers.toTypedArray()))

    println(1 add 2)
    println(5 subtract 6)
}

