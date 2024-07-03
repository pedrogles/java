import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiante, desafiado;
    private int rounds;
    private boolean aprovado;

    // Getters and Setters
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    // Methods
    public String marcarLuta(Lutador desafiante, Lutador desafiado) {
        String result;
        if(!desafiante.getCategoria().equals(desafiado.getCategoria())) {
            this.aprovado = false;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
            result = "Os participantes não estão na mesma categoria.";
        } else if (desafiante == desafiado) {
            this.aprovado = false;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
            result = "Desafiante e desafiado não podem ser os mesmos.";
        } else {
            this.aprovado = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
            result = "Luta marcada com sucesso: " + desafiante.getNome() + " x " + desafiado.getNome();
        }
        return result;
    }

    public String lutar() {
        String luta = desafiante.apresentacao() + "\n" + desafiado.apresentacao();
        String result = "";
        if(aprovado) {
            int desafiante_pt = 0;
            int desafiado_pt = 0;
            Random random = new Random();
            int randomInt = random.nextInt(3);
            // Age
            if(desafiante.getIdade() > desafiado.getIdade()) {
                desafiado_pt++;
            }
            else if (desafiante.getIdade() < desafiado.getIdade()) {
                desafiante_pt++;
            } else {
                desafiado_pt++;
                desafiante_pt++;
            }
            // Height
            if(desafiante.getAltura() > desafiado.getAltura()) {
                desafiante_pt++;
            }
            else if (desafiante.getAltura() < desafiado.getAltura()) {
                desafiado_pt++;
            } else {
                desafiado_pt++;
                desafiante_pt++;
            }
            // Weight
            if(desafiante.getPeso() > desafiado.getPeso()) {
                desafiante_pt++;
            }
            else if (desafiante.getPeso() < desafiado.getPeso()) {
                desafiado_pt++;
            } else {
                desafiado_pt++;
                desafiante_pt++;
            }
            // Random
            if(randomInt == 1) {
                desafiante_pt += 2;
            }
            else if (randomInt == 2) {
                desafiado_pt += 2;
            } else {
                desafiado_pt += 2;
                desafiante_pt += 2;
            }
            if(desafiante_pt > desafiado_pt) {
                result =
                        "Com " + desafiante_pt + " rounds ganhos contra " + desafiado_pt + ", " + desafiante.getNome() +
                        " é o vencedor da luta.";
                desafiante.ganharLuta();
            }
            else if (desafiante_pt < desafiado_pt) {
                result = "Com " + desafiado_pt + " rounds ganhos contra " + desafiante_pt + ", " + desafiado.getNome() +
                        " é o vencedor da luta.";
                desafiado.ganharLuta();
            } else {
                result = "Com " + desafiado_pt + " rounds ganhos por cada lutador " +
                        "o resultado da luta é empate.";
                desafiante.empatarLuta();
                desafiado.empatarLuta();
            }
            luta += "\n------------ ROUNDS ------------" + "\n" +
                    "Rounds ganhos pelo Desafiante: " + desafiante_pt + "\n" +
                    "Rounds ganhos pelo Desafiado: " + desafiado_pt + "\n" +
                    "------------ RESULTADO ------------" + "\n" +
                    result;
        } else {
            luta = "Essa luta não foi aprovada.";
        }
        return luta;
    }
}
