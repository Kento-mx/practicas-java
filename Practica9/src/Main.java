import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("********* PROGRAMA PARA CALCULAR EL PROMEIO DE CALIFICACIONES *********\n");
        Scanner datos = null;

        try {
            datos = new Scanner(new File("E:\\UABC\\4to Semestre\\Java\\Laboratorio\\Practica9\\lib\\calificaciones.txt"));

        } catch (Exception e) {
            System.out.println(" || ERROR: " + e);
        }

        Alumno alumno1= new Alumno();
        Alumno alumno2= new Alumno();
        Alumno alumno3= new Alumno();
        
        int num = 0, cont1 = 0, cont2=0, cont3=0, i = 0, j=0;
        while (datos.hasNext()) { // hasNext verifica si hay otro dato adelante del escaner.
            if(i < 5){
                num = datos.nextInt(); // Encuentra y asigna un numero.
                cont1 += num;
                alumno1.setCalificaciones(num, j);
                j++;
                if(j == 5) j=0; //Reinicio de J
                i++;
            }

            if(i>=5 & i<10){
                num = datos.nextInt(); // Encuentra y asigna un numero.
                cont2 += num;
                alumno2.setCalificaciones(num, j);
                j++;
                if(j == 5) j=0; //Reinicio de J
                i++;
            }
            
            if(i>=10){
                num = datos.nextInt(); // Encuentra y asigna un numero.
                cont3 += num;
                alumno3.setCalificaciones(num, j);
                j++;
                if(j == 5) j=0;
                i++;
            }
            
        }
        //Alumno 1.
        alumno1.setName("Alan");
        alumno1.setMatricula(127);
        alumno1.setPromedio(cont1/5);
        alumno1.MostrarDatos();
        //Alumno 2
        alumno2.setName("Rodriguez");
        alumno2.setMatricula(235);
        alumno2.setPromedio(cont2/5);
        alumno2.MostrarDatos();
        //Alumno 3
        alumno3.setName("Mauricia");
        alumno3.setMatricula(349);
        alumno3.setPromedio(cont3/5);
        alumno3.MostrarDatos();

        System.out.println("\n ************ GRACIAS POR USAR EL PROGRAMA ************");
    }

}
