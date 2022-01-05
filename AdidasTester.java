class AdidasTester{
	public static void main(String[] ar){
	
		Adidas adidas = new Adidas();
		System.out.println(adidas.price+" \t"+adidas.name+" \t"+adidas.color+" \t"+adidas.size+" \t"+adidas.quality);
		Adidas adidas1 = new Adidas();
		System.out.println(adidas1.price+"\t "+adidas1.name+"\t "+adidas1.color+" \t"+adidas1.size+"\t "+adidas1.quality);
		System.out.println();
		
		Adidas adidas2= new Adidas(1999,"sneakers","black",8.2,'A');
		System.out.println(adidas2.price+"\t "+adidas2.name+"\t "+adidas2.color+" \t"+adidas2.size+"\t "+adidas2.quality);
		Adidas adidas3= new Adidas(999,"sandals","Brown",6.2,'B');
		System.out.println(adidas3.price+"\t "+adidas3.name+"\t "+adidas3.color+" \t"+adidas3.size+"\t "+adidas3.quality);
		adidas3.price = 899;
		System.out.println(adidas3.price+"\t "+adidas3.name+"\t "+adidas3.color+" \t"+adidas3.size+"\t "+adidas3.quality);
		System.out.println();
		
		Adidas adidas4 = new Adidas(100.9f,4);
		System.out.println(adidas4.weight+"\t"+adidas4.pairs);
		Adidas adidas5 = new Adidas(90.9f,2);
		System.out.println(adidas5.weight+"\t"+adidas5.pairs);
	}

}