import api.Generator;
import api.Tłumacz;
import com.mashape.unirest.http.exceptions.UnirestException;
import odpowiedz.DowcipOdpowiedz;

public class Main {

    public static void main(String[] args) {
        //blok try catch do złapania wyjątku
        try {
            //stworzenie obiektów generator i tłumacz
            Generator generator = new Generator();
            Tłumacz tłumacz = new Tłumacz();

            //wywołanie metody losowania żartu, a następnie jego tłumaczenie
            DowcipOdpowiedz dowcip = generator.losujŻart();
            String przetłumaczonyDowcip = tłumacz.tłumaczDowcip(dowcip.getContent());

            //wypisanie dowcipu w języku angielskim oraz tego przetłumaczonego na konsolę
            System.out.println(dowcip.getContent());
            System.out.println(przetłumaczonyDowcip);
        } catch (UnirestException e) {
            //obsłużenie wyjątku
            System.err.println();
        }
    }

}
