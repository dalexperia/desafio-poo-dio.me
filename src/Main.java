import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setTitulo("Java");
        curso01.setDescricao("Java Básico POO");
        curso01.setCargaHoraria(20);

        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Mentoria Java");
        mentoria01.setDescricao("Mentoria Java para aprimoramento");
        mentoria01.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Java Developer");
        bootCamp.setDescricao("Descrição Java Developer");
        bootCamp.getConteudos().add(curso01);
        bootCamp.getConteudos().add(mentoria01);

        Dev dev01 = new Dev();
        dev01.setNome("Daniel");
        dev01.inscreverBootCamp(bootCamp);
        System.out.println("Inscrito Dev01: "+ dev01.getConteudoInscritos());
        dev01.progredir();
        System.out.println("Inscrito Dev01: "+ dev01.getConteudoInscritos());
        System.out.println("Concluido Dev01: "+ dev01.getConteudoConcluidos());
        System.out.println("XP Total: " + dev01.calcularTotalXP());

        Dev dev02 = new Dev();
        dev02.setNome("Dannia");
        dev02.inscreverBootCamp(bootCamp);
        System.out.println("Inscrito Dev02: "+ dev02.getConteudoInscritos());
        dev02.progredir();
        System.out.println("Inscrito Dev02: "+ dev02.getConteudoInscritos());
        System.out.println("Concluido Dev02: "+ dev02.getConteudoConcluidos());
        System.out.println("XP Total: " + dev02.calcularTotalXP());
    }
}
