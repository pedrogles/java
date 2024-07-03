public class Tartaruga extends Reptil{
    public Tartaruga(String nome, String membros, int idade, String corDaEscama) {
        super(nome, membros, idade, corDaEscama);
    }

    @Override
    public String locomover() {
        return "Rastejando";
    }
}
