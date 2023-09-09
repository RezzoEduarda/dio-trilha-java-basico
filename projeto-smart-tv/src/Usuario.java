public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo StatusTv -> Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
