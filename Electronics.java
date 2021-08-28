class Electronics{
	String type;
	int price;
	int model;
	String color;
	
	public static void main(String arg[]){
		
	
	Electronics tv= new Electronics();
    tv.type="LED/LCD";
	tv.price=45000;
	tv.model=2018;
	tv.color="black";
	System.out.println("Electronics no 1:");
	System.out.println("type is:" + tv.type);
	System.out.println("price:" + tv.price);
	System.out.println("model:"+ tv.model);
	System.out.println("color:" + tv.color);
	
	System.out.println("--------------------");
	
	Electronics e1= new Electronics();
    e1.type="fridge";
	e1.price=50000;
	e1.model=2020;
	e1.color="blue";
	System.out.println("Electronics no 2:");
	System.out.println("type is:" + e1.type);
	System.out.println("price:" + e1.price);
	System.out.println("model:"+ e1.model);
	System.out.println("color:" + e1.color);
	
	System.out.println("--------------------");
	
	Electronics ac= new Electronics();
    ac.type="Air Condition";
	ac.price=750000;
	ac.model=2019;
	ac.color="white";
	System.out.println("Electronics no 3:");
	System.out.println("type is:" + ac.type);
	System.out.println("price:" + ac.price);
	System.out.println("model:"+ ac.model);
	System.out.println("color:" + ac.color);
	
	System.out.println("--------------------");
	
	Electronics lp= new Electronics();
    lp.type="Laptop";
	lp.price=45000;
	lp.model=2021;
	lp.color="white";
	System.out.println("Electronics no 4:");
	System.out.println("type is:" + lp.type);
	System.out.println("price:" + lp.price);
	System.out.println("model:"+ lp.model);
	System.out.println("color:" + lp.color);
	
	System.out.println("--------------------");
	
	Electronics s5= new Electronics();
    s5.type="microwave";
	s5.price=20000;
	s5.model=2018;
	s5.color="black wooden";
	System.out.println("Electronics no 5:");
	System.out.println("type is:" + s5.type);
	System.out.println("price:" + s5.price);
	System.out.println("model:"+ s5.model);
	System.out.println("color:" + s5.color);
	
	System.out.println("--------------------");
	
	
	}
}