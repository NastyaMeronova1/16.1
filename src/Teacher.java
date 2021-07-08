public class Teacher {
    private String fio;
    private int salary;

    public Teacher(String fio, int salary) {
        this.fio = fio;
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
