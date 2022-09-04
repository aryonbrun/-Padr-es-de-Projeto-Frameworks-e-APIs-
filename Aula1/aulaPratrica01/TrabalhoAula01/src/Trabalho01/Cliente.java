package Trabalho01;

public class Cliente {
    String cpf;
    String nome;
    String email;
    int anoNascimento;


    public Cliente(String cpf, String nome, String email, int anoNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }

    public Cliente(){

    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    @Override
    public String toString() {
        return "Cliente [anoNascimento=" + anoNascimento + ", cpf=" + cpf + ", email=" + email + ", nome=" + nome + "]";
    }


}
