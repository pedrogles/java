public class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Public Methods
    public void haveBirth() {
        this.age++;
    }
}
