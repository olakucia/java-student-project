package util;

import com.google.gson.Gson;

public class GsonUtil {

    //obiekt biblioteki, która udostępnia zmianę tekstu pisanego na obiekt (tzw. mapping)
    private static final Gson gson = new Gson();

    //używamy typu generycznego, tzn. metoda ta jest w stanie zwrócić obiekt każdego typu, przekazanego jako argument wywołania
    public static <T> T sprowadzDoObiektu(String odpowiedz, Class<T> klasa) {
        return gson.fromJson(odpowiedz, klasa);
    }

}
