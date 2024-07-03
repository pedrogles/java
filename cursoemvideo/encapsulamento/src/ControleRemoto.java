import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean mudo;
    private boolean pause;

    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.mudo = false;
        this.pause = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isMudo() {
        return mudo;
    }

    public void setMudo(boolean mudo) {
        this.mudo = mudo;
    }

    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

    @Override
    public void userInterface() {
        String data;
        data =
                "----------- Interface -----------" + "\n" +
                "1 - Ligar controle" + "\n" +
                "2 - Menu" + "\n" +
                "3 - Aumentar Volume" + "\n" +
                "4 - Diminuir Volume" + "\n" +
                "5 - Mudo" + "\n" +
                "6 - Play/Pause" + "\n" +
                "7 - Desligar Controle" + "\n" +
                "Digite a opção que você deseja:";
        System.out.print(data);
    }

    @Override
    public void ligar() {
        if(!isLigado()) {
            setLigado(true);
            setVolume(50);
        }
    }

    @Override
    public void desligar() {
        if(isLigado()) {
            setLigado(false);
        }
    }

    @Override
    public void menu() {
        String data;
        List<String> vol = new ArrayList<>();
        for(var i = 0; i < getVolume(); i++) {
            if(i % 10 == 0) {
                vol.add("|");
            }
        }
        data =
                "----------- Menu -----------" + "\n" +
                "Ligado: " + isLigado() + "\n" +
                "Volume: " + String.join("", vol) + " (" + getVolume() + ")" + "\n" +
                "Mudo: " + isMudo() + "\n" +
                "Pause: " + isPause();
        System.out.println(data);
    }

    @Override
    public void aumentarVolume() {
        if(isLigado()){
            if(getVolume() > 100) {
                setVolume(100);
            } else setVolume(volume+=10);
        }
    }

    @Override
    public void diminuirVolume() {
        if(isLigado()){
            if(getVolume() < 0) {
                setVolume(0);
            } else setVolume(volume-=10);
        }
    }

    @Override
    public void mudo() {
        if(isLigado() && getVolume() > 0) {
            setVolume(0);
            setMudo(true);
        } else if (isLigado() && getVolume() == 0) {
            setVolume(50);
            setMudo(false);
        }
    }

    @Override
    public void playPause() {
        if(isLigado()) {
            setPause(!isPause());
        }
    }
}
