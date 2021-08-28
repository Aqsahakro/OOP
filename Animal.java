class Animal{
    int legs;
	String color;
	int weight;
	
	public static void main(String arg[]){
		
	
	Animal cat= new Animal();
    cat.legs=4;
	cat.color="white";
	cat.weight=10;
	System.out.println("This is Cat's Properties:");
	System.out.println("cat has legs:"+ cat.legs);
	System.out.println("cat color is:"+cat.color);
	System.out.println("cat has weight:"+cat.weight);
	System.out.println("--------------------");
	
	Animal cow=new Animal();
	cow.legs=4;
	cow.color="black,white";
	cow.weight=70;
	
	System.out.println("This is Cow's Properties:");
	System.out.println("cow has legs:"+cow.legs);
	System.out.println("cow color is:"+cow.color);
	System.out.println("cat has weight:"+cow.weight);
	System.out.println("--------------------");
	
	Animal peacock=new Animal();
	peacock.legs=2;
	peacock.color="purple";
	peacock.weight=40;
	
	System.out.println("This is peacock's Properties:");
	System.out.println("peacock has legs:"+peacock.legs);
	System.out.println("peacock color is:"+peacock.color);
	System.out.println("peacock weight is:"+peacock.weight);
	System.out.println("--------------------");
	
	Animal horse=new Animal();
	horse.legs=4;
	horse.color="black,white,brown";
	horse.weight=70;
	
	System.out.println("This is horse Properties:");
	System.out.println("horse has legs:"+horse.legs);
	System.out.println("horse color is:"+horse.color);
	System.out.println("horse weight:"+horse.weight);
	}
}