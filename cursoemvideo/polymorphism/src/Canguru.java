public class Canguru extends Mamifero{
    public Canguru(String nome, String membros, int idade, String corDoPelo) {
        super(nome, membros, idade, corDoPelo);
    }

    public String usarBolsa(){
        return "Usando bolsa";
    }

    @Override
    public String locomover() {
        return "Pulando";
    }
}
