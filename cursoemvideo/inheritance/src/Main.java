//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Student("Pedro", 27, 'M', 22021, "SPI");
        people[1] = new Employee("Marcelo", 32, 'M', "Estoque");
        people[2] = new Teacher("Fabiana", 22, 'F', "Geografia", 2700);
        for (Person person : people) {
            System.out.println(person.status());
        }
    }
}