package ejercicio3;

public class CreatorMedias  extends CreatorProductos{
    @Override
    public Medias create() {
        Medias medias = new Medias();
        medias.setColor("Azules");
        medias.setGarantia("1 meses");
        medias.setTamano("pequeñas");
        medias.setPrecio("XXXXXX");
        return medias;
    }
}