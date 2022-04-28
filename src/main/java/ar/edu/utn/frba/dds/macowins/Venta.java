package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.util.List;

public abstract class Venta {
    LocalDate fecha;
    List<Prenda> prendas;

    public Venta(LocalDate _fecha, List<Prenda> _prendas){
        this.fecha = _fecha;
        this.prendas = _prendas;
    }
    public int cantidad(){
        return prendas.size();
    }

    public double factura(){
        return this.prendas
                .stream()
                .mapToDouble(Prenda::precio)
                .sum();
    }

}
