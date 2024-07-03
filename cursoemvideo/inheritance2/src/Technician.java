public class Technician extends Student{
    private int professionalRegister;

    public Technician(String name, int age, char sex, int enrollment, String course, int professionalRegister) {
        super(name, age, sex, enrollment, course);
        this.professionalRegister = professionalRegister;
    }

    public int getProfessionalRegister() {
        return professionalRegister;
    }

    public void setProfessionalRegister(int professionalRegister) {
        this.professionalRegister = professionalRegister;
    }

    public void pratice() {

    }
}