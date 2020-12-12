package lista.pkg1.ex15;
public class Dias {
    private int dias;

    public Dias(int mes, int ano) {
        this.dias = setDias(mes,ano);
    }

    
    public int getDias() {
        return dias;
    }

    public int setDias(int mes, int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            if(mes == 2){
                dias = 29;
            }else{
                dias = 30;
            }
        }else{
            dias = 30;
        }
        return dias;
    }
    
    
}
