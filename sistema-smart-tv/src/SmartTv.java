public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para " + volume);

    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal aumentado para " + volume);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal diminuido para " + volume);

    }



    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


}
