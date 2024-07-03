public class Cachorro extends Mamifero{
    public Cachorro(String nome, String membros, int idade, String corDoPelo) {
        super(nome, membros, idade, corDoPelo);
    }

    public String enterrarOsso() {
        return "Enterrando osso";
    }
    @Override
    public String locomover() {
        return "Au au";
    }
}
