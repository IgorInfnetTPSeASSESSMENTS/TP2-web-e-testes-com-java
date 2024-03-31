package infnet.edu.br.igorantonio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Escola {

	private String nomeDaEscola;
	private Map<Integer, Aluno> alunosInfnet = new HashMap<Integer, Aluno>();
	
	
	public Escola() {
		
	}
	
	public void incluir(int inteiro, Aluno aluno) {
		alunosInfnet.put(inteiro, aluno);
	}
	
	@Override
	public String toString() {
		return "Nome da escola: " + nomeDaEscola; 
	}
	
	public String getNomeDaEscola() {
		return nomeDaEscola;
	}

	public void setNomeDaEscola(String nomeDaEscola) {
		this.nomeDaEscola = nomeDaEscola;
	}

	public Collection<Aluno> getAlunosInfnet() {
		return alunosInfnet.values();
	}
	
	public Aluno getAluno(int key) {
		return alunosInfnet.get(key);
	}	
}
