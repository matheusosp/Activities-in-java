package digital.innovation.one.utils;

import digital.innovation.one.utils.internal.DivisaoHelper;
import digital.innovation.one.utils.internal.Multhelper;
import digital.innovation.one.utils.internal.SubHelper;
import digital.innovation.one.utils.internal.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private Multhelper multHelper;
    private DivisaoHelper divisaoHelper;

    public Calculadora(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multHelper = new Multhelper();
        divisaoHelper = new DivisaoHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }

    public int divisao(int a, int b){
        return divisaoHelper.execute(a,b);
    }
}
