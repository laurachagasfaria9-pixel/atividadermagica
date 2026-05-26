
package chapel;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MainHogwarts {
 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            System.out.println("Nome:");
            String nome = sc.nextLine();

            System.out.println("Idade:");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.println("Coragem:");
            int coragem = Integer.parseInt(sc.nextLine());

            System.out.println("Inteligência:");
            int inteligencia = Integer.parseInt(sc.nextLine());

            System.out.println("Ambição:");
            int ambicao = Integer.parseInt(sc.nextLine());

            System.out.println("Lealdade:");
            int lealdade = Integer.parseInt(sc.nextLine());

            System.out.println("Estratégia:");
            int estrategia = Integer.parseInt(sc.nextLine());

            System.out.println("Criatividade:");
            int criatividade = Integer.parseInt(sc.nextLine());

            // OBJETO

            Aluno aluno = new Aluno(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade,
                    estrategia,
                    criatividade
            );

            // CALCULAR CASA

            aluno.calcularCasa();

            // MOSTRAR RESULTADO

            aluno.exibirInformacoes();

            // CONTINUAR

            System.out.println(
                    "\nDeseja cadastrar outro aluno? (s/n)"
            );

            continuar = sc.nextLine();
        }

        sc.close();
    }
}

