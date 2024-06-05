public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV LIGADA? " + smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " + smartTv.volume);
        
        


        smartTv.ligar();
        System.out.println("novo status = TV LIGADA? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo status = TV LIGADA? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("novo volume = VOLUME: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("novo volume = VOLUME: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("novo canal = CANAL: " + smartTv.canal);

        smartTv.mudarCanal(26);
        System.out.println("novo canal = CANAL: " + smartTv.canal);
    }
}
