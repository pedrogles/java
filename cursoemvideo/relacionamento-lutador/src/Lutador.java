public class Lutador implements InterfaceLutador{
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String nome, String nacionalidade,
                   int idade, float altura, float peso,
                   int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        setCategoria();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(getPeso() < 52.2) {
            categoria = "Inválido";
        }
        else if (getPeso() <= 70.3) {
            categoria = "Peso leve";
        }
        else if (getPeso() <= 83.9) {
            categoria = "Peso médio";
        }
        else if (getPeso() <= 120) {
            categoria = "Peso Pesado";
        } else categoria = "Inválido";

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public String apresentacao() {
        String data;
        data =
                "------------ APRESENTAÇÃO ------------" + "\n" +
                nome + " é um lutador de nacionalidade " + nacionalidade + ". " + "\n" +
                "Com " + idade + " anos, tem " + altura + " metros de altura e pesa " + peso + " kg. " + "\n" +
                "Compete na categoria " + categoria + ", acumulando " + vitorias + " vitórias, " +
                derrotas + " derrotas e " + empates + " empates.";
        return data;
    }

    @Override
    public String status() {
        String data;
        data =
            "------------ STATUS ------------" + "\n" +
            "Nome: " + nome + "\n" +
            "Categoria: " + getCategoria() + "\n" +
            "Vitórias: " + vitorias + "\n" +
            "Derrotas: " + derrotas + "\n" +
            "Empates: " + empates + "\n";
        return data;
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
