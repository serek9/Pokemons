import java.util.Random;

public class PokemonFuego extends Pokemon implements Capturable{
    private String tipo="Fuego";
    private String efectivo="Planta";
    private String debil="Agua";

    public PokemonFuego(String nombre, int ataque, int defensa, int ps){
        super(nombre, ataque, defensa, ps);

    }

    public String getTipo() {return tipo;}
    public String getEfectivo() {return efectivo;}
    public String getDebil() {return debil;}

    //TODO
    public boolean capturar() {
        int r = randomInt();
        if (r-getPs()>getDefensa()){
            System.out.println(getNombre()+" CAPTURADO!");
            return true;
        }
        else {
            System.out.println(getNombre()+" NO CAPTURADO!");
            return false;
        }
    }

    public static int randomInt(){
        Random r = new Random();
        return r.nextInt((45-1)+1)+45;
    }
}