package ar.edu.utn.frba.dds.macowins;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VentaTest {

    @Test
    public void calculoCantidadDePrendaVentaEfectivo() {
        assertEquals(ventaConEfectivo().cantidad(), 3 ,0);
    }

    @Test
    public void calculoCantidadDePrendaVentaTarjeta() {
        assertEquals(ventaConTarjeta().cantidad(), 3 ,0);
    }

    @Test
    public void calculoFacturaVentaEfectivo() {
        assertEquals(ventaConEfectivo().factura(), 6800 ,0);
    }

    @Test
    public void calculoFacturaVentaTarjeta() {
        assertEquals(ventaConTarjeta().factura(), 6874 ,0);
    }


    private List<Prenda> cargaDeLosTresTipos(){
        Prenda pantalon = new Prenda("PANTALON",1500, new Promocion(200));
        Prenda camisa =  new Prenda("CAMISA", 4000, new Nueva());
        Prenda saco =  new Prenda("SACO", 3000, new Liquidacion());
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(pantalon);
        prendas.add(camisa);
        prendas.add(saco);
        return prendas;
    }

    private Venta ventaConTarjeta(){
        return new VentaTarjeta(LocalDate.now(), cargaDeLosTresTipos(), 3, 2);
    }

    private Venta ventaConEfectivo(){
        return new VentaEfectivo(LocalDate.now(),cargaDeLosTresTipos());
    }
}
