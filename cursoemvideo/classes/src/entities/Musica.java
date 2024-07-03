package entities;

public class Musica {
    private String nome;
    private int tempo;
    private String genero;

    public Musica(String nome, int tempo, String genero) {
        this.tempo = tempo;
        this.genero = genero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTempo() {
        return tempo;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
