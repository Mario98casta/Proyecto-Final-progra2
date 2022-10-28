package model;

public class Noticias {
    public String id;
    public String Title;
    public String byline;
    public String texto;
    public String url;

    public Noticias(String id, String title, String byline, String texto, String url) {
        this.id = id;
        Title = title;
        this.byline = byline;
        this.texto = texto;
        this.url = url;
    }

    public Noticias(String title, String byline, String texto, String url) {
        Title = title;
        this.byline = byline;
        this.texto = texto;
        this.url = url;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Noticias{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", byline='" + byline + '\'' +
                ", texto='" + texto + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
