package br.com.newtonpaiva.dominio.questao2;
import java.util.Scanner;
public class Estoque
{
    public static void main(String[] args)
    {
        int[][] estoque = new int[4][5];
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar)
        {
            System.out.print("Digite o número do armário (0 a 4): ");
            int armario = scanner.nextInt();

            System.out.print("Digite o número da prateleira (0 a 3): ");
            int prateleira = scanner.nextInt();

            if (armario >= 0 && armario < 5 && prateleira >= 0 && prateleira < 4)
            {
                if (estoque[prateleira][armario] < 10)
                {
                    estoque[prateleira][armario]++;
                    System.out.println("Caixa inserida com sucesso!");
                } else
                {
                    System.out.println("Espaço insuficiente na prateleira. Máximo de 10 caixas.");
                }
            } else
            {
                System.out.println("Armário ou prateleira inválidos.");
            }

            System.out.print("Deseja inserir mais uma caixa? (S/N): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("N"))
            {
                continuar = false;
            }
        }

        for (int prateleira = 0; prateleira < 4; prateleira++)
        {
            for (int armario = 0; armario < 5; armario++)
            {
                System.out.print("Armário " + armario + ", Prateleira " + prateleira + ": " + estoque[prateleira][armario] + " caixas\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}