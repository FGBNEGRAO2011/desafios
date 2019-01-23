package poo;

public class Lutador {
    private  String nome;
    private  String nacionalidade;
    private  int idade;
    private  double altura;
    private  double peso;
    private  String categoria;
    private  int vitorias;
    private  int derrotas;
    private  int empates;

// métodos

    public void apresentar () {
        System.out.println("-------------------------------");
        System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e  " + this.getAltura() + " altura");
        System.out.println("pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates()  + " Empates");

    }

    public void status () {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empates " + this.getEmpates() + " vezes");
    }

    public void ganharLuta () {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta () {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metodos Especiais

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        this.setCategoria();
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.peso <  52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <=  70.3) {
            this.categoria = "Leve";
        } else if (this.peso  <= 83.3) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.0) {
            this.categoria = "Pesado";
        } else  {
            this.categoria = "Inválido";
        }
    }

    public void setVitorias(int vitorias) {
         this.vitorias = (this.getVitorias() + 1);
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = (this.getDerrotas() + 1);
    }

    public void setEmpates(int empates) {
        this.empates = (this.getEmpates() + 1);

    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
}
