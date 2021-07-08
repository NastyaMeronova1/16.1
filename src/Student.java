public class Student {
    private String fio;
    String phoneNumber;
    private boolean isPaid;

    public Student(String fio, String phoneNumber, boolean isPaid) {
        this.fio = fio;
        this.phoneNumber = phoneNumber;
        this.isPaid = isPaid;
    }
    void deleteStudentByPhone(String phone){

    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isPaid=" + isPaid +
                '}';
    }
}
