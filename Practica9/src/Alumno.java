public class Alumno {
    String name;
    int matricula;
    int calificaciones[] = new int[5];
    float promedio;

    public Alumno(){

    }
    
    public Alumno(String name, int matricula, int[] calificaciones, float promedio) {
        this.name = name;
        this.matricula = matricula;
        this.calificaciones = calificaciones;
        this.promedio = promedio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificacion, int posicion) {
        this.calificaciones[posicion] = calificacion;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    //Metodo para mostrar datos.
    public void MostrarDatos(){
        System.out.println("| Nombre: " + name);
        System.out.println("| Matricula: " + matricula);
        int i=0;
        System.out.println("| Calificaciones: ");
        while(i<calificaciones.length){
            System.out.print("\n    ["+ calificaciones[i] +"]");
            i++;
        }
        System.out.println("\n| Promedio: " + promedio + "\n\n");
    }

    
}
