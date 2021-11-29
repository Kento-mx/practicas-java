public class Zoo {

    int posicion;
    Animal zooAnimales[] = new Animal[5];

    //Constructor.
    public Zoo(Animal[] zooAnimales) {
        this.zooAnimales = zooAnimales;
    }
    

    //Setter and getters
    //Meter un dog
    public void setZooDog(Dog perro, int posicion) {
        zooAnimales[posicion] = perro;
    }
    

    //Meter un Gato
    public void setZooCat(Cat gato, int posicion) {
        zooAnimales[posicion] = gato;
    }

    //Meter un ajolote.
    public void setZooAjolote(Ajolote ajolote, int posicion){
        zooAnimales[posicion] = ajolote;
    }

    //Eliminar el animal.
    public void Eliminar(Animal animal, int posicion){
        zooAnimales[posicion] = animal;
    }

    //Mostrar todos los animales.
    public void MostrarAnimales(Animal animales[]){
        int i=1;
        for(Animal a: animales){
            //Con este if, hago que no aparezca el animal quitado.
            if(!(a.getNombre().equals(""))){
                System.out.println("\n| Animal "+ i);
                a.Comer();
                a.Dormir();
            }
            i++;
        }
    }

    
}
