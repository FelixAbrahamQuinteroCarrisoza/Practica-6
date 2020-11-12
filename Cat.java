public class Cat extends Animal{
    int banar;

	public Cat(String name, String breed, int age,int banar){
        super(name,breed,age);
        this.banar=banar;
    }

    //metodo sonido
	public void sonidoCat(){
		System.out.println(name + "sonido: miau");
	}

    //informacion de la mascota
	@Override
	public void informacion () {
        System.out.println(name + " Edad: "+age);
        System.out.println(name + " Raza: "+breed);
	}
    

	@Override
    public void eat (){
		System.out.println("\n"+name + " Come Whiskas");
    }
    
    @Override
	public void vaccinate (){
		System.out.println( name+" Esta vacunado");
    }
    
    //banar
	public int getBanar(){
        return banar;
    }

    public void setBanar(int banar){
        this.banar = banar;
    }
    
    //metodo para saber cuantas veces se bana
    public void bano (){
		System.out.println(name + " Bano a la semana: "+banar);
    }
}