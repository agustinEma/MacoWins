package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.util.List;

public class VentaTarjeta extends Venta{
    int cuotas;
    double coeficiente;
    public VentaTarjeta(LocalDate _fecha,
                        List<Prenda> _prendas,
                        int _cuotas,
                        double _coeficiente) {
        super(_fecha, _prendas);
        this.cuotas = _cuotas;
        this.coeficiente = _coeficiente;
    }

    @Override
    public double factura(){
        double total = this.prendas
                .stream()
                .mapToDouble(prenda -> prenda.precio() + (prenda.precio() * 0.01))
                .sum();
        return ((cuotas*coeficiente) + total);
    }
}
