package br.unitins.sac.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.unitins.frame.controller.Controller;
import br.unitins.frame.validation.Validation;
import br.unitins.sac.factory.JPAFactory;
import br.unitins.sac.model.Cidade;
import br.unitins.sac.validation.CidadeValidation;

@ManagedBean
@ViewScoped
public class CidadeController extends Controller<Cidade> {

	@Override
	public Cidade getEntity() {
		if (entity == null)
			entity = new Cidade();
		return entity;
	}

	@Override
	public Validation<Cidade> getValidation() {
		return new CidadeValidation();
	}

	@Override
	protected EntityManager getEntityManager() {
		return JPAFactory.getEntityManager();
	}

}
