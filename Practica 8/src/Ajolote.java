public class Ajolote extends Animal{
    String tamano;

    public Ajolote(String nombre, int edad, String tamano) {
        super(nombre, edad);
        this.tamano = tamano;
    }
    
    @Override
    public void Dormir(){
        System.out.println("  | ~"+ nombre + " esta durmiendo Zzzzzzz...");
    }

    @Override
    public void Comer(){
        System.out.println("  | SOY UN AJOLOTE |");
        System.out.println("  | ~"+ nombre + " esta comiendo lo que come un ajolote, yumiii");
    }
}
