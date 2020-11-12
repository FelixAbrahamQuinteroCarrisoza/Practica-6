public class Animal{
	String name;
	int age;
	String breed;
	

	public Animal (String name,String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
		
	}
	
	//metodo comer
	public void eat (){
		System.out.println(name + " Come");
	}
	
	//metodo dormir
	public void sleep () {
		System.out.println(name + " Duerme");
	}

	//informacion de la mascota
	public void informacion () {
		System.out.println(name + " Edad: "+age);
        System.out.println(name + " Raza: "+breed);
	}
	
	//metodo veterinario
	public void vaccinate (){
		System.out.println( name+" Esta vacunado");
	}

	//nombre
	public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
	}
	
	//edad
	public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
	}

	//Raza
	public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
	}
	
	
}