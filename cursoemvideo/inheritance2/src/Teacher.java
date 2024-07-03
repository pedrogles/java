public class Teacher extends Person {
    private String specialty;
    private float salary;

    public Teacher(String name, int age, char sex, String specialty, float salary) {
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Methods
    public void encreanseSalary(float i) {
        salary += i;
    }
}
