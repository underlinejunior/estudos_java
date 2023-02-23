import java.util.Scanner;

public class repeticaoMaiorEmedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = 0;
        float media = 0;
        int count = 0;
        do {
            System.out.println("Numero: ");
            num = scan.nextInt();
            if (num > maior)
                maior = num;
            media += num;
            count++;
        } while (count < 5);
        System.out.println("O maior numero é: " + maior);
        System.out.println("A média é: " + (media / count));
    }

}
