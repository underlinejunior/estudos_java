public class ModuloMensagem {
    public static void obterMensagem(int hora) {
        if(hora<12 && hora>5){
            System.out.println("Bom dia!");
        }else if(hora>=12 && hora<18){
            System.out.println("Boa Tarde!");
        }else if((hora>=18 && hora<24) || (hora>0 && hora<=5)){
            System.out.println("Boa Noite!");
        }else{
            System.out.println(horaInvalida());

        }

    }
    public static String horaInvalida() {
        return "Hora invalida!";  
    }
}
