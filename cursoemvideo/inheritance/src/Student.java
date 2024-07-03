public class Student extends Person {
    private int enrollment;
    private String course;

    public Student(String name, int age, char sex, int enrollment, String course) {
        super(name, age, sex);
        this.enrollment = enrollment;
        this.course = course;
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

    // Methods
    public void cancelEnrollment() {

    }
}
