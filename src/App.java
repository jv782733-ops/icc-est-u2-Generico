import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("/////Caja<T>////");

        Caja<String> texto = new Caja<String>("hello");
        Caja<Integer> numero = new Caja<Integer>(100);
        Caja<Double> decimal = new Caja<Double>(9.75);
        Caja<Boolean> boleano = new Caja<Boolean>(false);


        System.out.println("Caja de texto: " + texto.getT());
        System.out.println("Caja de entero: " + numero.getT());
         System.out.println("Caja de decimal: " + decimal.getT());
        System.out.println("¿La caja de texto esta vacia? " + boleano.getT());

        System.out.println("              ");
        System.out.println("              ");

    

        System.out.println("////Uso de Par<K, V>///");
        Par<Integer,String> Clave_uno = new Par<Integer,String>(1,"Messi");
        Par<String, Integer> Clave_dos = new Par<String,Integer>("Edad", 39);
        Par<String, Double> Clave_tres = new Par<String, Double>("Promedio", 9.99);

        System.out.println("Clave: " + Clave_uno.getK() + " | " + " Valor: " + Clave_uno.getV());
        System.out.println("Clave: " + Clave_dos.getK() + " | " + " Valor: " + Clave_dos.getV());
        System.out.println("Clave: " + Clave_tres.getK() + " | " + " Valor: " + Clave_tres.getV());
    }
}

