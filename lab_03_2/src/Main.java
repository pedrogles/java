import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ProductManager productManager = new ProductManager();
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
        System.out.println("= = = = Cadastro de Produtos = = = =");
        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();

        System.out.print("Digite o preço unitário do produto: ");
        float price = sc.nextFloat();
        sc.nextLine(); // Consome a nova linha

        System.out.print("Digite o tipo do produto: ");
        String type = sc.nextLine();

        System.out.print("Digite a quantidade no estoque: ");
        int quantity = sc.nextInt();
        sc.nextLine(); // Consome a nova linha

        Product product = new Product(name, price, type, quantity);
        productManager.addProduct(product);

        System.out.println(quantity + " \"" + name + "\" cadastrado(s) com sucesso.");
    }

    private static void sellProduct() {
        System.out.println("= = = = Venda de Produtos = = = =");
        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();

        Product product = productManager.findProductByName(name);
        if (product == null) {
            System.out.println("==> " + name + " não cadastrado no sistema.");
            return;
        }

        System.out.print("Digite a quantidade que deseja vender: ");
        int quantity = sc.nextInt();
        sc.nextLine(); // Consome a nova linha

        boolean success = productManager.sellProduct(name, quantity);
        if (success) {
            System.out.println("==> Total arrecadado: R$ " + (product.getPrice() * quantity));
        } else {
            System.out.println("Não é possível vender pois não há " + name + " suficiente.");
        }
    }

    private static void printBalance() {
        System.out.println("= = = = Impressao de Balanco = = = =");
        productManager.printProducts();
        System.out.println("Total arrecadado em vendas: R$ " + productManager.getTotalSales());
        System.out.println("Total que pode ser arrecadado: R$ " + productManager.getPotentialRevenue());
    }
}