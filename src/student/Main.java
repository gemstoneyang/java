package student;

public class Main {
    public static void main(String[] args) {
        Main func = new Main();
        Student[] student=null;
        student = func.addStudent();
        func.printStudents(student);
    }
    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "bennyws@naver.com");
        return student;
    }
    public void printStudents(Student[] students) {
        for(Student student:students) {
            System.out.println(student);
        }
    }
}