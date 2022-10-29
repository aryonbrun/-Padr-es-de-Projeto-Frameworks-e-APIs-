package jpa;

import pr.senac.br.modelo.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExcluiTarefa {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        Tarefa tarefaencontrada = manager.find(Tarefa.class, 1L); //encontrando a tarefa
        manager.remove(tarefaencontrada);

        manager.getTransaction().commit();

    }
}
