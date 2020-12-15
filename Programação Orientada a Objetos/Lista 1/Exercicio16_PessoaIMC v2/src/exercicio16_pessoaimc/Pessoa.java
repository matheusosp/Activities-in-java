package exercicio16_pessoaimc;


public class Pessoa {
    private String nome;
    private float peso;
    private float altura;
    private float imc;
    private String classificacao;

    public Pessoa(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    private void calculaImc() {
        this.imc = peso / (this.altura * this.altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void determinaClassificacao() {
        
        calculaImc();
        
        if ( this.imc < 18.5) {
            this.classificacao = "MAGREZA";
        } else {
            if ( this.imc >= 18.5 && this.imc <= 24.9 ) {
                this.classificacao = "NORMAL";
            } else {
                if ( this.imc >= 25 && this.imc <= 29.9 ) {
                    this.classificacao = "SOBREPESO";
                } else {
                    if (this.imc >= 30 && this.imc <= 39.9 ) {
                        this.classificacao = "OBESIDADE";
                    } else {
                        this.classificacao = "OBESIDADE GRAVE";
                    }
                }
            }
        }
     
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", classificacao=" + classificacao + '}';
    }
    
    
    
    
}
