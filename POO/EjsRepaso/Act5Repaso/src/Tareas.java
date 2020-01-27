public class Tareas {
    String tarea;
    String fecha;
    String nombreCateg;

    private boolean completado;

    public Tareas(String tarea, String fecha, String nombreCateg) {
        this.tarea = tarea;
        this.fecha = fecha;
        this.nombreCateg = nombreCateg;
    }

    public String getTarea() {
        return tarea;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreCateg() {
        return nombreCateg;
    }
}
