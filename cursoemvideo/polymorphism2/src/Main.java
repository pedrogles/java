//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        Mamifero m = new Mamifero();

        System.out.println(l.emitirSom());
        System.out.println(c.emitirSom());
        System.out.println(m.emitirSom());

        System.out.println(c.reagir("oi"));
        System.out.println(c.reagir(4, 10));
        System.out.println(c.reagir(false));
        System.out.println(c.reagir(6, 7.5f));
    }
}