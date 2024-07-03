public class Student extends Person {
    protected int enrollment;
    protected String course;
    protected boolean monthlyPayment;

    public Student(String name, int age, char sex, int enrollment, String course) {
        super(name, age, sex);
        this.enrollment = enrollment;
        this.course = course;
        this.monthlyPayment = false;
    }

    // Getters and Setters
    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(boolean monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    // Methods
    public String payMonthlyFree() {
        setMonthlyPayment(true);
        return "Pago";
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", enrollment=" + enrollment +
                ", course='" + course + '\'' +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}
