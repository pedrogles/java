public class Ave extends Animal{
    public String corDaPena;

    public Ave(String nome, String membros, int idade, String corDaPena) {
        super(nome, membros, idade);
        this.corDaPena = corDaPena;
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
    public String fazerNinho() {
        return "Fazendo ninho";
    }
    @Override
    public String locomover() {
        return "Voando";
    }

    @Override
    public String alimentar() {
        return "NhocNhoc";
    }

    @Override
    public String emitirSom() {
        return "Te amo pipoca";
    }
}
