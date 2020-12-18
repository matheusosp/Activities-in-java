package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;


public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divisao(10,5));
        System.out.println(calculadora.mult(10,5));
        System.out.println(calculadora.sum(10,5));
        System.out.println(calculadora.sub(10,5));
    }

}
