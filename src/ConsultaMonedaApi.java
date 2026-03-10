import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedaApi {

    public DatosMonedaApi buscarMoneda(String codigoBusqueda) {
        // 1. Usamos una variable para que la URL sea dinámica
        String apiKey = "35814068c33c49212673508b";
        //        String monedaBase = "USD";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + codigoBusqueda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            // 2. Enviamos la petición
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // 3. Convertir ese String JSON directamente a tu Record 'DatosMonedaApi'
            return new Gson().fromJson(response.body(), DatosMonedaApi.class);
        } catch (IOException | InterruptedException e) {
            //4. Para posibles errores por conexión
            throw new RuntimeException("No se pudo realizar la conversión: " + e.getMessage());
        }
    }

}