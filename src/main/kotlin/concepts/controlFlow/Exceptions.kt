package concepts.controlFlow

fun main(){
    try {
        throw Exception("Hi There!")
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("in finally block")
    }

}