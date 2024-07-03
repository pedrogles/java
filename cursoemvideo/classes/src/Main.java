import entities.Musica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica("Black in black", 2000, "pop");

        System.out.println("nome: " + m1.getNome());
        System.out.println("tempo: " + m1.getTempo());
        System.out.println("genero: " + m1.getGenero());

        m1.setNome("Melino");

        System.out.println("novo nome:" + m1.getNome());
    }
}