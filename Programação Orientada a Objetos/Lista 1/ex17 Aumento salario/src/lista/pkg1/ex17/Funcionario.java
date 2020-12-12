package lista.pkg1.ex17;
public class Funcionario {
    private float salarioBruto;
    private char categoria;
    private float newsalario;

    public Funcionario(char categoria, float salarioBruto ) {
        this.categoria = categoria;
        this.salarioBruto = salarioBruto;
        setNewsalario(categoria,salarioBruto);
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public float getNewsalario() {
        return newsalario;
    }

    public final void setNewsalario(char categoria, float salarioBruto) {
        switch(categoria) {
          case 'A':case 'C':case 'F':case 'H':
            this.newsalario = this.salarioBruto *(float)1.10;
            break;
          case 'B':case 'D':case 'E':case 'I':case 'J':case 'T':
            this.newsalario = this.salarioBruto *(float)1.15;
            break;
          case 'K':case 'R':
            this.newsalario = this.salarioBruto *(float)1.25;
            break;
          case 'L':case 'M':case 'N':case 'O':case 'P':case 'Q':case 'S':
            this.newsalario = this.salarioBruto *(float)1.35;
            break;
          case 'U':case 'V':case 'X':case 'Y':case 'W':case 'Z':
            this.newsalario = this.salarioBruto *(float)1.50;
            break;
        }
    }


    
}
