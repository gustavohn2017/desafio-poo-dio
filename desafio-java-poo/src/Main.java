import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorias;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição curso java");
        curso2.setCargaHoraria(8);

        Mentorias mentoria1 = new Mentorias();;
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer Bootcamp");
        bootcamp.setDescricao("Lorem Ipsum dolor sit amet..");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Dev1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos"+ dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos"+ dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+ dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXP());

        System.out.println("-------------");


        
        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos"+ dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos concluidos"+ dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXP());







    }
}
