import java.util.Scanner;

public class repeticaoFatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = ler.nextInt();
        int acumulador=1;
        
        for(int i = fatorial;i>0;i--){
            acumulador=acumulador * i;
        }
        System.out.println( fatorial +"! = "+ acumulador);
    }
    
}
