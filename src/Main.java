import com.dio.Bootcamp;
import com.dio.Curso;
import com.dio.Dev;
import com.dio.Mentoria;
import com.dio.exception.InvalidBootcampException;
import com.dio.exception.InvalidContentException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InvalidBootcampException, InvalidContentException {

        Curso curso1_java = new Curso("Curso Java", "Descricao Curso Java", 8);
        Curso curso2_java = new Curso("curso js","descrição curso js", 4 );
        Mentoria mentoria_java = new Mentoria("mentoria de java", "descricao mentoria java", LocalDate.now(), 20);


        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp Java Developer");
        bootcampJava.addNewContent(curso1_java);
        bootcampJava.addNewContent(curso2_java);
        bootcampJava.addNewContent(mentoria_java);

        Dev devCamila = new Dev("Camila" );

        devCamila.addNewSignedBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSignedContents());
        devCamila.addNewContent(new Curso("Curso HTML", "Descricao Curso HTML", 8));
        devCamila.studying();
        devCamila.studying();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSignedContents());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getFinishedContent());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        Bootcamp bootcampRuby = new Bootcamp("Bootcamp Ruby","Descrição Bootcamp Ruby");
        Curso curso1_ruby= new Curso("Curso Ruby", "Descricao Curso Ruby", 8);
        Curso curso2_ruby = new Curso("Curso Ruby on Rails","descrição Curso Ruby on Rails", 4 );
        Mentoria mentoria_ruby = new Mentoria("mentoria de ruby", "descricao mentoria ruby", LocalDate.now(), 30);
        bootcampRuby.addNewContent(curso1_ruby);
        bootcampRuby.addNewContent(curso2_ruby);
        bootcampRuby.addNewContent(mentoria_ruby);
        devJoao.addNewSignedBootcamp(bootcampRuby);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSignedContents());
        devJoao.studying();
        devJoao.studying();
        devJoao.studying();

        System.out.println("-------");
        System.out.println("Conteúdos Inscritos João:" +  devJoao.getSignedContents());
        System.out.println("Conteúdos Concluidos João:" +  devJoao.getFinishedContent());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}