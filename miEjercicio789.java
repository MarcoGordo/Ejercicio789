package Ejercicios789;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.io.InputStream;

public class miEjercicio789 {

    public static void main(String[] args) {

        //Invertir Hola mundo
        String frase = "Hola mundo";
        for(int i = frase.length()-1; i>=0 ; i-- ){
            System.out.print(frase.charAt(i));
        }
        System.out.println(" ");
        // array unidimensional
        int[] uniDim = {1, 2, 3, 4, 5};
        for (int i : uniDim) {
            System.out.println(i);
        }
        //array bidimensional
        int[][] dosDim = {{1, 0}, {0, 1}};
        System.out.println("Elementos y entradas de la matriz identidad:");
        for (int i = 0; i < dosDim.length; i++) {
            for (int j = 0; j < dosDim[i].length; j++) {
                System.out.println("La posición en el array es (" + i + ", " + j + ") y el valor " +
                        "almacenado es " + dosDim[i][j]);
            }
        }

        //Vector
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(1);
        vector.remove(2);
        System.out.println("Las componentes del vector son " + vector);

        /*** Si creamos un vector con la capacidad por defecto, que usualmente es de 10, al momento de copiar 1000
         entradas se estarán haciendo copias, esto es muy costoso a la memoría porque se duplica el
         almacenamiento, y como resultado tenemos un proceso computacionalmente muy costoso ***/

        //ArrayList
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Marco");
        nombres.add("Antonio");
        nombres.add("Ulises");
        nombres.add("Magus Leosona Bella");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        //LinkedList

        LinkedList<String> nombresenlazados = new LinkedList<String>();
        for (int i = 0; i < nombres.size(); i++) {
            nombresenlazados.add(nombres.get(i));
            System.out.println(nombresenlazados.get(i));
        }
        //Creación, llenado y, eliminación de elemntos de un ArrayList con bucles

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i + 1);
        }
        //System.out.println(numeros);
        for (int i = 0; numeros.size() > 5; i++) {
            int elemento = 2 * i + 1;
            numeros.remove(elemento - i);
        }
        System.out.println(numeros);
        System.out.println(dividir(4, 0));
        copiarFichero("/home/marcopulido/Descargas/idea-IC-223.8617.56/LICENSE.txt","/home/marcopulido/Descargas/idea-IC-223.8617.56/destino.txt");
    }
        //Función dividir.
        public static int dividir ( int a, int b) {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                System.out.println("Suponga que puede dividir por 0. Puesto que 0*1 = 0 = 0*2 se sigue " +
                        "0*1 = 0*2, dividiendo por 0 se tiene que 1 = 2. NO PUEDES DIVIDIR POR CERO!!!");
            }
            return 0;
        }
        public static int copiarFichero(String fileIn , String fileOut){
            try {
                InputStream fichero = new FileInputStream(fileIn);

            try{
                PrintStream copia = new PrintStream(fileOut);
                copia.println(fichero.read());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            return 0;
        }
}
