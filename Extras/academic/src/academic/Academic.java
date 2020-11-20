package academic;
public class Academic {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        
        float Media = 7;
        aluno1.setNome("Matheus");
        aluno1.setEmail("Matheus");
        aluno1.setMedia(Media);
        aluno1.setAprovado(Media >=7);
        System.out.println( aluno1 );
        
        Aluno aluno2 = new Aluno();
        
        Media = 6.9f;
        aluno2.setNome("Lucas ");
        aluno2.setEmail("lucas@gmail.com");
        aluno2.setMedia(Media);
        aluno2.setAprovado(Media >=7);
        System.out.println( aluno2 );
    }

}
