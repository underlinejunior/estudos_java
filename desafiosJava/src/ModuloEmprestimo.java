
public class ModuloEmprestimo {
    public static void calcular(double valor,int parcelas) {
        if (parcelas==2){
            double valorFinal = valor +(valor*getTaxaDuasParcelas());
            System.out.println("R$"+valor +" em 2 parcelas: R$ "+ valorFinal);
        }
        else if (parcelas==3){
            double valorFinal = valor +(valor*getTaxaTresParcelas());
            System.out.println("R$"+valor +" em 3 parcelas: R$ "+ valorFinal);
        }else{
            System.out.println("Numero de parcelas não aceito!");
        }
    }
    public static double getTaxaDuasParcelas() {
        return 0.2;
    }
    public static double getTaxaTresParcelas() {
        return 0.3;
    }
}
