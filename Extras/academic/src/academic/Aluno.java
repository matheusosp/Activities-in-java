package academic;

public class Aluno {
    
    String nome;
    String email;
    float media;
    boolean aprovado;
    
    public Aluno(){
        this.nome = "";
        this.email="";
        this.media = 0;
        this.aprovado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public String toString() { // se mostre objeto
        return "O aluno " + nome + ", email= " 
                + email + ", teve a media de " + media + ", e foi" + ((aprovado)?" Aprovado" : " Reprovado");
    }
}
