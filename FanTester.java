class FanTester{
		
	public static void main(String []arg){
		Fan product = new Fan();
		System.out.println("1st object for Fan()");
		System.out.println();
		System.out.println("brand : "+product.brand + "\t speed : "+ product.speed+"\t blade : "+product.blade+ "\tcolour : "+product.colour+"\ttype :"+product.type );
		System.out.println();
		System.out.println();
		
		Fan product1 = new Fan();
		System.out.println("2nd object for Fan()");
		System.out.println("brand :"+product1.brand + "\t speed : "+ product1.speed+"\t blade : "+product1.blade+ "\tcolour : "+product1.colour+"\ttype :"+product1.type );
		System.out.println();
		System.out.println();
		
		Fan product2 = new Fan("Bajaj", 3, 5,"Black","Ceiling Fan");
		System.out.println();
		System.out.println("1st object for Fan(String,int,int,String,String)");
		System.out.println("brand : "+product2.brand + "\t speed : "+ product2.speed+"\t blade : "+product2.blade+ "\tcolour : "+product2.colour+"\ttype :"+product2.type );
		System.out.println();
		System.out.println();
		
		Fan product3 = new Fan("Bajaj", 3, 5,"Black","Ceiling Fan");
		System.out.println();
		System.out.println("2nd object for Fan(String,int,int,String,String)");
		System.out.println("brand : "+product3.brand + "\t speed : "+ product3.speed+"\t blade : "+product3.blade+ "\tcolour : "+product3.colour+"\ttype :"+product3.type );
		System.out.println();
		System.out.println();
		
		Fan product4 = new Fan("Bajaj", 3);
		System.out.println();
		System.out.println("1st object for Fan(string, int)");
		System.out.println("brand : "+product4.brand + "\t speed :"+ product4.speed+"\t blade : "+product4.blade+ "\tcolour : "+product4.colour+"\ttype :"+ product4.type );
		System.out.println();
		System.out.println();
		
		Fan product5 = new Fan("Formal brand", 3);
		System.out.println();
		System.out.println("2nd object for Fan(string, int)");
		System.out.println("brand : "+product5.brand + "\t speed :"+ product5.speed+"\t blade : "+product5.blade+ "\tcolour : "+product5.colour+"\ttype :"+ product5.type );
		System.out.println();
		System.out.println();
		
	}
	
}	


	