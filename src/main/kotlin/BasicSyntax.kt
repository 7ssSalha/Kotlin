open class Shape
class Rectangle(height: Double, length: Double) : Shape() {
    val perimeter = (height + length) * 2
    val area = height*length
}
class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}
fun main() {

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
    println("the area is ${rectangle.area}")

    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }



    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    val jack = Person("jack")

    sophia likes claudia
    sophia likes jack

    for (person in sophia.likedPeople)
        println(person.name)
}