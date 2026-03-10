
public class Moneda {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidadOriginal;
    private double resultadoConversion;

    // Constructor para inicializar los datos dspués del cálculo
    public Moneda(String monedaBase, String monedaObjetivo, double cantidadOriginal, double tasa)  {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.cantidadOriginal = cantidadOriginal;
        this.resultadoConversion = cantidadOriginal * tasa;
    }

    @Override
    public String toString(){
        return String.format("%2f [%s] equivalen a %2f [%s]",
                cantidadOriginal, monedaBase, resultadoConversion, monedaObjetivo);
    }
}


