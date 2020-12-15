package exercicio12_hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String nome;
    private float totalConta;
    private LocalDate dataNascimento;
    private int totalDias;

    public Cliente(String nome, LocalDate dataNascimento,int totalDias) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.totalDias = totalDias;
    }
    
    public void calculaTotalConta(){
        float valorDiaria = 60 * this.totalDias;
        float taxaServico;
        
        if (this.totalDias < 15) {
            taxaServico = this.totalDias * 8;
        } else {
            if (this.totalDias > 15) {
                taxaServico = this.totalDias * 5.5f;
            } else {
                taxaServico = this.totalDias * 6;
            }
        }
        
        this.totalConta = valorDiaria + taxaServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTotalConta() {
        return totalConta;
    }

    public String getDataNascimento() {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento.format(formato);
        
        String dataNascimentoStr = this.dataNascimento.format(formato);
        
        return dataNascimentoStr;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(int totalDias) {
        this.totalDias = totalDias;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", totalConta=" + totalConta + ", "
                + "dataNascimento=" + getDataNascimento() + ", totalDias=" + totalDias + '}';
    }
  
}