
fun main(){
    println("~~~School Grading System~~~\n")

    while(true){
    var choice: Char;
    println("A) List out Student's Grades.")
    println("B) Calculate the Average of Student's grades.")
    println("#) Exit the program.")
    print("Enter your choice: ")
    choice = readLine()!![0].lowercaseChar()

        if(choice == 'a') {
            val st = Student()
            st.printStudentsGrades()
        }
        if(choice == '#')
            break
    }
}