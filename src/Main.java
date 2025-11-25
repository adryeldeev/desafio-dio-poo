import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1.getTitulo());
        System.out.println(curso1.getDescricao());
        System.out.println(curso1.getCargaHoraria());

        System.out.println("==============================");
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(4);
        System.out.println(curso2.getTitulo());
        System.out.println(curso2.getDescricao());
        System.out.println(curso2.getCargaHoraria());

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(java.time.LocalDate.now());
        System.out.println(mentoria.getTitulo());
        System.out.println(mentoria.getDescricao());
        System.out.println(mentoria.getData());


    }
}
