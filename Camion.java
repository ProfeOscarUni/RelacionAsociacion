public class Camion extends Vehiculo {
    static int valorPeajeEje = 5000;
    int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes=numeroEjes;
    
    }

    public static int getValorPeajeEje() {
        return valorPeajeEje;
    }

    public static void setValorPeajeEje(int valorPeajeEje) {
        Camion.valorPeajeEje = valorPeajeEje;
    }

    void imprimir(){
        System.out.println("Placa = "+placa);
        System.out.println("número de ejes = "+numeroEjes);    
        System.out.println("Valor del peaje = "+valorPeajeEje);
    }  
    
}
