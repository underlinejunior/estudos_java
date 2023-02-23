import java.util.Scanner;

public class repeticaoParEimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidade;
        int num;
        int count=0;
        int pares=0;
        int impares=0;

        System.out.println("Quantidade de numeros: ");
        quantidade = scan.nextInt();

        do{
            System.out.println("numero: ");
            num=scan.nextInt();
            count++;
            if(num%2==0) pares++;
            else impares++;

        }while(count<quantidade);
System.out.println(pares+" pares e "+ impares +" impares");
    }
}
