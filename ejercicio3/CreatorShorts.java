package ejercicio3;

public class CreatorShorts extends CreatorProductos{
    @Override
    public Shorts create() {
        Shorts shorts = new Shorts();
        shorts.setColor("verde");
        shorts.setGarantia("3 meses");
        shorts.setTamano("M");
        shorts.setPrecio("XXXXXX");
        return shorts;
    }
}
