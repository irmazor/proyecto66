public class ClientePremium extends persona implements Tiquete {

    private int numeroTarjeta;
    @Override
    public float calcularCosto(float costoBase) {
        float costoReal = (float) (costoBase - (costoBase * 0.5));
        return costoReal;
    }


    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    @Override 
    public void mostrarDatos() {
        System.out.print("Cedula = " + this.cedula
                        + " Nombre = " + this.nombre
                        + " NúmeroTarjeta = " + this.numeroTarjeta);
  }
}
    

