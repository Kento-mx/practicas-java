public class Dog extends Animal{
    String raza;
    

    public Dog(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    //Metodo exclusivo de DOG.
    public void Ladrar(){
        System.out.println("-------- "+ nombre +" ha hecho WOOOOF");
    }

    @Override
    public void Dormir(){
        System.out.println("  | ~"+ nombre + " esta durmiendo Zzzzzzz...");
    }

    @Override
    public void Comer(){
        System.out.println("  | SOY UN PERRITOOOO |");
        System.out.println("  | ~"+ nombre + " esta comiendo una chuleta con pimienta negra recien molida, yumiii");
        System.out.println("  | ~Y tengo una habilidad exclusiva, seguir mi cola:D");
    }
    
}
