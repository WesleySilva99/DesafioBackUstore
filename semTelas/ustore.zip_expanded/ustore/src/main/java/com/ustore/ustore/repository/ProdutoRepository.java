package com.ustore.ustore.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ustore.ustore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

	static final String PERSISTENCE_UNIT = "estoque";

	public default Produto buscaPorId(int id) {

		Produto obj = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		EntityManager manager = factory.createEntityManager();
		obj = manager.find(Produto.class, id);
		manager.close();
		factory.close();
		return obj;

	}

}
