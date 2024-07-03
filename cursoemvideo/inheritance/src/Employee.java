public class Employee extends Person{
    private String section;
    private boolean working;

    public Employee(String name, int age, char sex, String section) {
        super(name, age, sex);
        this.section = section;
        this.working = false;

    }

    // Getters and Setters
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    // Methods
    public void changeWork() {

    }
}
