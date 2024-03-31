package infnet.edu.br.igorantonio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EscolaTests {

	private Escola escola;
	private Aluno aluno;
	private String nomeDaEscola = "Infnet";
	
	
	@BeforeEach
	void setUp() {
		escola = new Escola();
		aluno = new Aluno();
		aluno.setNome("Igor");
		aluno.setIdade(23);
		aluno.setCurso("Programacao");
		aluno.setPeriodoDoCurso("2");
		
		escola.setNomeDaEscola("Infnet");
		escola.incluir(01, aluno);
	}
	
	@Test
	void nomeDaEscolaEInclusaoDeAluno() {
		assertEquals(nomeDaEscola, escola.getNomeDaEscola());
		assertEquals(aluno, escola.getAluno(01));
	}
}
