package br.unitins.sac.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
	
	@SuppressWarnings("unchecked")
	public List<Cidade> bucarTodos() {
		
		Query query = geEntityManager().createQuery("SELECT c FROM Cidade c ORDER BY c.id DESC");
		List<Cidade> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<Cidade>();
		
		return lista;
	}
	
	public List<Cidade> bucarCidades(String nome) {
		
		Query query = geEntityManager().createQuery("SELECT c FROM Cidade c WHERE c.nome LIKE ?1 ORDER BY c.nome");
		query.setParameter(1, "%"+nome+"%");
		List<Cidade> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<Cidade>();
		
		return lista;
	}
	
	
}
