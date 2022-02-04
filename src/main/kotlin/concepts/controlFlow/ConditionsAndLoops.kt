package concepts.controlFlow

import kotlin.random.Random

fun main(){
    val whatDay: String =  when(Day.values()[Random.nextInt(Day.values().size)]){
        Day.Saturday ->"saturday"
        Day.Sunday   ->"sunday"
        Day.Monday   ->"monday"
        Day.Tuesday  ->"tuesday"
        Day.Wednesday->"wednesday"
        Day.Thursday ->"thursday"
        Day.Friday   ->"friday"
    }//no need for else because we covered all possible cases
    println(whatDay)

}