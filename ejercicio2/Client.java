package ejercicio2;

public class Client {
    public static void main (String[] args) {
        A1 Esbozo = new A1();
        Esbozo.setModelo("A1");
        Esbozo.setPaisCreado("Bolivia");
        Esbozo.setPeso("60");
        Esbozo.setImei("0000");
        Esbozo.setCamara(new Camara("10","5mp"));

        A1 Tuno = (A1) Esbozo.clone();
        Tuno.setImei("10001");

        A1 Tdos = (A1) Esbozo.clone();
        Tdos.setImei("10002");

        A1 Ttres = (A1) Esbozo.clone();
        Ttres.setImei("10003");

        A1 Tcuatro = (A1) Esbozo.clone();
        Tcuatro.setImei("10004");

        A1 Tcinco = (A1) Esbozo.clone();
        Tcinco.setImei("10005");

        Tuno.showInformation();
        Tdos.showInformation();
        Ttres.showInformation();
        Tcuatro.showInformation();
        Tcinco.showInformation();

    }
}
