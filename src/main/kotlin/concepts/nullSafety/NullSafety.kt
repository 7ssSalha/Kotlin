package concepts.nullSafety

fun main(){
    var a: String = "abc"
    // a= null //error
    var b: String? = "abc"
    b = null
    println(b)

    var l = a.length
    println(l)

    b="abc"
    l = b.length
    println(l)
    // but b could be null so this is a better approach
    l = if (b != null) b.length else -1
    println(l)

    //Safe calls
    val aa = "Kotlin"
    val bb: String? = null
    println(bb?.length)
    println(aa?.length) // Unnecessary safe call could be done with aa.length

    val listWithNulls:List<String?> = listOf("Kotlin",null,"java","c++",null,null)
    for(element in listWithNulls){
        element?.let { println(it) }
    }

    //Elvis operator

    // instead of this
    // l = if (b != null) b.length else -1
    //we can use this
    val len = b?.length ?: -1
    println(len)

    try {
        var bString: String? = null
        var l = bString!!.length
        println(l)

    }catch (e:Exception){
        e.printStackTrace()
    }
}