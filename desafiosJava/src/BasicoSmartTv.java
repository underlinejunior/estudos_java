public class BasicoSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        ligada = true;
        System.out.println("A TV está ligada!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("A TV está desligada!");
    }

    public void aumentarVolume() {
        if (ligada == true) {
            volume++;
            System.out.println("Volume aumentou para " + volume);
        } else {
            System.out.println("A TV está desligada!");
        }
    }

    public void diminuirVolume() {
        if (ligada == true) {
            volume--;
            System.out.println("Volume diminuiu para " + volume);
        } else {
            System.out.println("A TV está desligada!");
        }
    }

    public void aumentarCanal() {
        if (ligada == true) {
            canal++;
            System.out.println("Canal alterado para " + canal);
        } else {
            System.out.println("A TV está desligada!");
        }
    }

    public void diminuirCanal() {
        if (ligada == true) {
            canal--;
            System.out.println("Canal alterado para " + canal);
        } else {
            System.out.println("A TV está desligada!");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada == true) {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        } else {
            System.out.println("A TV está desligada!");
        }
    }
}