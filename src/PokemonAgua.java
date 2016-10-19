public class PokemonAgua extends Pokemon implements Capturable{
    private String tipo="Agua";
    private String efectivo="Fuego";
    private String debil="Planta";

    public PokemonAgua(String nombre, int ataque, int defensa, int ps){
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
