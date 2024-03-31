package infnet.edu.br.igorantonio;

public class Aluno {
	
	private String nome;
	private int idade;
	private String curso;
	private String periodoDoCurso;
	
	public Aluno() {
		
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso + ", Periodo: " + periodoDoCurso; 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
		} else {
			System.out.println("Idade precisa ser maior do que 0.");
		}
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getPeriodoDoCurso() {
		return periodoDoCurso;
	}
	public void setPeriodoDoCurso(String periodoDoCurso) {
		this.periodoDoCurso = periodoDoCurso;
	}
}
