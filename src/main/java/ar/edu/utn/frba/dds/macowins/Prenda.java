package ar.edu.utn.frba.dds.macowins;

public class Prenda {
    String nombre;
    double precio;
    Estado estado;

    public Prenda(String _nombre, double _precio, Estado _estado){
        this.nombre = _nombre;
        this.precio = _precio;
        this.estado = _estado;
    }

    public  String getNombre(){return this.nombre; }
    public double precio(){
        return estado.precio(this.precio);
    }
}
