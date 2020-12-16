package privaex2;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(2001, 9, 20);
        LocalDate dataRetorno = LocalDate.of(2020, 12, 16);
        Paciente paciente = new Paciente("Matheus ",dataRetorno,dataNascimento);
        System.out.println("O paciente "+paciente.getNome()+"tem a idade = "+paciente.getIdadeCompleta());
    }

}
