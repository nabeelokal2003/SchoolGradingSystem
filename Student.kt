class Student {
    val student_names = arrayOf("Jack", "Jacob", "John")
    val student_grades = arrayOf(76, 84, 90)

    fun printStudentsGrades(){
        println("Here is the List: ")
        for((student, grade) in student_names.zip(student_grades))
            println("$student -> $grade")
    }
}