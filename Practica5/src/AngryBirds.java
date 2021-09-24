public class AngryBirds {
    int opcion;

    
    public int getOpcion() {
        return opcion;
    }
    
    
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    
    //Main
    public static void main(String[] args) {
        AngryBirds inicio= new AngryBirds();
        Pajaro pajaros[] = new Pajaro[3];
        
        //Inicio de programa.
        System.out.println("**************** BIENVENIDO A ANGRY BIRDS ****************\n");
        System.out.println("\n           1) Rojo | 2) Azul | 3) Amarillo");
        
        for(int i=0; i<pajaros.length; i++){
            System.out.println("¬Selecciona a tus pajaros ("+(3-i)+" pajaros disponible): ");
            inicio.setOpcion(CapturaEntrada.capturarEntero(""));

            if(inicio.getOpcion() == 1){
                pajaros[i]= new Red();

            } else if(inicio.getOpcion() == 2) {
                pajaros[i]= new Blue();
            }else{
                pajaros[i]= new Yellow();
            }
        }
    }
}
