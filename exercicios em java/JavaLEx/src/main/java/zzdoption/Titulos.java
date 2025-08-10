package zzdoption;

public class Titulos {
    private String titulo;
    private Integer id;


    @Override
    public String toString() {
        return "Titulos{" +
                "titulo='" + titulo + '\'' +
                ", id=" + id +
                '}';
    }

    public Titulos(String titulo, int id) {
        this.titulo = titulo;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
