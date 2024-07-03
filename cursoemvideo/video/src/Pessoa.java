import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected List<String> experiencia;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public List<String> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(List<String> experiencia) {
        this.experiencia = experiencia;
    }

    protected abstract void ganharExp(String video);
}
