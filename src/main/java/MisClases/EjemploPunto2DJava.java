package MisClases;

/**
 *
 * @author alumno1
 */
public class EjemploPunto2DJava {

    public static void main(String[] args) {
        Punto2D punto1; //esto solo crea la referencia pero aún no existe el objeto
        punto1 = new Punto2D(); //Aquí se crea el objeto y se llama al constructor por omisión (sin datos)
        System.out.println("PUNTO 1: ");
        punto1.Imprimir();
        //Creamos otro objeto pero pasándole valores
        Punto2D punto2 = new Punto2D(4.5f, 7.3f);
        System.out.println("PUNTO 2: ");
        punto2.Imprimir();
        
        System.out.println("PUNTO 1 ANTES DE MOVER / DESPLAZAR: ");
        punto1.Imprimir();
        punto1.Mover(2.5f, -3.0f);
        System.out.println("PUNTO 1 DESPUÉS DE MOVER / DESPLAZAR: ");
        punto1.Imprimir();
        
        System.out.println("PUNTO 2 ANTES DE MOVER / DESPLAZAR: ");
        punto2.Imprimir();
        punto2.Mover(2.5f, -3.0f);
        System.out.println("PUNTO 2 DESPUÉS DE MOVER / DESPLAZAR: ");
        punto2.Imprimir();
        
        System.out.println("Distancia del punto 1 al origen: " + punto1.DistanciaOrigen());
        System.out.println("Distancia del punto 2 al origen: " + punto2.DistanciaOrigen());
        
        punto1.asignarX(100.0f);
        punto1.asignarY(200.0f);
        System.out.println("PUNTO 1 ASIGNANDO VALORES CON LOS MÉTODOS ASIGNAR (SET): ");
        punto1.Imprimir();
    }
}
