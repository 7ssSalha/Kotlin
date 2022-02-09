package concepts.classesAndObjects

infix fun Double.inverseOf(num:Double):Boolean = this * -1 == num

class Polynomial(private val terms: MutableList<Term>) {
    fun addTerm(newTerm : Term){

        val term = terms.find { term -> term.expo == newTerm.expo }

        if(term is Term && term.coef inverseOf newTerm.coef) {
            terms.remove(term)
            println("removing the term")
        }
        else if (term is Term){
            terms[terms.indexOf(term)]=Term(term.coef + newTerm.coef,term.expo)
        }
        else{
            terms.add(newTerm)
            println("new term added")
        }
    }

    fun numberOfTerms():Int = terms.size

    override fun toString(): String {
        return terms.toString()
    }
}

fun main(){
    val poly = Polynomial(mutableListOf(Term(1.0,1),Term(2.0,2)))
    println(poly)
    poly.addTerm(Term(3.0,3))
    println(poly)
    poly.addTerm(Term(-2.0,2))
    println(poly)
    poly.addTerm(Term(-7.0,3))
    println(poly)
}