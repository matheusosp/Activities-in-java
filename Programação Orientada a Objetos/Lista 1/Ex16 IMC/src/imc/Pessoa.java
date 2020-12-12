package imc;
public final class Pessoa {
    private float peso;
    private float altura;
    private float IMC;
    private String Classificaçao;

    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
        setIMC(peso,altura);
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

    public float getIMC() {
        return IMC;
    }
    
    public String getClassificação() {
        return Classificaçao;
    }
    public void setIMC(float peso, float altura) {
        this.IMC = peso/(altura*altura);
        if(this.IMC <18.5){
            this.Classificaçao="MAGREZA";
        }
        if(this.IMC >=18.5 && this.IMC < 25){
            this.Classificaçao = "NORMAL";
        }
        if(this.IMC >=25 && this.IMC < 30){
            this.Classificaçao = "SOBREPESO";
        }
        if(this.IMC >=30 && this.IMC < 40){
            this.Classificaçao = "OBESIDADE";
        }   
        if(this.IMC >=40){
            this.Classificaçao = "OBESIDADE GRAVE";
        }         
    }
    
}
