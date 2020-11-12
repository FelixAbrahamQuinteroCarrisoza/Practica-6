public class Pez extends Animal{
    

	public Pez(String name, String breed, int age){
        super(name,breed,age);
    }

    //metodo sonido
	public void sonidoPez(){
		System.out.println(name + "sonido: glug glu");
    }
    
    //metodo escamas 
    public void caracte(){
		System.out.println(name + "Tiene escamas");
	}

    //informacion de la mascota
	@Override
	public void informacion () {
        System.out.println(name + " Edad: "+age);
        System.out.println(name + " Raza: "+breed);
	}
    
	@Override
    public void eat (){
		System.out.println("\n"+name + " Come plantas y algas");
    }

    @Override
	public void vaccinate (){
		System.out.println( name+" No esta vacunado");
	}
    
}