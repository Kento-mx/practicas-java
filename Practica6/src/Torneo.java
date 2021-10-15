public class Torneo {
    public String nombre;
    public String region;
    public int numEquipos;
    public int partidosJugados;
    public int partidosPendientes;
    public Equipo equipos []= new Equipo[5];
    
    //Constructor basico.
    public Torneo(int numEquipos){
        setNumEquipos(numEquipos);
        for(int i=0; i<numEquipos; i++){
            equipos[i]= new Equipo();
            equipos[i].setNombreEquipo("Gatunos " + (i+1));
            equipos[i].setDivision("LATAM poder " + (i+1));
        }
    }
    
    //Setters and getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public int getNumEquipos() {
        return numEquipos;
    }
    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public int getPartidosPendientes() {
        return partidosPendientes;
    }
    public void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }

}
