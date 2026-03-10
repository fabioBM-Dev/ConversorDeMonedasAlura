import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura= new Scanner(System.in);
        ConsultaMonedaApi consulta = new ConsultaMonedaApi();

        System.out.println(""" 
                  
                  ==> BIENVENIDO AL CONVERSOR DE DIVISAS <==  
                       Seleccione la divisa a convertir:
                       ****************************
                       ESCRIBA:
                       COP ==> "PESO COLOMBIANO" (COP$ )
                       USD ==> "DOLAR AMERICANO" (USD$
                       JPY ==> "YEN JAPONÉS" (YEN ¥)
                       UER ==> "EURO EUROPEO" (EUR €)
                       
                       NUEVA ==> "NUEVA CONVERSION"
                       SALIR ==> "PARA SALIR"
                       ****************************
                    """);

        boolean continuar = true;
        while (continuar) {

            System.out.println("Escriba la divisa original: ");
            var buscarDivisaBase = lectura.nextLine().toUpperCase();

            switch (buscarDivisaBase) {
                case "COP", "USD", "JPY", "EUR" -> {
                    // 1. Llama a la API usando la opción elegida como base
                    DatosMonedaApi datos = consulta.buscarMoneda(buscarDivisaBase);
                    // 2. Pedir datos de conversión
                    System.out.println("Ingrese la cantidad ($) a convertir: ");
                    var cantidadAConvertir = Integer.parseInt(lectura.nextLine());

                    System.out.println("Escriba la divisa objetivo: ");
                    var buscarDivisaDestino = lectura.nextLine().toUpperCase();

                    // 3. Calcular
                    Double tasa = datos.conversion_rates().get(buscarDivisaDestino.toUpperCase());
                    double resultado = cantidadAConvertir * tasa;

                    System.out.println("******************************************");
                    System.out.println(buscarDivisaBase+"$ " + cantidadAConvertir + " " +
                            " equivalen a: " + buscarDivisaDestino+"$ "+ resultado + " ");
                    System.out.println("******************************************");
                    System.out.println("");
                    System.out.println("Iniciando nueva conversion...");
                }
                case "SALIR" -> {
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                }
                default -> System.out.println("Opción no válida, Intente de nuevo.");
            }
        }

    }

}

