class Clothes{
	String fabric;
	int price;
	String season;
	String gender;
	
	public static void main(String arg[]){
		
	
	Clothes c1= new Clothes();
    c1.fabric="lealan";
	c1.price=3000;
	c1.season="winter";
	c1.gender="female";
	System.out.println("Clothes no 1:");
	System.out.println("fabric is:" + c1.fabric);
	System.out.println("price:" + c1.price);
	System.out.println("season:"+ c1.season);
	System.out.println("gender:" + c1.gender);
	
	System.out.println("--------------------");
	
	Clothes c2= new Clothes();
    c2.fabric="cottom";
	c2.price=5000;
	c2.season="summer";
	c2.gender="male";
	System.out.println("Clothes no 2:");
	System.out.println("fabric is:" + c2.fabric);
	System.out.println("price:" + c2.price);
	System.out.println("season:"+ c2.season);
	System.out.println("gender:" + c2.gender);
	
	System.out.println("--------------------");
	
	Clothes c3= new Clothes();
    c3.fabric="valvet";
	c3.price=8000;
	c3.season="spring";
	c3.gender="kids";
	System.out.println("Clothes no 3:");
	System.out.println("fabric is:" + c3.fabric);
	System.out.println("price:" + c3.price);
	System.out.println("season:"+ c3.season);
	System.out.println("gender:" + c3.gender);
	
	System.out.println("--------------------");
	
	Clothes c4= new Clothes();
    c4.fabric="lawn";
	c4.price=1200;
	c4.season="autumn";
	c4.gender="girls";
	System.out.println("Clothes no 4:");
	System.out.println("fabric is:" + c4.fabric);
	System.out.println("price:" + c4.price);
	System.out.println("season:"+ c4.season);
	System.out.println("gender:" + c4.gender);
	
	System.out.println("--------------------");
	
	Clothes c5= new Clothes();
    c5.fabric="silk";
	c5.price=20000;
	c5.season="winter";
	c5.gender="all can wear";
	System.out.println("Clothes no 5:");
	System.out.println("fabric is:" + c5.fabric);
	System.out.println("price:" + c5.price);
	System.out.println("season:"+ c5.season);
	System.out.println("gender:" + c5.gender);
	
	System.out.println("--------------------");
	
	
	}
}