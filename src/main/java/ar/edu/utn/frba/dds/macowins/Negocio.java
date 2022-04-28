package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {

    List<Venta> ventas;

    public Negocio(List<Venta> _ventas){
        this.ventas = _ventas;
    }

    public double factura(LocalDate unDía){

        return  this.ventas
                .stream()
                .filter(venta -> venta.fecha.equals(unDía))
                .mapToDouble(Venta::factura)
                .sum();
    }

    public double factura(){

        return  this.ventas
                .stream()
                .mapToDouble(Venta::factura)
                .sum();
    }
}
