package ar.edu.utn.frba.dds.macowins;

public class Promocion implements Estado {
    double descuento;

    public  Promocion(double _descuento){
        this.descuento = _descuento;
    }

    public  double precio(double precioBase) {
        return  precioBase - this.descuento;
    }
}
