package lista.pkg1.ex14;
public final class Troco {
    private int nota10;
    private int nota5;
    private int nota1;

    public Troco(float money) {
        setNota10(money);
        setNota5(money-this.nota10*10);
        setNota1(money-this.nota10*10-this.nota5*5);
    }

    public int getNota10() {
        return nota10;
    }

    public void setNota10(float money) {
        this.nota10 = (int) money/10;
    }

    public int getNota5() {
        return nota5;
    }

    public void setNota5(float money) {
        this.nota5 = (int) money/5;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(float money) {
        this.nota1 = (int) money/1;
    }
    
    
}
