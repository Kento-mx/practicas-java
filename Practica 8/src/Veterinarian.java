public class Veterinarian {
    String name;
    double salary;

    public Veterinarian(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void Vacunar (Animal animal){
        animal.setVaccinated(true);
        System.out.println(animal.getNombre()+ "fue vacunado");
    }

    public void Banar(Animal animal){
        animal.setBanado(true);
        System.out.println(animal.getNombre() + "fue banado");
    }
    
}
