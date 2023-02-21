
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        miVehiculoShaydrovaShirshovaMaria2223 miVehiculo;
        int stockActual;
        
        miVehiculo = new miVehiculoShaydrovaShirshovaMaria2223("Seat",18000,100);
        operativaVehiculosShaydrovaShirshova2223(miVehiculo); 
        stockActual = miVehiculo.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosShaydrovaShirshova2223(miVehiculoShaydrovaShirshovaMaria2223 miVehiculo) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculo.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
