package metodos;

public class Usuario {
    public static void main(String[] args) {
        

        SmartTV smartTv = new SmartTV();

        System.out.println("TV liagada? : " + smartTv.start);
        System.out.println("Canal atual? : " + smartTv.channel);
        System.out.println("Volume atual? : " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status: --> " + smartTv.start);

        smartTv.ligar();
        System.out.println("Novo Status: --> " + smartTv.start);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(25);
        smartTv.diminuirCanal();

        smartTv.desligar();


        
        
    }
}
