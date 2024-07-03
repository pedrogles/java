public abstract class Animal {
    protected String nome, membros;
    protected int idade;

    public Animal(String nome, String membros, int idade) {
        this.nome = nome;
        this.membros = membros;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String locomover();
    public abstract String alimentar();
    public abstract String emitirSom();
}
