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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        return result
    }
}