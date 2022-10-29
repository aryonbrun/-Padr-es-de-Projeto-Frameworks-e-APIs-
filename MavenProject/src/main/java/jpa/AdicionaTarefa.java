package jpa;

import pr.senac.br.modelo.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class AdicionaTarefa {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("teste");
        tarefa.setFinalizado(true);

        Tarefa tarefa1 = new Tarefa();
        tarefa.setDescricao("Estudar JPA e Hibernate mais");
        tarefa.setFinalizado(true);

        Tarefa tarefa3 = new Tarefa();
        tarefa.setDescricao("Estudar JPA e Hibernate e muito mais");
        tarefa.setFinalizado(true);



        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(tarefa);
        manager.persist(tarefa1);
        manager.persist(tarefa3);
        manager.getTransaction().commit();

        System.out.println("ID da tarefa: " + tarefa.getId());
    }
}
