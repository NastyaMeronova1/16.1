public class Course {
    private int id;
    private String name;
    private int price;
    private Teacher teacher;
    private Student[] students;

    public Course(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void studentsAmount(int count) {
        this.students = new Student[count];
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }
        return false;
    }
    public boolean deleteStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
