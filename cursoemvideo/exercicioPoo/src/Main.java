//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Pedro", 27, 'M');
        Book b = new Book("As Panterinhas", "Manuel Gomes", 230, p);
        b.open();
        b.leafThrough(229);
        b.nextPage();
        b.close();

        System.out.println(b.details());
    }
}