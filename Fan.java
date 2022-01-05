class Fan{
	String brand;
	int blade ;
	int speed;
	String colour;
	String type;
	
	
	Fan(){
		System.out.print("calling the Default Contructor");
		System.out.println();
	}
	
	Fan(String brd, int bld, int sp, String clr, String ty ){
		brand = brd;
		blade = bld;
		colour = clr;
		speed =sp;
		type = ty;
		System.out.print("Excecuted the Contructor Fan( String, int, int, String, String) ");
	}
	
	Fan(String brd, int bld){
		
		brand = brd;
		blade = bld;
		System.out.print("Excecuted the Contructor Fan( String, int) ");
	
	}
}	