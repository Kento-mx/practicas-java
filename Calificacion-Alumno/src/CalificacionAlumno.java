

import java.util.Scanner;


public class CalificacionAlumno {

    public static void main(String[] args) {
        System.out.println("******* BIENVENIDO/A! PROGRAMA PARA PROMEDIAR A UN ALUMNO *******");
        
        //Datos del objeto
        String nombre= "alumno";
        float cal1=0, cal2=0, cal3=0, cal4=0, cal5=0;

        int opcion = 0;
        Boolean OnAlumno= false;

        do {
            System.out.println("\n ~| Escoge una de las siguentes opciones: ");
            System.out.println("1) Captura el nombre y calificaciones del alumno.");
            System.out.println("2) Imprimir calificaciones y promedio.");
            System.out.println("3) Imprimir calificaciones y la calificacion mas baja.");
            System.out.println("4) Imprimir calificaciones y la calificacion mas alta.");
            System.out.println("5) Salir. |~");
            
            System.out.print(" +Opcion: ");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            
            //Funciones.
            if(opcion == 1){
                System.out.println("Ingresa los datos (Nombre Cal1 Cal2 Cal3 Cal4 Cal5): ");
                Scanner entrada = new Scanner(System.in);
                nombre = entrada.nextLine();
                cal1 = entrada.nextFloat();
                cal2 = entrada.nextFloat();
                cal3 = entrada.nextFloat();
                cal4 = entrada.nextFloat();
                cal5 = entrada.nextFloat();
                
                //Indicador de que Alumno ha sido creado.
                OnAlumno = true;
            }

            //La codicion en el resto de IFs, es para que entre solamente cuando los datos del alumno han sido creados.
            if((opcion == 2) && (OnAlumno==true) ){
                float promedio;

                promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;

                System.out.println("===============================");
                System.out.println("      Calificaciones de "+nombre+".");
                System.out.println("~Cal1: "+cal1);
                System.out.println("~Cal2: "+cal2);
                System.out.println("~Cal3: "+cal3);
                System.out.println("~Cal4: "+cal4);
                System.out.println("~Cal5: "+cal5);
                System.out.println("~Promedio: "+promedio);
                System.out.println("===============================");
            }
            if((opcion == 3) && (OnAlumno == true)){
                float menor;
                menor = cal1;
                
                if(menor > cal2){
                    menor = cal2;
                }
                if(menor > cal3){
                    menor = cal3;
                }

                if(menor > cal4){
                    menor = cal4;
                }
                
                if(menor > cal5){
                    menor = cal5;
                }
                
                System.out.println("===============================");
                System.out.println("      Calificaciones de "+nombre+".");
                System.out.println("~Cal1: "+cal1);
                System.out.println("~Cal2: "+cal2);
                System.out.println("~Cal3: "+cal3);
                System.out.println("~Cal4: "+cal4);
                System.out.println("~Cal5: "+cal5);
                System.out.println("~Calificacion mas baja: "+menor);
                System.out.println("===============================");
            }
            if((opcion == 4) && (OnAlumno == true)){
                float mayor;
                mayor = cal1;
                
                if(mayor < cal2){
                    mayor = cal2;
                }
                if(mayor < cal3){
                    mayor = cal3;
                }

                if(mayor < cal4){
                    mayor = cal4;
                }

                if(mayor < cal5){
                    mayor = cal5;
                }

                System.out.println("===============================");
                System.out.println("      Calificaciones de "+nombre+".");
                System.out.println("~Cal1: "+cal1);
                System.out.println("~Cal2: "+cal2);
                System.out.println("~Cal3: "+cal3);
                System.out.println("~Cal4: "+cal4);
                System.out.println("~Cal5: "+cal5);
                System.out.println("~Calificacion mas alta: "+mayor);
                System.out.println("===============================");
            }

            //Validar cuando intenta ingresar a una opcion, sin tener datos del alumnon registrado.
            if((opcion < 5) && (OnAlumno == false)){
                System.out.println("\n***!!! INGRESA DATOS DEL ALUMNO. PRESIONA LA OPCION 1, POR FAVOR. !!!***");
            }
            
        }while(opcion != 5);

        System.out.println("\n\n ********* GRACIAS POR USAR EL PROGRAMA *********");
    }

}

