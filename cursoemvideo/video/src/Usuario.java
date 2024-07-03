import java.util.List;

public class Usuario extends Pessoa{
    private String login;
    private int videosAssistidos;

    public Usuario(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.videosAssistidos = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getVideosAssistidos() {
        return videosAssistidos;
    }

    public void setVideosAssistidos(int videosAssistidos) {
        this.videosAssistidos = videosAssistidos;
    }

    public void viuMaisUm() {
        this.videosAssistidos++;
    }

    @Override
    protected void ganharExp(String video) {
        experiencia.add(video);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", videosAssistidos=" + videosAssistidos +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", experiencia=" + experiencia +
                '}';
    }
}
