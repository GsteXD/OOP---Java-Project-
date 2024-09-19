import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<Paciente> lista_paciente = new ArrayList<>();

        /*do {
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            op = sc1.nextInt();

            switch (op){
                case 1:
                    System.out.println("Quem você deseja Cadastrar?");
                    break;

                case 2:
                    break;
            }

        } while(op!=0);
        */

        try {
            Paciente p1 = new Paciente( "Ana Banana", "F", "11 12312-1231", "12312312312", 34);
            Paciente p2 = new Paciente( "Ana Banana", "F", "11 12312-1231", "12312312312", 34);

            Medico m1 = new Medico(1,"Gibraltar", "909090", "11 90909-90900", "Urologista", "senha");

            Recepcionista r1 = new Recepcionista(1,"Mariele", "11111111111", "8908908909", "123");

            Consulta c1 = new Consulta(1,98, 11, m1, p1, "dor no pé", "cancêr");

            Receita re1 = new Receita(1, c1, 02333333, "Medicina pra dor no pé");

            Exame e1 = new Exame(1, c1, 23033333, "qedqae");

            Agenda a1 = new Agenda(1, 13, 01011, m1, p1);

            p1.mostrar();
            p2.mostrar();
//            m1.mostrar();
//            r1.mostrar();
            c1.mostrar();
            e1.mostrar();
            re1.mostrar();
//            a1.mostrar();
//            m1.acessar(re1, e1);
        }
        catch (Exception err) {
            System.out.println("Erro: " + err.getMessage());
        }
    }
}
