package standardLibrary


class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun shuffle() = elements.shuffle()

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main(){
    val list = listOf(
        1,
        7,
        1,
        2,
        3,
    )
    list.forEach { println(it) }

    val stack = MutableStack("ahmad", "ameer", "rami", "sameera").apply { println(toString()) }

    stack.shuffle()

    if (stack.isEmpty()) {
        println("Empty Stack")
    } else {
        println(stack.toString())
    }

    stack.pop()

    if (stack.size() >2) stack.push("jack") else stack.pop()

    println(stack.peek())

    val listA = List(4){it*4}
    println(listA.toString())

}