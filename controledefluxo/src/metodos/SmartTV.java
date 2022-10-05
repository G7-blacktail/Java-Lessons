package metodos;

public class SmartTV {

        
        boolean start = false;
        int channel = 1;
        int volume = 25;

    public void ligar(){
        start= true;
        System.out.println("A TV foi ligada");
    }

    public void desligar(){
        start = false;
        System.out.println("A TV foi desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentado volume para: " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuido volume para: " + volume);
    }


    public void mudarCanal(int novoCanal){
        channel = novoCanal;
        System.out.println("Trocar canal para : " + channel);
    }

    public void aumentarCanal(){
        channel++;
        System.out.println("Aumentado o canal para: " + channel);
    }
    
    public void diminuirCanal(){
        channel--;
        System.out.println("Diminuido o canal para: " + channel);
    }


        

    
}
