public class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    // Methods
    public void haveBirth() {
        this.age++;
    }

    public String status() {
        return "--------- Status ---------" + "\n" +
                "Nome: " + this.name + "\n" +
                "Idade: " + this.age + "\n" +
                "Sexo: " + this.sex;
    }
}
