public class Aluno {
    private String nome;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Aluno(String nome, float altura) {
        this.nome = nome;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", altura=" + altura + '}';
    }
            
            
    
}
