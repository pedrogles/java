//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero("Joca", "Bro", 21, "Rosa");
        Peixe p = new Peixe("Ma", "Nu", 12);
        Reptil r = new Reptil("Bra", "No", 54, "Verde");
        Ave a = new Ave("Co", "Na", 54, "Azul");
        Canguru c = new Canguru("De", "Bo", 54, "Cinza");
        Cachorro e = new Cachorro("Lo", "Va", 23, "Po");
        Cobra d = new Cobra("Flu", "Ma", 65, "Ve");
        Tartaruga t = new Tartaruga("Bi", "Ti", 64, "Lo");
        PeixeDourado pd = new PeixeDourado("de", "df", 53);
        Arara f = new Arara("df", "df", 423, "dfl");

        System.out.println(c.locomover());
        System.out.println(c.alimentar());
        System.out.println(c.emitirSom());
        System.out.println(e.locomover());
        System.out.println(e.alimentar());
        System.out.println(e.emitirSom());
        System.out.println(d.locomover());
        System.out.println(d.alimentar());
        System.out.println(d.emitirSom());
        System.out.println(t.locomover());
        System.out.println(t.alimentar());
        System.out.println(t.emitirSom());
        System.out.println(pd.locomover());
        System.out.println(pd.alimentar());
        System.out.println(pd.emitirSom());
        System.out.println(f.locomover());
        System.out.println(f.alimentar());
        System.out.println(f.emitirSom());
    }
}