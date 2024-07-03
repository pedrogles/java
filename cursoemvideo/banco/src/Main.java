//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount();
        c1.createAccount("CC");
        c1.deposit(91);
        System.out.println(c1.accountData());
    }
}