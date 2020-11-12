public class Dog extends Animal {
	String especialidad;
	
	public Dog(String name, String breed, int age,String especialidad){
		super(name,breed,age);
		this.especialidad = especialidad;
	}
	
	//metodo sonido
	public void bark(){
		System.out.println(name + " sonido: Woof");
	}

	//informacion de la mascota
	@Override
	public void informacion () {
		System.out.println(name + " Edad: "+age);
        System.out.println(name + " Raza: "+breed);
	}
	
	//metodo comer que viene de la clase animal
	@Override
    public void eat (){
		System.out.println("\n"+name + " Come Pedigree");
	}

	//metodo veterinario
	@Override
	public void vaccinate (){
		System.out.println( name+" Esta vacunado");
	}

	//especialidad
	public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
	}

	//metodo de especialidad
	public void especia () {
		System.out.println(name + " Especialidad: "+especialidad);
	}


}