public class Reptil extends Animal{
    private String corDaEscama;

    public Reptil(String nome, String membros, int idade, String corDaEscama) {
        super(nome, membros, idade);
        this.corDaEscama = corDaEscama;
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    @Override
    public String locomover() {
        return "Andando q nem reptil";
    }

    @Override
    public String alimentar() {
        return "Mastigando";
    }

    @Override
    public String emitirSom() {
        return "RAN DAN DAN DAN DAN";
    }
}
