package api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Tłumacz {

    //metoda, dzięki której pobierzemy ze zdalnego API tłumaczenie przekazanego tekstu jako argument
    public String tłumaczDowcip(String dowcip) throws UnirestException {
        String dowcipDopasowanyDoFormatu = dowcip.replace(" ", "%20");
        HttpResponse<String> response = Unirest.get("https://translated-mymemory---translation-memory.p.rapidapi.com/api" +
                "/get?mt=1&onlyprivate=0&de=a%2540b.c&langpair=en%257Cit&q=" + dowcipDopasowanyDoFormatu)
                .header("x-rapidapi-host", "translated-mymemory---translation-memory.p.rapidapi.com")
                .header("x-rapidapi-key", "ff31d42e6dmsh7e6b9be938d92cfp195c8ejsn8a8dd535fdb8")
                .asString();

        return response.getBody();
    }
}
