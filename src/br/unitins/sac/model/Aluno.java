package br.unitins.sac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import br.unitins.frame.model.Model;

@Entity
public class Aluno extends Model<Aluno> {

	private static final long serialVersionUID = 5340998728426485061L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqidaluno")
	@SequenceGenerator(name = "seqidaluno", sequenceName = "seqidaluno", allocationSize = 1)
	private Integer id;
	private String matricula;
	private String nome;

	@ManyToOne
	@JoinColumn(name = "idCidade", nullable = true)
	private Cidade cidade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
