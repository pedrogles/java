public class Visualizacao {
    private Usuario espectador;
    private Video video;

    public Visualizacao(Usuario espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setVideosAssistidos(this.espectador.getVideosAssistidos() + 1);
        this.video.setViews(this.video.getViews() + 1);
        this.espectador.experiencia.add(video.getTitulo());
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void avaliar(float nota){
        video.setAvaliacao(nota);
    }
}
