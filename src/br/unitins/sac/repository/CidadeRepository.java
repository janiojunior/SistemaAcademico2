package br.unitins.sac.repository;

import javax.persistence.EntityManager;

import br.unitins.frame.repository.Repository;
import br.unitins.sac.model.Cidade;

public class CidadeRepository extends Repository<Cidade>{

	public CidadeRepository(EntityManager em) {
		super(em);
	}

	@Override
	protected Class<Cidade> getModelClass() {
		return Cidade.class;
	}
	
}
