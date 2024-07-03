public class Teacher extends Person {
    public String specialty;
    public int salary;

    public Teacher(String name, int age, char sex, String specialty, int salary) {
        super(name, age, sex);
        this.specialty = specialty;
        this.salary = salary;
    }

    // Getters and Setters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getRemuneration() {
        return salary;
    }

    public void setRemuneration(int remuneration) {
        this.salary = remuneration;
    }

    // Methods
    public void increanseSalary(int i) {
        this.salary += i;
    }
}
