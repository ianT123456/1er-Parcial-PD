package ejercicio3;

public class Cliente {
    public  static void main (String[]args){
           /*
        PasajeSolidario pasaje8 =  new CreatorPasajeSolidario().create();
            Pasajero pasajero1 =  new Pasajero();
           pasajero1.setNombre("Marcos salinas");
           pasajero1.setCi("12343455");
        pasaje8.setPasajero(pasajero1);
        pasaje8.crear();
     */

        Camiseta camiseta1 = new CreatorCamiseta().create();
        camiseta1.setPrecio("75 bs");

        Tenis tenis1 = new CreatorTenis().create();
        tenis1.setPrecio("250 bs");

        Medias medias1 = new CreatorMedias().create();
        medias1.setPrecio("30 bs");

        Shorts shorts1 = new CreatorShorts().create();
        shorts1.setPrecio("50 bs");

        PelotaDeFutbol pelotaDeFutbol1 = new CreatorPelotaDeFutbol().create();
        pelotaDeFutbol1.setPrecio("100 bs");

        camiseta1.crear();
        medias1.crear();
        shorts1.crear();
        pelotaDeFutbol1.crear();
        tenis1.crear();
    }


}
