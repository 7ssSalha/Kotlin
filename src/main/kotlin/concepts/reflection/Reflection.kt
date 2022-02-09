package concepts.reflection

fun isOdd(x: Int) = x % 2 != 0

fun divisibleBy3(x: Int) = x % 3 == 0

var x = 1
fun main() {
    val numbers = List(30) { it+1 }
    val predicate: (Int) -> Boolean = ::isOdd
    println(numbers)
    println(numbers.filter(predicate)) // same as numbers.filter(::isOdd)
    println(numbers.filter(::divisibleBy3))
    println(::x.name)
    println(::x.get())
    ::x.set(78)
    println(::x.get())

    val numberRegex = "\\d+".toRegex()
    val strings = listOf("abc", "124", "a70")
    println(strings.filter(numberRegex::matches))
}