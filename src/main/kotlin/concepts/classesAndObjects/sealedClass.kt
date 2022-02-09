package concepts.classesAndObjects

sealed class Student{
    val fees:Int
        get() = when(this){
            is SchoolStudent -> 500
            is CollegeStudent -> 1000
            is KgStudent -> 250
        }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}

class SchoolStudent :Student()
class CollegeStudent :Student()
class KgStudent :Student()

fun main()
{
    val student1 = SchoolStudent()
    val student2 = CollegeStudent()
    val student3 = KgStudent()
    println("School Student fees:")
    println(student1.fees)
    println("College Student fees:")
    println(student2.fees)
    println("KgS Student fees:")
    println(student3.fees)
    println(student1.equals(student2))
}
