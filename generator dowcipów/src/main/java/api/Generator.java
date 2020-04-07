package api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import odpowiedz.DowcipOdpowiedz;
import util.GsonUtil;

public class Generator {

    //metoda, dzięki której, przy pomocy zdalnego API pobierzemy losowy dowcip w języku angielskim
    public DowcipOdpowiedz losujŻart() throws UnirestException {
        //tworzymy mechanizm, dzięki któremu będziemy mogli wykonać żądanie GET pod podany niżej adres URL
        HttpResponse<String> response = Unirest.get("https://joke3.p.rapidapi.com/v1/joke")
                //ustawiamy host i key, które potrzebne są do uwierzytelniania dostępu do API
                .header("x-rapidapi-host", "joke3.p.rapidapi.com")
                .header("x-rapidapi-key", "ff31d42e6dmsh7e6b9be938d92cfp195c8ejsn8a8dd535fdb8")
                .asString();

        //odpowiednio mapujemy odpowiedź do obiektu, by móc na nim dobrowolnie operować
        return GsonUtil.sprowadzDoObiektu(response.getBody(), DowcipOdpowiedz.class);
    }

}
