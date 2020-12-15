package exercicio13_diasvividos;

import java.time.LocalDate;


public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataAtual;
    private int diasVividos;

    public Pessoa(String nome, LocalDate dataNascimento, LocalDate dataAtual) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataAtual = dataAtual;
    }
    
    public int getDiasVividos() {
        return this.diasVividos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }
    
    public void calculaDiasVividos() {
        
        int anoNascimento = this.dataNascimento.getYear() - 1;
        int mesNascimento = this.dataNascimento.getMonthValue() - 1;
        int diaNascimento = this.dataNascimento.getDayOfMonth();
        
        int totalDiasNascimento = diaNascimento + mesNascimento*30 + anoNascimento*360;
        
        int anoAtual = this.dataAtual.getYear() - 1;
        int mesAtual = this.dataAtual.getMonthValue() - 1;
        int diaAtual = this.dataAtual.getDayOfMonth();
        
        int totalDiasAtual = diaAtual + mesAtual*30 + anoAtual*360;
        
        this.diasVividos = totalDiasAtual - totalDiasNascimento;
        
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", dataAtual=" + dataAtual + ", diasVividos=" + diasVividos + '}';
    }
    
    
}