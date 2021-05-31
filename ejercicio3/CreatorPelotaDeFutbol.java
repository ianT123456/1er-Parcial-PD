package ejercicio3;

public class CreatorPelotaDeFutbol  extends CreatorProductos{
    @Override
    public PelotaDeFutbol create() {
        PelotaDeFutbol pelotaDeFutbol = new PelotaDeFutbol();
        pelotaDeFutbol.setColor("Blanca");
        pelotaDeFutbol.setGarantia("6 meses");
        pelotaDeFutbol.setTamano("Estandar");
        pelotaDeFutbol.setPrecio("XXXXXX");
        return pelotaDeFutbol;
    }
}
