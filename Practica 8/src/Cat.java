public class Cat extends Animal {
    String raza;

    public Cat(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void Dormir(){
        System.out.println("  | ~"+ nombre + " esta durmiendo Zzzzzzz...");
    }

    @Override
    public void Comer(){
        System.out.println("  | SOY UN GATITOOOO |");
        System.out.println("  | ~"+ nombre + " esta comiendo un pescadito bien fresco y rico :D, yumiii");
    }
    
}
