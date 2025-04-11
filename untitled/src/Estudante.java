public class Estudante implements Comparable<Estudante>{
    private int codigo;
    private String nome;
    private double teste1;
    private double teste2;

    public Estudante(int codigo, String nome, double teste1, double teste2) {
        this.codigo = codigo;
        this.nome = nome;
        this.teste1 = teste1;
        this.teste2 = teste2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTeste1() {
        return teste1;
    }

    public void setTeste1(double teste1) {
        this.teste1 = teste1;
    }

    public double getTeste2() {
        return teste2;
    }

    public void setTeste2(double teste2) {
        this.teste2 = teste2;
    }

    @Override
    public int compareTo(Estudante outroEstudante) {
        return Integer.compare(this.codigo, outroEstudante.codigo);
    }

    private double calcularMedia(){
        return (this.teste1 + teste2) / 2;
    }
    @Override
    public String toString() {
        return "\nEstudante" +
                "\nCodigo = " + codigo +
                "\nNome = " + nome + '\'' +
                "\nTeste 1= " + teste1 +
                "\nTeste 2 = " + teste2 +
                "\nMedia = " + calcularMedia();
    }
}
