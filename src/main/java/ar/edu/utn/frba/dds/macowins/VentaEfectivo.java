package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.util.List;

public class VentaEfectivo extends Venta{

    public VentaEfectivo(LocalDate _fecha, List<Prenda> _prendas) {
        super(_fecha, _prendas);
    }

    @Override
    public double factura(){
        return super.factura();
    }
}
