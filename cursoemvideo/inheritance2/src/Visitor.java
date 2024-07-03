public class Visitor extends Person {
    public Visitor(String name, int age, char sex) {
        super(name, age, sex);
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
