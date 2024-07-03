//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[5];
        lutadores[0] = new Lutador("Joca Pereira", "Basileira",
                32, 1.94f, 92.21f, 10, 2, 2);
        lutadores[1] = new Lutador("Marcos Leopoldo", "Austriaca",
                25, 1.62f, 75f, 9, 2, 3);
        lutadores[2] = new Lutador("Felipe Marcelo", "Romena",
                19, 1.74f, 87.4f, 8, 2, 4);
        lutadores[3] = new Lutador("Juininho Crocodilo", "Americana",
                27, 1.86f, 98.45f, 12, 1, 1);
        lutadores[4] = new Lutador("Moises Pneus", "Basileira",
                22, 1.79f, 73.1f, 14, 0, 0);

        Luta luta = new Luta();
        System.out.println(luta.marcarLuta(lutadores[1], lutadores[4]));
        System.out.println(luta.lutar());
    }
}