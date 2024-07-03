import entities.Product;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        do {
            printMenu();
            option = sc.nextInt();
            sc.nextLine(); // Consome a nova linha

            switch (option) {
                case 1:
                    registerProduct();
                    break;
                case 2:
                    sellProduct();
                    break;
                case 3:
                    printBalance();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 4);
    }
    private static void printMenu() {
        System.out.println("= = = = Bem-vindo(a) ao EconomizaP2 = = = =");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Cadastrar um Produto");
        System.out.println("2 - Vender um Produto");
        System.out.println("3 - Imprimir Balanço");
        System.out.println("4 - Sair");
        System.out.print("Opção: ");
    }
    private static void registerProduct() {
        System.out.println("registro");

    }
    private static void sellProduct() {
        System.out.println("venda");

    }
    private static void printBalance() {
        System.out.println("balanço");

    }
}