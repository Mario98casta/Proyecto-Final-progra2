package model;

public class Comentarios {
     public String idcomentarios;
    public String nombre;
    public String comentarios;

    public Comentarios(String idcomentarios, String nombre, String comentarios) {
        this.idcomentarios = idcomentarios;
        this.nombre = nombre;
        this.comentarios = comentarios;
    }

    public String getIdcomentarios() {
        return idcomentarios;
    }

    public void setIdcomentarios(String idcomentarios) {
        this.idcomentarios = idcomentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }


    @Override
    public String toString() {
        return "Comentarios{" +
                "idcomentarios='" + idcomentarios + '\'' +
                ", nombre='" + nombre + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
