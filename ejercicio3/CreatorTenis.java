package ejercicio3;

public class CreatorTenis extends CreatorProductos{
    @Override
    public Tenis create() {
        Tenis tenis = new Tenis();
        tenis.setColor("Blanca");
        tenis.setGarantia("6 meses");
        tenis.setTamano("Estandar");
        tenis.setPrecio("XXXXXX");
        return tenis;
    }
}

