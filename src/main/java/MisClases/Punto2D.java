package MisClases;

/**
 *
 * @author alumno1
 */
public class Punto2D {
    //Atributos
    private float x,y;
    //Constructores
    public Punto2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Punto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    //Métodos set y get
    public void asignarX(float x) { this.x = x; }
    public void asignarY(float y) { this.y = y; }
    public float obtenerX() { return this.x; }
    public float obtenerY() { return this.y; }
    //Otros métodos
    public void Imprimir() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
    public float DistanciaOrigen() {
        return (float)Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public void Mover(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }
}
