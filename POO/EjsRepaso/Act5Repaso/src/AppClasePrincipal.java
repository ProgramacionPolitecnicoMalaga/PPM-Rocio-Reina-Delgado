import java.util.ArrayList;

public class AppClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Categoria> categoria = new ArrayList <Categoria>();
        ArrayList<Tareas> tarea = new ArrayList<>();

        // Crear nueva cantegoria
             System.out.println("NUEVA CATEGORIA:");

        Categoria c1= new Categoria("Ocio");
        categoria.add(c1);

        Categoria c2= new Categoria("Clase");
        categoria.add(c2);

        Categoria c3= new Categoria("Trabajo");
        categoria.add(c3);

        //Mostrar categorias existentes
            System.out.println("MOSTRAR CATEGORIA EXISTENTES:");

        for (Categoria categ :  categoria){
            System.out.println(categ.getNombre());
        }

        //Nueva tarea
        System.out.println("NUEVA TAREA:");

        Tareas t1= new Tareas( "Tarea1" ,"11/2/2020", "Ocio");
        tarea.add(t1);

        Tareas t2= new Tareas( "Tarea2" ,"20/05/2019", "Clase");
        tarea.add(t2);

        // Mostrar tarea
        System.out.println("MOSTRAR TAREA:");

        for (Tareas tar: tarea){
            System.out.println(tar.getTarea());
        }

        //Eliminar tarea
        System.out.println("ELIMINAR TAREA:");
        Tareas tarea1 = null;
        for (Tareas tar: tarea){
            if (tar.getTarea().equals("Tarea1")){
                tarea1 = tar;
            }
        }
        tarea.remove(tarea1);
    }
}
