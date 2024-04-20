import java.util.Vector;

public class Peaje {
    String nombre;
    String departamento;
    int totalPeaje = 0;
    Vector vehiculos;
    static int totalCamiones = 0;
    static int totalCarros = 0;

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new Vector<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public int calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) {
            totalCarros++;
            totalPeaje = totalPeaje + Carro.valorPeaje;
            return Carro.valorPeaje;
        } else if (vehiculo instanceof Camion) {
            totalCamiones++;
            Camion camion = (Camion) vehiculo;
            totalPeaje += camion.numeroEjes * camion.valorPeajeEje;
            return camion.numeroEjes * camion.valorPeajeEje;
        } else
            return -1;
    }

    public void imprimir() {
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicación = " + getDepartamento());
        System.out.println("Total de Carros = " + totalCarros);
        System.out.println("Total de camiones = " + totalCamiones);
        System.out.println("Total de vehiculos = " + (totalCarros + totalCamiones));
        System.out.println("Dinero recibido por el peaje = " + totalPeaje);
    }

}
