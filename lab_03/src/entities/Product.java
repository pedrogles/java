package entities;

public class Product {
    private String name;
    private float price;
    private String type;
    public Product(String name, float price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    };

    public void getProduct() {
        System.out.println("Nome: " + this.name);
        System.out.println("Preço: " + this.price);
        System.out.println("Tipo: " + this.type);
    }

    public Object getName() {
        System.out.println(this.name);
        return null;
    }
};
