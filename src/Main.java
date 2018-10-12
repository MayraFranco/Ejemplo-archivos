import java.io.File;
import java.io.FileNotFoundException; //excepcion es un objeto que tiene informacion del error
import java.util.Scanner;

public class Main {  //se puede llamar como queramos

    public static void main(String[] args) throws FileNotFoundException {  //ESTE ES EL IMPORTANTE
	    File entrada = new File("entrada.txt");  /** creación del archivo **/
        Scanner escaner = new Scanner(entrada); // el parámetro es el archivo, escaner es quien se encarga de "escanear"el archiv
        double total = 0;
        while(escaner.hasNext())
        {
            total = total + escaner.nextDouble();
        }
        System.out.println(total);
    }
}
// enviar el archivo a la carpeta principal