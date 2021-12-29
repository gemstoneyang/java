package student;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent func = new ManageStudent();
        // Student[] student=null;
        // student = func.addStudent();
        // func.printStudents(student);
        
        func.checkEquals();
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
    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        
        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}