package cidades;

public class Cidades {

    public static void main(String[] args) {
      int cont ;  
      double cidade_a=120000,cidade_b=80000;
      for(cont=0;cidade_a>cidade_b;cont++){
        cidade_a=cidade_a*1.015;
        cidade_b=cidade_b*1.035;
    }System.out.println("população da cidade B vai ultrapassar a população da cidade A em "+cont+" anos");
    }
      
    
    
}
