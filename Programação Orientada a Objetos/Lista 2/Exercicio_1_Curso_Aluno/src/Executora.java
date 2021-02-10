public class Executora {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Ana",1.68f);
        
        System.out.println( aluno.toString() );
        
        Curso curso = new Curso("CC",3200);
        curso.associaAluno( aluno );
        
        System.out.println( curso.toString() );
        
        
    }
    
}
