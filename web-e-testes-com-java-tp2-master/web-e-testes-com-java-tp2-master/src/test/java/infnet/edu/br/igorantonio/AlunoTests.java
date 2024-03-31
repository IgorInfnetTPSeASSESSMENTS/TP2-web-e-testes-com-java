package infnet.edu.br.igorantonio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlunoTests {

	private Escola escola;
	private Aluno aluno;
	private String nomeDaEscola = "Infnet";
	
	
	@BeforeEach
	void setUp() {
		aluno = new Aluno();
		aluno.setNome("Igor");
		aluno.setIdade(23);
		aluno.setCurso("Programacao");
		aluno.setPeriodoDoCurso("2");
	}
	
	@Test
	void testaIdadeNegativa() {
		aluno.setIdade(-5);
		
		assertNotEquals(-5, aluno.getIdade());
	}
	
	@Test
	void testaIdadeZero() {
		aluno.setIdade(0);
		
		assertNotEquals(0, aluno.getIdade());
	}
	
	@Test
	void recuperarDados() {
		assertEquals("Igor", aluno.getNome());
		assertEquals(23, aluno.getIdade());
		assertEquals("Programacao" , aluno.getCurso());
		assertEquals("2", aluno.getPeriodoDoCurso());
	}
}
