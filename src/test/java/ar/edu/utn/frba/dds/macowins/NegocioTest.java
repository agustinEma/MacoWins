package ar.edu.utn.frba.dds.macowins;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegocioTest {

    @Test
    public void calculoFacturaDelDía()
    {
        assertEquals(negocioDatosInicio().factura(LocalDate.now()), 13674 ,0);
    }

    @Test
    public void calculoFacturaTotal()
    {
        assertEquals(negocioDatosInicio().factura(), 20548 ,0);
    }

    private List<Prenda> cargaDeLosTresTipos(){
        Prenda pantalon = new Prenda("PANTALON", 1500, new Promocion(200));
        Prenda camisa =  new Prenda("CAMISA", 4000, new Nueva());
        Prenda saco =  new Prenda("SACO", 3000, new Liquidacion());
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(pantalon);
        prendas.add(camisa);
        prendas.add(saco);
        return prendas;
    }

    private Negocio negocioDatosInicio(){
        LocalDate dia = LocalDate.now();
        Venta ventaConTarjetaHoy = ventaConTarjeta(dia);
        Venta ventaConTarjetaAyer = ventaConTarjeta(dia.plusDays(-1));
        Venta ventaConEfectivoHoy = ventaConEfectivo(dia);
        List<Venta> ventas = new ArrayList<>();
        ventas.add(ventaConTarjetaHoy);
        ventas.add(ventaConTarjetaAyer);
        ventas.add(ventaConEfectivoHoy);
        return new Negocio(ventas);
    }

    private Venta ventaConTarjeta(LocalDate dia){
        return new VentaTarjeta(dia, cargaDeLosTresTipos(), 3, 2);
    }

    private Venta ventaConEfectivo(LocalDate dia){
        return new VentaEfectivo(dia,cargaDeLosTresTipos());
    }
}
