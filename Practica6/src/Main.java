public class Main{

    public static void main(String[] args) {
        //Generar el torneo.
        Torneo torneo= new Torneo(5);
        //Introduccion de DATOS del torneo
        torneo.setNombre("GATITOS SALVAJES XD");
        torneo.setRegion("LATINOAMERICA");
        torneo.setPartidosJugados(3);
        torneo.setPartidosPendientes(1);

        System.out.println("~~~~~~~~~~~~~~~~~ BIENVENIDO AL PROGRAMA PARA LAS ESTADISTICAS DEL TORNEO "+ torneo.getNombre() +" ~~~~~~~~~~~~~~~~~");
        System.out.println("¬REGION: "+ torneo.getRegion());
        System.out.println("¬Numero de equipos: "+ torneo.getNumEquipos());
        //Publicar los juegos ya terminados y los pendientes.
        System.out.println("¬Partidos jugados: "+ torneo.getPartidosJugados());
        System.out.println("¬Partidos pendientes: "+ torneo.getPartidosPendientes());


        //Ciclo para imprimir todos los equipos.
        for(int i=0; i<torneo.getNumEquipos(); i++){
            //Ingresar e imprimir datos de los equipos.

            System.out.println("\n             ======================= EQUIPO "+ (i+1) +"! ¬ "+ torneo.equipos[i].getNombreEquipo() + " =======================");
            System.out.println(" ¬Division: " + torneo.equipos[i].getDivision());
            System.out.println(" \n+++ JUGADORES:");
            //Ciclo for para imprmir a los 10 jugadores por equipo.
            for(int j=0; j<10; j++){
                System.out.println("¬Numero de Uniforme: "+ torneo.equipos[i].miembros[j].getNumJugador());
                System.out.println("¬Nombre: "+ torneo.equipos[i].miembros[j].getNombreJugador() + "\n");
            }

            torneo.equipos[i].NumJugadores();
            torneo.equipos[i].PuntosAnotados();

        }
        System.out.println();
    }
}