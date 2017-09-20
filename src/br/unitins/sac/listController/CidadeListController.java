package br.unitins.sac.listController;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.unitins.frame.listController.ListController;
import br.unitins.sac.factory.JPAFactory;
import br.unitins.sac.model.Cidade;
import br.unitins.sac.repository.CidadeRepository;


@ManagedBean
@ViewScoped
public class CidadeListController extends ListController<Cidade> {

	private static final long serialVersionUID = -5816342500278252412L;

	public CidadeListController() {
		super(new CidadeRepository(JPAFactory.getEntityManager()), true, false, false, 450, 650, "/listings/listagemCidade");
		getEntity().setNome("");
	}

	@Override
	public Cidade getEntity() {
		if (entity == null)
			entity = new Cidade();
		return entity;
	}

	public List<Cidade> getListEntity() {
		if (listEntity == null) {
			listEntity = new ArrayList<Cidade>();
			CidadeRepository repository = new CidadeRepository(JPAFactory.getEntityManager());
			try {
				listEntity = repository.bucarCidades(getEntity().getNome());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listEntity;
	}

}
