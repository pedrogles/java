import java.util.Objects;

public class BankAccount {
    private int account;
    private String type;
    private String owner;
    private float balance;
    private boolean status;

    public BankAccount() {
        this.balance = 0;
        this.status = false;
    }

    // Getters and Setters

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Other methods

    public void createAccount(String type) {
        setType(type);
        setStatus(true);
        if(Objects.equals(type, "CC")){
            setBalance(50);
        }
        else if(Objects.equals(type, "CP")){
            setBalance(150);
        }
    }

    public String deleteAccount() {
        if(balance > 0){
            return "Retire todo o dinheiro da conta para fecha-la.";
        }
        else if (balance < 0) {
            return "Quite suas dividas para conseguir fechar a conta.";
        }
        else {
            setStatus(false);
            return "Conta deletada com sucesso!";
        }
    }

    public String deposit(float value) {
        if(isStatus()) {
            setBalance(getBalance() + value);
            return "Deposito realizado com sucesso.";
        }
        return "Erro no deposito";
    }

    public String withdraw(float value) {
        if(isStatus()) {
            if(getBalance() > value) {
                setBalance(getBalance() - value);
                return "Saque realizado com sucesso!";
            } else return "Saldo insuficiente";
        }
        return "Impossivel sacar";
    }

    public String monthlyPayment() {
        int t = 0;
        if(Objects.equals(type, "CC")) {
            t = 12;
        } else if(Objects.equals(type, "CP")) {
            t = 20;
        }
        if(isStatus()) {
            if(getBalance() > t) {
                setBalance(getBalance() - t);
                return "Pagamento realizado com sucesso";
            } else return "Saldo insuficiente";
        } else return "Impossivel pagar";
    }

    public String accountData() {
        System.out.println("Numero da conta: " + account);
        System.out.println("Tipo da conta: " + type);
        System.out.println("Dono da conta: " + owner);
        System.out.println("Saldo da conta: " + balance);
        System.out.println("Status da conta: " + status);
        return "";
    }
}
