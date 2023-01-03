public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual: " + smartTv.canal);
        System.out.println("Qual o volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv está ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual o volume atual: " + smartTv.volume);

        System.out.println("Qual o canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Qual o canal atual: " + smartTv.canal);
    }
}
