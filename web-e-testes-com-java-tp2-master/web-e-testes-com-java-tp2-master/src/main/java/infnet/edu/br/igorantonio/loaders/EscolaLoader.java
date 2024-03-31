package infnet.edu.br.igorantonio.loaders;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import infnet.edu.br.igorantonio.Aluno;
import infnet.edu.br.igorantonio.Escola;

@Component
public class EscolaLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Escola infnet = new Escola();	
		infnet.setNomeDaEscola("Instituto Infnet");
		
		Aluno aluno01 = new Aluno();
		aluno01.setNome("Igor");
		aluno01.setIdade(23);
		aluno01.setCurso("Programacao");
		aluno01.setPeriodoDoCurso("2º Periodo");
		
		Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setIdade(22);
        aluno2.setCurso("Administração");
        aluno2.setPeriodoDoCurso("2º Período");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Carlos");
        aluno3.setIdade(21);
        aluno3.setCurso("Medicina");
        aluno3.setPeriodoDoCurso("4º Período");

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Ana");
        aluno4.setIdade(23);
        aluno4.setCurso("Direito");
        aluno4.setPeriodoDoCurso("5º Período");

        Aluno aluno5 = new Aluno();
        aluno5.setNome("Pedro");
        aluno5.setIdade(19);
        aluno5.setCurso("Psicologia");
        aluno5.setPeriodoDoCurso("1º Período");

        Aluno aluno6 = new Aluno();
        aluno6.setNome("Mariana");
        aluno6.setIdade(20);
        aluno6.setCurso("Engenharia Civil");
        aluno6.setPeriodoDoCurso("2º Período");

        Aluno aluno7 = new Aluno();
        aluno7.setNome("Lucas");
        aluno7.setIdade(24);
        aluno7.setCurso("Ciência da Computação");
        aluno7.setPeriodoDoCurso("3º Período");

        Aluno aluno8 = new Aluno();
        aluno8.setNome("Beatriz");
        aluno8.setIdade(22);
        aluno8.setCurso("Arquitetura");
        aluno8.setPeriodoDoCurso("4º Período");

        Aluno aluno9 = new Aluno();
        aluno9.setNome("Gustavo");
        aluno9.setIdade(21);
        aluno9.setCurso("Enfermagem");
        aluno9.setPeriodoDoCurso("5º Período");

        Aluno aluno10 = new Aluno();
        aluno10.setNome("Fernanda");
        aluno10.setIdade(23);
        aluno10.setCurso("Economia");
        aluno10.setPeriodoDoCurso("6º Período");
		
		infnet.incluir(01, aluno01);
		infnet.incluir(02, aluno2);
		infnet.incluir(03, aluno3);
		infnet.incluir(04, aluno4);
		infnet.incluir(05, aluno5);
		infnet.incluir(06, aluno6);
		infnet.incluir(07, aluno7);
		infnet.incluir(8, aluno8);
		infnet.incluir(9, aluno9);
		infnet.incluir(10, aluno10);
		
		System.out.println(infnet);
		System.out.println(infnet.getAlunosInfnet());
		
	}

}
