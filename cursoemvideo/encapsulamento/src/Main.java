import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControleRemoto c = new ControleRemoto();
        int option;
        do {
            c.userInterface();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    c.ligar();
                    break;
                case 2:
                    c.menu();
                    break;
                case 3:
                    c.aumentarVolume();
                    break;
                case 4:
                    c.diminuirVolume();
                    break;
                case 5:
                    c.mudo();
                    break;
                case 6:
                    c.playPause();
                    break;
                case 7:
                    c.desligar();
                    break;
            }
        } while (option != 7);

    }
}