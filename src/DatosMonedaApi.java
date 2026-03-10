import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record DatosMonedaApi(
        String base_code,
        Map<String, Double> conversion_rates,
        String time_last_update_utc) {
}
