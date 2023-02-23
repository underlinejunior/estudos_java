/*DESAFIO
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
ENTRADA
A entrada contém 6 números que podem ser valores inteiros ( int ) ou de ponto flutuante ( float ou double ). Pelo menos um destes números será positivo.
SAÍDA
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados. */

import java.io.IOException;
import java.util.Scanner;

public class DesafioPositivosEmedia {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;

        // TODO: Implemente as condições adequadas para obter a quantidade
        // de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            System.out.print("valor: ");
            x = leitor.nextDouble();
            if (x > 0) {
                media = media + x;
                cont++;
            }
        }

        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }

}
