public class Student{
    private String name;
    private int grade;
    private static int numStudents = 0;

    public Student(String name, int grade){
        name = this.name;
        grade = this.grade;
        numStudents++;
    }
    
    public String getName(){
        return name;
    }
    
    public int getGrade(){
        return grade;
    }

    public int getNumStudents(){
        return numStudents;
    }
}
