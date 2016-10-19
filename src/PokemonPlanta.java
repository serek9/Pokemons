public class PokemonPlanta extends Pokemon implements Capturable{
    private String tipo="Planta";
    private String efectivo="Agua";
    private String debil="Fuego";

    public PokemonPlanta(String nombre, int ataque, int defensa, int ps){
        super(nombre, ataque, defensa, ps);

    }

    public String getTipo() {return tipo;}
    public String getEfectivo() {return efectivo;}
    public String getDebil() {return debil;}

    //TODO
    public boolean capturar() {
        return false;
    }
}