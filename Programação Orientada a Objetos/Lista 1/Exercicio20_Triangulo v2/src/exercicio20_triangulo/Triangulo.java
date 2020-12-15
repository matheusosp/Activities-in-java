package exercicio20_triangulo;


public class Triangulo {
    private float x;
    private float y;
    private float z;
    private String classificacao;

    public Triangulo(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void determinaClassificacao() {
        if ((x <= (y+z)) && (y <= (x+z)) && (z <= (x+y))) {
            if ( x == y && y == z) {
                this.classificacao = "Equilátero";
            } else {
                if ( x == y || x == z || y == z ) {
                    this.classificacao = "Isósceles";
                } else {
                    this.classificacao = "Escaleno";
                }
            }
            
        } else {
            this.classificacao = "Os valores não formam um triângulo!";
        }
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "x=" + x + ", y=" + y + ", z=" + z + ", classificacao=" + classificacao + '}';
    }
    
    
    
    
    
}
