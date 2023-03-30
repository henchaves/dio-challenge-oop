import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setName("Henrique");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Contéudos Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXpTotal());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Contéudos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Contéudos Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXpTotal());

    }
}
