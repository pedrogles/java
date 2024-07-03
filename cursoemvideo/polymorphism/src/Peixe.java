public class Peixe extends Animal{

    public Peixe(String nome, String membros, int idade) {
        super(nome, membros, idade);
    }

    public String soltarBolha() {
        return "Blublu";
    }
    @Override
    public String locomover() {
        return "Nadando";
    }

    @Override
    public String alimentar() {
        return "blublublu";
    }

    @Override
    public String emitirSom() {
        return "ME SOLTA QUE EU QUERO CAGAR";
    }
}
