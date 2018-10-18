package br.com.ustore.gerenciador.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ustore.gerenciador.model.entities.Produto;

public class ProdutoDao {
	private static final String PERSISTENCE_UNIT = "gerenciador";

	public void inserir(Produto produto) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

	public List<Produto> listar() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		EntityManager manager = factory.createEntityManager();
		List<Produto> lista = manager.createQuery("FROM Produto ORDER BY descricao").getResultList();

		manager.close();
		factory.close();

		return lista;
	}
}