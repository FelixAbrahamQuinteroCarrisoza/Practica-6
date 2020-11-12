import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
	
    Animal [] animalArray = new Animal [4];
	animalArray[0] = new Animal("Nombre de animal: "," tipo de animal ", 0);
	animalArray[1] = new Dog("Chispita","Chihuahua", 4, "Cuidar la casa");
    animalArray[2] = new Cat("Miau ","Maine coon", 2, 3);
    animalArray[3] = new Pez("Pepe "," betta", 3);
	
	
	for(Animal a: animalArray){
        //metodos directos
        a.eat();
        a.sleep();
        a.informacion();//metodo con atributo , edad y raza
        a.vaccinate();
        
        if (a instanceof Dog){
            ((Dog) a ).bark();
            ((Dog) a ).especia();
        }

        if (a instanceof Cat){
            ((Cat) a ).sonidoCat();
            ((Cat) a ).bano();
        }

        if (a instanceof Pez){
            ((Pez) a ).sonidoPez();
            ((Pez) a ).caracte(); 
        }

    }
	
 }
}