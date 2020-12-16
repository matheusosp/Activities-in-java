package privaex2;

import java.time.LocalDate;

public class Paciente {
    private String nome;
    private LocalDate dataRetorno;
    private LocalDate dataNascimento;
    private String idadeCompleta;
    private int idadeAnos;
    private int idadeMeses;
    private int idadeDias;

    public Paciente(String nome, LocalDate dataRetorno,
            LocalDate dataNascimento) {
        this.nome = nome;
        this.dataRetorno = dataRetorno;
        this.dataNascimento = dataNascimento;
        calculaIdade();
    }
    private void calculaIdade(){
        int anoNascimento = this.dataNascimento.getYear() - 1;
        int mesNascimento = this.dataNascimento.getMonthValue() - 1;
        int diaNascimento = this.dataNascimento.getDayOfMonth();
        
        int anoAtual = this.dataRetorno.getYear() - 1;
        int mesAtual = this.dataRetorno.getMonthValue() - 1;
        int diaAtual = this.dataRetorno.getDayOfMonth();
        
        int totalDiasNascimento = diaNascimento + mesNascimento*30 + anoNascimento*360;
        int totalDiasAtual = diaAtual + mesAtual*30 + anoAtual*360;       
        int diferencaDias = totalDiasAtual - totalDiasNascimento;
        
        this.idadeAnos = diferencaDias/360;
        this.idadeMeses = (diferencaDias-(idadeAnos*360))/30;
        this.idadeDias = diferencaDias-(idadeAnos*360)-(idadeMeses*30);
        setIdadeCompleta();
        
    }
    
    private void setIdadeCompleta() {
        this.idadeCompleta = getIdadeAnos()+" Anos "+getIdadeMeses()+" Meses e "+getIdadeDias()+" Dias.";
    }    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(LocalDate dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdadeCompleta() {
        return idadeCompleta;
    }

    public int getIdadeAnos() {
        return idadeAnos;
    }

    public void setIdadeAnos(int idadeAnos) {
        this.idadeAnos = idadeAnos;
    }

    public int getIdadeMeses() {
        return idadeMeses;
    }

    public void setIdadeMeses(int idadeMeses) {
        this.idadeMeses = idadeMeses;
    }

    public int getIdadeDias() {
        return idadeDias;
    }

    public void setIdadeDias(int idadeDias) {
        this.idadeDias = idadeDias;
    }              
}
