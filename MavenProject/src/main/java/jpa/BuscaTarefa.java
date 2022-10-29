package jpa;

import pr.senac.br.modelo.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaTarefa {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

            Tarefa encontrada = manager.find(Tarefa.class, 1L); //buscando o objeto e procurar
            System.out.println(encontrada.toString()); // ou getDescricao

            manager.close();

    }

}
