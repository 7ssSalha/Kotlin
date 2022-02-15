package standardLibrary

data class Student(val name:String, val birthYear:Int, var grade:Int)

fun <T> List<T>.printList(){
    print("[")
    this.forEach{
        if (this.last() != it)
            println(it)
        else
            println("$it]")
    }
}

fun main(){
    val studentsInSchool1 = listOf(
        Student("jack",2010,1),
        Student("Bob",2007,7),
        Student("Jorge",2015,3)
    )
    studentsInSchool1.printList()
    // all students go to the next grade
    studentsInSchool1.map { it.grade = it.grade + 1  }
    println("After one year all students go to next grade so the list will be:")
    studentsInSchool1.printList()

    println()

    val studentsInSchool2 = listOf(
        Student("rose",2009,2),
        Student("haley",2017,5),
        Student("sasha",2019,10)
    )

    val students = listOf(studentsInSchool1,studentsInSchool2) // list of two lists
    //to make it one list contain all the students not in two lists
    val allStudents = students.flatten() // same as students.flatMap { it }
    allStudents.printList()
}