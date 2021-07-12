public class ClientePremium extends persona implements Tiquete{

    private int numeroTarjeta
    @Override
    public float calcularCosto (float costoBase) {
        float costoReal = (float) (costoBase - (costoBase * 0.5));
        return costoReal;

    }
}
    

