import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso Java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlice = new Dev();
        devAlice.setNome("Alice");

        Dev devBob = new Dev();
        devBob.setNome("Bob");

        devAlice.inscreverBootcamp(bootcamp);
        devBob.inscreverBootcamp(bootcamp);

        System.out.println("== Conteúdos inscritos Alice: " + devAlice.getConteudosInscritos());
        System.out.println("== Conteúdos inscritos Bob: " + devBob.getConteudosInscritos());

        devAlice.progredir();
        System.out.println("\n== Após Alice progredir ==");
        System.out.println("Conteúdos inscritos Alice: " + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Alice: " + devAlice.getConteudosConcluidos());
        System.out.println("XP total Alice: " + devAlice.calcularTotalXp());

        devBob.progredir();
        devBob.progredir();
        System.out.println("\n== Após Bob progredir duas vezes ==");
        System.out.println("Conteúdos inscritos Bob: " + devBob.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Bob: " + devBob.getConteudosConcluidos());
        System.out.println("XP total Bob: " + devBob.calcularTotalXp());
    }
}