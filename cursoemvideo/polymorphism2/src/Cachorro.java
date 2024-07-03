public class Cachorro extends Lobo{
    public String emitirSom() {
        return "Au au au!";
    }

    public String reagir(String frase) {
        if(frase.toLowerCase().equals("oi") || frase.toLowerCase().equals("toma comida")) {
            return "Abanar e latir";
        } else return "Rosnar";
    }
    public String reagir(int hora, int min) {
        if(hora < 12) {
            return "Abanar";
        } else if (hora >= 18) {
            return "Ignorar";
        } else return "Abanar e latir";
    }
    public String reagir(boolean dono) {
        if(dono) {
            return "Abanar";
        } else return "Rosnar e latir";
    }
    public String reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                return "Abanar";
            } else return "Latir";
        } else if (peso < 10) {
            return "Rosnar";
        } else return "Ignorar";
    }
}
