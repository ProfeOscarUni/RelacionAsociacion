public class Prueba {
    public static void main(String[] args) {
        Peaje peaje = new Peaje("Estambul", "Valle del Cauca");
        Camion camion1 = new Camion("ABC-123", 3);
        peaje.añadirVehiculo(camion1);
        peaje.calcularPeaje(camion1);
        Camion camion2 = new Camion("ASD-741", 4);
        peaje.añadirVehiculo(camion2);
        peaje.calcularPeaje(camion2);
        Carro carro1 = new Carro("WER-258");
        peaje.añadirVehiculo(carro1);
        peaje.calcularPeaje(carro1);
        peaje.imprimir();
    }
}
