public class StudentObject
{
    static class Student
    {
        int rollno;
        String name;
        int marks;
    }

        // Make the main method static and include it in the main class
        public static void main(String[] args)
        {
            // Create instances of Student
            Student s1 = new Student();
            s1.rollno = 1;
            s1.name = "ram";
            s1.marks = 99;

            Student s2 = new Student();
            s2.rollno = 2;
            s2.name = "sita";
            s2.marks = 88;

            Student s3 = new Student();
            s3.rollno = 3;
            s3.name = "raj";
            s3.marks = 77;

            // Create an array of Student
            Student[] students = new Student[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;

            // Print student information
            for (Student student : students) {
                System.out.println(student.name + " : " + student.marks);
            }

            // Alternatively, using a traditional for loop
             // for(int i = 0; i < students.length; i++){
            //  System.out.println(students[i].name + " : " + students[i].marks);}

        }
}


