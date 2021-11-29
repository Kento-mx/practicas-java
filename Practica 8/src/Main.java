public class Main {
    public static void main(String[] args) {   
        Animal animales[]= new Animal[5];
        Animal reset= new Animal("", 0);
        Zoo zoologico= new Zoo(animales);
        
        System.out.println("=========== BIENVENIDO AL ZOO ==============");
        System.out.println("\n ===== El zoologico cuenta con 5 espacios en total.");
        
        Ajolote ajol1= new Ajolote("Arturo", 2, "grande");
        zoologico.setZooAjolote(ajol1, 0);
        
        Dog perro1= new Dog("Rocky", 3, "Husky");
        zoologico.setZooDog(perro1, 1);
        
        Cat gato1= new Cat("Michito", 8, "Siames");
        zoologico.setZooCat(gato1, 2);
        
        Cat gato2= new Cat("Mauricio", 3, "Rayitas grises");
        zoologico.setZooCat(gato2, 3);
        
        Ajolote ajol2= new Ajolote("Hector", 5, "chico");
        zoologico.setZooAjolote(ajol2, 4);
        
        System.out.println("\n********* Resultados antes de elimnar una opcion ********* ");
        zoologico.MostrarAnimales(animales);
        
        System.out.println("\n\n********* Resultados despues de elimnar una opcion ********* ");
        zoologico.Eliminar(reset, 4);
        zoologico.MostrarAnimales(animales);
        
        System.out.println("\n\n | ========= GRACIAS POR USAR EL PROGRAMA. BUEN DIA :D ========= |");
    }
}
