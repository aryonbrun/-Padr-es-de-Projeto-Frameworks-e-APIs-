package TrabalhoAula03;

public class Cliente {

        protected String cpf;
        protected String nome;
        protected String email;
        protected int anoNascimento;

        @Override
        public String toString() {
            return "Cliente [anoNascimento=" + anoNascimento + ", cpf=" + cpf + ", email=" + email + ", nome=" + nome + "]";
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
}

