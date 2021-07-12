public class Cliente extends persona implements Tiquete{

    private int id;

    @Override
    public float calcularCosto (float costoBase) {
        float costoReal = costoBase - 1000;
        return costoReal;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override 
    public void mostrarDatos() {
        System.out.print("Cedula = " + this.cedula
                        + " Nombre = " + this.nombre
                        + " ID = " + this.id);

    }
}



