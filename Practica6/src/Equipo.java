//Tienen que ser 5 equipos
public class Equipo {
    public String nombreEquipo;
    public String division= "hola";
    public Jugador miembros[]= new Jugador[10];
    protected int sumaPuntos=0;
    protected int torneoParticipaciones;
    protected int torneoGanados;
    protected int torneoPerdidos;


    
    //For para integracion de membros.
    public Equipo(){
        for(int i=0; i<miembros.length; i++){
            miembros[i]= new Jugador();
            miembros[i].setNumJugador(i);
            miembros[i].setNombreJugador("Miembro"+(i+1));
            miembros[i].setPuntosAnotados(2);
        }
    }

    //Metodo para la cantdad de jugadores
    public void NumJugadores(){
        System.out.println("°Cantidad de jugadores registrados del equipo: "+miembros.length);
    }
    
    //Mostrar puntos anotados del equipo.
    public void PuntosAnotados(){
        for(int i=0; i < miembros.length; i++){
            sumaPuntos+=miembros[i].getPuntosAnotados();
        }
        System.out.println("°Cantidad de puntos anotados del equipo: " + sumaPuntos);
    }

    //Setters and getter
    public String getNombreEquipo() {
        return nombreEquipo;
    }


    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }


    public String getDivision() {
        return division;
    }


    public void setDivision(String division) {
        this.division = division;
    }
    
}