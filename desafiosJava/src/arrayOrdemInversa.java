public class arrayOrdemInversa {

    public static void main(String[] args) {

        int[] vetor = { -3, -7, 10, 8 ,5};
        int[] inverso = new int[vetor.length];
        int count=0;
        
        for( int i = vetor.length - 1 ; i>=0 ; i-- ){
            inverso[count] = vetor[i];
            System.out.print(inverso[count] + " ");
            count++;
        }
    }
}
