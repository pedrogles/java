public class Mamifero extends Animal{
    private String corDoPelo;

    public Mamifero(String nome, String membros, int idade, String corDoPelo) {
        super(nome, membros, idade);
        this.corDoPelo = corDoPelo;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public String locomover() {
        return "Correndo";
    }

    @Override
    public String alimentar() {
        return "Comendo";
    }

    @Override
    public String emitirSom() {
        return "FAAAALA PIPOOOOCA";
    }
}
