//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Marcos", 13, 'M', 1221, "Firula");
        ScholarshipHolder sh = new ScholarshipHolder("Fifi", 15, 'F', 1222, "Papaia", 23.4f);
        Visitor v = new Visitor("Popo", 54, 'M');
        System.out.println(s);
        System.out.println(sh);
        System.out.println(v);
    }
}