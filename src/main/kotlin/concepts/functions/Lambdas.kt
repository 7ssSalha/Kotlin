package concepts.functions

fun main(){
    val items = listOf(1, 2, 3, 4, 5)

    // Lambdas are code blocks enclosed in curly braces.
    val res = items.fold(0) {
        // When a lambda has parameters, they go first, followed by '->'
        acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // The last expression in a lambda is considered the return value:
        result
    }

    println("res = $res")

    // Parameter types in a lambda are optional if they can be inferred:
    val joinedToString = items.fold("Elements:") {
            acc, i:Int ->
            println("in $i acc= $acc")
            "$acc $i"
    }

    // Function references can also be used for higher-order function calls:
    val product = items.fold(1, Int::times)

    println("joinedToString = $joinedToString")
    println("product = $product")

    val strings = arrayOf("abed","hussein","mohammed","Karem","Ahmad")
    strings.filter { it.length == 5 }.sortedBy { it }.map { it.uppercase() }.forEach { println(it) }

}