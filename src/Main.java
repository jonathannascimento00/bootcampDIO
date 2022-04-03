import java.time.LocalDate;

import br.com.desafioDIO.Bootcamp;
import br.com.desafioDIO.Curso;
import br.com.desafioDIO.Dev;
import br.com.desafioDIO.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Javinha");
		curso1.setDescricao("Curso básico de java");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Python Básico");
		curso2.setDescricao("Curso básico de python3");
		curso2.setCargaHoraria(5);
		
		System.out.println(curso1);
		System.out.println(curso2);

		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Mentoria de java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Quality Assurance");
		bootcamp.setDescricao("Melhor bootcamp pra introduzir a área de QA");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devJonathan = new Dev();
		devJonathan.setNome("Jonathan");
		devJonathan.inscreverBootcamp(bootcamp);
		devJonathan.progredir();
		devJonathan.progredir();
		devJonathan.progredir();
		System.out.println("O dev está inscrito nos seguintes cursos: " + devJonathan.getConteudosInscritos());
		System.out.println("O dev concluiu os seguintes cursos: " + devJonathan.getConteudosConcluidos());
		System.out.println(devJonathan.calcularTotalXP());
		Dev devJuca = new Dev();
		devJuca.setNome("Juca");
	}

}
