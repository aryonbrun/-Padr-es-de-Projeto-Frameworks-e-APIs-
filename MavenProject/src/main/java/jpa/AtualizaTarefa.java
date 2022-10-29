package jpa;

import pr.senac.br.modelo.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtualizaTarefa {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        Tarefa tarefaencontrada = manager.find(Tarefa.class, 5L); //procura e atualiza
        tarefaencontrada.setDescricao("Estudar para a prova");
        manager.merge(tarefaencontrada); //atualiza e faz o update,passando qual objeto quer fazer o merge
        System.out.println(tarefaencontrada.getDescricao());
        manager.getTransaction().commit(); //comitando no banco dados


    }
}
