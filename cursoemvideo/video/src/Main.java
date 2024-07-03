//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Pedro", 21, 'M', "Pepo");
        Video v = new Video("Java POO");
        Video v2 = new Video("Java Básico");
        Visualizacao vv = new Visualizacao(u, v);
        Visualizacao vv2 = new Visualizacao(u, v2);
        vv2.avaliar(8.6f);
        v.like();
        System.out.println(u.toString());
        System.out.println(v.toString());

    }
}