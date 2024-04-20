public class Carro extends Vehiculo {
    static int valorPeaje = 10000;
    public Carro(String placa) {
        super(placa);
    }
    public static int getValorPeaje() {
        return valorPeaje;
    }
    public static void setValorPeaje(int valorPeaje) {
        Carro.valorPeaje = valorPeaje;
    }
    void imprimir(){
        System.out.println("Placa = "+placa);
        System.out.println("Valor del peaje = "+valorPeaje);
    }
    
    
}
