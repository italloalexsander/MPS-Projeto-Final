package business.model;

import java.io.Serializable;

public class Tag implements Serializable{
    private String texto;
    private Usuario autor;

    public ComentarioTag(String texto, Usuario autor) {
        this.texto = texto;
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

}