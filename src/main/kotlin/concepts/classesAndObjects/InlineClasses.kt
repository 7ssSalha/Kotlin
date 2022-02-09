package concepts.classesAndObjects

@JvmInline
value class Name(private val s: String):Printable {
    init {
        require(s.isNotEmpty()) { }
    }

    val length: Int
        get() = s.length

    fun greet() =println("Hello, $s")


    override fun prettyPrint(): String ="hello from pretty Print, $s"
}

interface Printable {
    fun prettyPrint(): String
}

typealias NameTypeAlias = String

@JvmInline
value class NameInlineClass(val s: String)

fun acceptString(s: String) {}
fun acceptNameTypeAlias(n: NameTypeAlias) {}
fun acceptNameInlineClass(p: NameInlineClass) {}

fun main() {
    val name1 = Name("Kotlin")
    name1.greet()
    println(name1.length)
    println(name1.prettyPrint())

    val name2 = Name("Java")

    //if(name1 === name2) /// === (identity equality is forbidden)

    //Inline classes vs type aliases
    val nameAlias: NameTypeAlias = ""
    val nameInlineClass: NameInlineClass = NameInlineClass("")
    val string: String = ""

    acceptString(nameAlias) // OK: pass alias instead of underlying type

    // type mismatch
    // acceptString(nameInlineClass) // Not OK: can't pass inline class instead of underlying type

    // And vice versa:
    acceptNameTypeAlias(string) // OK: pass underlying type instead of alias
    acceptNameInlineClass(nameInlineClass)
    //Type mismatch
    // acceptNameInlineClass(string) // Not OK: can't pass underlying type instead of inline class
}
