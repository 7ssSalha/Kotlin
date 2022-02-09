package concepts.classesAndObjects

data class Movie(val name:String,val studio:String,var rating:Float){

    internal var director: String? = null
    // toString ,equals ,hashCode , componentN already implemented
}

class Series(private val name: String,private val platform:String,private var rating: Float){

    private var isEnded: Boolean = false

    fun endSeries(){
        isEnded = true
    }

    fun seriesStatus():Boolean{
        return isEnded
    }

    override fun toString(): String {
        return "Series(name = $name, platform = $platform , rating = $rating)"
    }
}

fun main(){
    val deadpool2 = Movie("Deadpool 2","20th Century Fox",7.7f)
    println(deadpool2)
    deadpool2.director = "David Leisch"
    println(deadpool2.director)

    val deadpool = Movie("Deadpool",deadpool2.component2(), 8F)
    println(deadpool)
    if(deadpool.director is String)
        println(deadpool.director)

    if (deadpool.equals(deadpool2))
        println("same movie")
    else
        println("different movies")

    val theWitcher = Series("The Witcher","Netflix",8.2F)
    println(theWitcher.toString())
    println(theWitcher.seriesStatus())

    if(theWitcher.seriesStatus())
        theWitcher.endSeries()
    else
        println("there's another season coming up")

    val lucifer = Series("Lucifer","Netflix",8.1f).also { it.endSeries() }

    println(lucifer.equals(theWitcher))

    if (lucifer.equals(theWitcher)){
        println("same series")
    }
    else{
        println("different")
    }

    val luciStatus: String = if (lucifer.seriesStatus()) "Ended" else "notEnded"
    println("lucifer status = $luciStatus")

}