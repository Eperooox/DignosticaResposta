package br.com.newtonpaiva.dominio.questao1;
public class  Vetor
{
    public static void main(String[] args)
    {
        int [] vetor = {15, 40, 10, 50, 25, 30, 45, 5};


        for(int i=0; i < vetor.length; i++)
        {
            System.out.print(vetor[i] + " ");
            System.out.println();
        }

        int maior30= 0;
        int somam30 = 0;
        int somat = 0;

        for (int i = 0; i < vetor.length; i++)
        {
            somat += vetor[i];

            if (vetor[i] > 30)
            {
                maior30 ++;
                somam30 += vetor[i];
            }
        }
        System.out.println("Quantidade de números maiores que 30: " + maior30);
        System.out.println("Soma dos números maiores que 30: " + somam30);
        System.out.println("Soma total dos elementos do vetor: " + somat);
    }
}
