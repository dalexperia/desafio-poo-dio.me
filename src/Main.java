import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setTitulo("Java");
        curso01.setDescricao("Java Básico POO");
        curso01.setCargaHoraria(20);
        System.out.println(curso01);

        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Mentoria Java");
        mentoria01.setDescricao("Mentoria Java para aprimoramento");
        mentoria01.setData(LocalDate.now());
        System.out.println(mentoria01);
    }
}
