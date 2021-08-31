

public class Estudiante {
    String nombre;
    int numControl;
    String materia;
    double calificacion;
    String estado;
    
    //Metodo del constructor para estudiante. 
    //PARAMETROS: Nombre del alumno, num.Control (matricula), materia y la calificacion que ha sacado.
    public Estudiante(String nombre, int numControl, String materia, float calificacion)
    {
        setNombre(nombre);
        setNumControl(numControl);
        setMateria(materia);
        setCalificacion(calificacion);
        AsignarEstado();
    }

    //Setters and gatters.

    public void setNombre(String nombre){ 
	this.nombre = nombre;
    }
	
    public void setNumControl(int numControl){
        this.numControl = numControl;
    }
    
    public void setMateria(String materia){ 
        this.materia = materia;
    }
    
    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
    
    //Sett especial para cambiar la calificacion.
    //Solo le llamo especial por cambiar un poco el formato jaja
    public void cambiarCalificacion(float nuevaCalificacion){
        calificacion = nuevaCalificacion;
    }
    
    /////////////////////////////////////////////////////////////////////
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNumControl(){
        return numControl;
    }
    
    public String getMateria(){
        return materia;
    }
    
    public double getCalificacion(){
        return calificacion;
    }
    
    //Get especial para asignar el estado del alumno. Reprobado o Aprobado.
    //Solo le llamo especial por cambiar un poco el formato jaja
    public String AsignarEstado(){
        if(calificacion >= 60){
            estado = "Aprobado";
        }
        else{
            estado = "Reprobado";
        }
        return estado;
    }

}
