package triangulo;
public class Triangulo {
    private String classificao;

    public String getClassificao() {
        return classificao;
    }

    public void setClassificao(int valores[]) {
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                if(j!=i){
                    soma+=valores[j];
                }
            }
            if(valores[i]>soma){
               this.classificao = "Não é um triangulo";
               break;
            }
        }
        if(!"Não é um triangulo".equals(this.classificao)){
            if (valores[0] == valores[1] && valores[0] == valores[2]){
                this.classificao = "Três lados iguais . Trata-se de um Triangulo Equilatero";
            }else if(valores[0] == valores[1] || valores[0] == valores[2]){
                this.classificao = "Dois lados iguais . Trata-se de um Triangulo Isosceles";
            }else
                this.classificao = "Três lados diferentes.";
        }
    }
    
}
