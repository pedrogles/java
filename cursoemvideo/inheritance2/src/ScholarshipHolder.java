public class ScholarshipHolder extends Student{
    private float scholarship;

    public ScholarshipHolder(String name, int age, char sex, int enrollment, String course, float scholarship) {
        super(name, age, sex, enrollment, course);
        this.scholarship = scholarship;
    }

    public void renewScholarship() {

    }

    @Override
    public String payMonthlyFree() {
        setMonthlyPayment(true);
        return "Pago, bolsista";
    }

    @Override
    public String toString() {
        return "ScholarshipHolder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", scholarship=" + scholarship + "%" +
                ", enrollment=" + enrollment +
                ", course='" + course + '\'' +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}
