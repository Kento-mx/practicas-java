
import java.util.*;

/*
Esta clase es un metodo para poder capturar informacion a traves de la consola.
Debido que la informacion puesta en esta misma, siempre será de tipo String,
asi que en cada funcion (llena de instrucciones) pasamos este String mediante parametros.
Por eso, es importante aclarar el tipo de dato que solicitamos y que esta clase está preparada para
4 posibles casos: Int, Float, Double y String. 
*/
public class CapturaEntrada{

    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }

    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }

    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }

    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

    //En caso de capturar un dato char.
    public static char capturarChar(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.next().charAt(0));
    }
}