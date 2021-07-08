public class Main {

    public static void main(String[] args) {
        Student harryPotter = new Student("Harry Potter", "+996555123456", true);
        Student hermione = new Student("Hermione", "+996555123457", true);
        Student ronWisley = new Student("Ron Weasley", "+996555123458", false);
        Student malfoy = new Student("Draco Malfoy", "+996554132398", true);
        Student dumbledore = new Student("Albus Dumbledore", "+996558651249", false);

        Course transfiguration = new Course(1, "Transfiguration", 10);

        Teacher teacher = new Teacher("Minerva McGonagall", 1000);

        transfiguration.setTeacher(teacher);

        transfiguration.studentsAmount(10);
        transfiguration.addStudent(harryPotter);
        transfiguration.addStudent(hermione);
        transfiguration.addStudent(ronWisley);
        transfiguration.addStudent(malfoy);
        transfiguration.addStudent(dumbledore);
        transfiguration.deleteStudent(harryPotter);
        transfiguration.deleteStudent(malfoy);

        System.out.println(teacher.getFio());
        System.out.println(transfiguration.getName());
    }
}
