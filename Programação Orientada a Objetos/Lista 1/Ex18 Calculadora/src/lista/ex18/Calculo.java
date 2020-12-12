package lista.ex18;
public class Calculo {
    private float calculo;

    public float getCalculo() {
        return calculo;
    }

    public void setCalculo(float n1,float n2, char op) {
        switch(op){
            case '+':
                this.calculo = n1+n2;
                break;
            case '-':
                this.calculo = n1-n2;
                break;
            case '*':
                this.calculo = n1*n2;
                break;
            case '/':
                this.calculo = n1/n2;
                break;
        }
    }

    
    
}
