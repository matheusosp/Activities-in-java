package exercicio20_triangulo;


public class Executa {

    
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(4, 5, 3);
        triangulo1.determinaClassificacao();
        System.out.println(triangulo1.toString());
    }
    
}
