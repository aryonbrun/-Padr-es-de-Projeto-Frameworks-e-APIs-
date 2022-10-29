package pr.senac.br.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private boolean finalizado;


    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", descrição='" + descricao + '\'' +
                ", finalizado=" + finalizado +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}
