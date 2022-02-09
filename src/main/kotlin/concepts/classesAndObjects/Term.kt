package concepts.classesAndObjects

class Term(var coef:Double,var expo:Int) {
    override fun toString(): String {
        return "$coef * x ^ $expo "
    }
}