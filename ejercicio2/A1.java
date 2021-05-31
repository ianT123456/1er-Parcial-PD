package ejercicio2;

public class A1 implements Esbozo{
    private String modelo;
    private String peso;
    private Camara camara;
    private String imei;
    private String paisCreado;

    public A1(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getPaisCreado() {
        return paisCreado;
    }

    public void setPaisCreado(String paisCreado) {
        this.paisCreado = paisCreado;
    }

    @Override
    public Object clone() {
        A1 objClone = new A1();
        objClone.setModelo(this.modelo);
        objClone.setImei(this.imei);
        objClone.setPaisCreado(this.paisCreado);
        objClone.setCamara(this.camara);
        objClone.setPeso(this.peso);
        return objClone;
    }

    public void showInformation() {
        System.out.println("Modelo: " + modelo);
        System.out.println("PaisCreado: " + paisCreado);
        System.out.println("Camara: " + camara.getFoco()  + camara.getLente());
        System.out.println(" Peso: " + peso);
        System.out.println("Imei: " + imei);
    }
}

