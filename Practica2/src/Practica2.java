
public class Practica2 {

    public static void main(String[] args) {
        //Arreglo de estudiantes.
        Estudiante estudiantes[] = new Estudiante[10];

        //Inicializacion de los 5 estudiantes con sus respectivos datos.
        estudiantes[0] = new Estudiante("David", 1236487, "POO", 90);
        estudiantes[1] = new Estudiante("Miguel", 1284597,"POO", 82);
        estudiantes[2] = new Estudiante("Luis", 1478956, "POO", 73);
        estudiantes[3] = new Estudiante("Erick", 2536598, "POO", 32);
        estudiantes[4] = new Estudiante("Alan", 1277895, "POO", 100);
        
        System.out.println("********** BIENVENIDO/A **********\n");
        //Inicio de Menu.
        int op;
        do{
            op = 0;
            System.out.println("******** MENU ********");
            System.out.println("1) Capturar Alumnos.");
            System.out.println("2) Mostrar Alumnos.");
            System.out.println("3) Cambiar calificacion.");
            System.out.println("4) Salir.\n");
            op = CapturaEntrada.capturarEntero("Opcion");
            System.out.println();

            if(op == 1){
                //Asignacion de alumnos mediante el usser.
                for(int i = 5; i<10;i++){
                    estudiantes[i] = new Estudiante(CapturaEntrada.capturarCadena("Nombre"), CapturaEntrada.capturarEntero("Matricula"), CapturaEntrada.capturarCadena("Materia"), CapturaEntrada.capturarFlotante("Calificacion"));
                }
            }else if(op == 2){
                //Cuando solo tenemos los alumnos fijados.
                if(estudiantes[5] == null){
                    for(int i = 0;i<5;i++){
                        System.out.println("~No. Alumno: " + (i+1));
                        System.out.println("~Nombre: " + estudiantes[i].getNombre());
                        System.out.println("~Num. Control (Matricula): " + estudiantes[i].getNumControl());
                        System.out.println("~Materia: "+ estudiantes[i].getMateria());
                        System.out.println("~Calificacion: " + estudiantes[i].getCalificacion());
                        System.out.println("~Estado de la materia: " + estudiantes[i].estado);
                        System.out.println();
                    }
                }
                 //Cuando tenemos 10
                else{
                    for(int i = 0;i<10;i++) {
                        System.out.println("~No. Alumno: " + (i+1));
                        System.out.println("~Nombre: " + estudiantes[i].getNombre());
                        System.out.println("~Num. Control (Matricula): " + estudiantes[i].getNumControl());
                        System.out.println("~Materia: "+ estudiantes[i].getMateria());
                        System.out.println("~Calificacion: " + estudiantes[i].getCalificacion());
                        System.out.println("~Estado de la materia: " + estudiantes[i].AsignarEstado());
                        System.out.println();
                    }
                }
            }else if(op == 3){
                //Cuando solo tenemos los alumnos fijados.
                if(estudiantes[5] == null){
                    for(int i = 0;i<5;i++){
                        estudiantes[i].setCalificacion(CapturaEntrada.capturarFlotante("Calificacion nueva " + estudiantes[i].getNombre()));
                    }
                }
                //Cuando tenemos 10.
                else{
                    for(int i = 0;i<10;i++){
                        estudiantes[i].setCalificacion(CapturaEntrada.capturarFlotante("Calificacion nueva " + estudiantes[i].getNombre()));
                    }
                }
            }else{
                System.out.println("**** INSERTA UN VALOR DEL MENÚ ****");
            }
            
        }while(op != 4); //Fin de menu.
    }
}

