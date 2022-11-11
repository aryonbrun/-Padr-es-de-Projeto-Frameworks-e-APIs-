package pr.senac.br.modelo1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Cliente {
    @Id
    @Column(length = 11)
    private String cpf;
    @Column(nullable = false)
    private int anoNascimento;
    @Column(nullable = false, length = 60)
    private String nome;
    @Column(nullable = false,length = 60, unique = true)
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    public Cliente() {
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.email = email;
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", conta=" + conta +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
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

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
