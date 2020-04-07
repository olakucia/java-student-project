package odpowiedz;

public class DowcipOdpowiedz {

    //klasa przechowująca dane z odpowiedzi z API

    private String id;
    private String content;
    private String nsfw;
    private int upvotes;
    private int downvotes;

    //getter do pobrania wartości pola content (nasz dowcip)
    public String getContent() {
        return this.content;
    }

}
