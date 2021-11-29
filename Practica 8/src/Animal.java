public class Animal {
    String nombre;
    int edad;
    boolean vaccinated;
    boolean banado;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Dormir(){
        System.out.println("  | ~"+ nombre + " esta durmiendo Zzzzzzz...");
    }

    public void Comer(){
        System.out.println("  | ~"+ nombre + " esta comiendo, yumiii");
    }


    //Setters and getters
    public boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBanado() {
        return banado;
    }

    public void setBanado(boolean banado) {
        this.banado = banado;
    }
    
}
