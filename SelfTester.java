class SelfTester{
	public static void main(String [] args){
		Self self = new Self();
		System.out.println("Name :"+self.name+"\tAge :"+self.age+"\tHeight :"+self.height+"\tColor :"+self.color+"\tWeight :"+self.weight);
		Self self2 = new Self();
		System.out.println("Name :"+self2.name+"\tAge :"+self2.age+"\tHeight :"+self2.height+"\tColor :"+self2.color+"\tWeight :"+self2.weight);
		System.out.println();
		
		Self self3 = new Self("MAHESH V J", 23, 5.6f, "Wheat Color", 65.1234);
		System.out.println("Name :"+self3.name+"\tAge :"+self3.age+"\tHeight :"+self3.height+"\tColor :"+self3.color+"\tWeight :"+self3.weight);
		System.out.println();
		System.out.println("myself 8 years back");
		Self self4 = new Self("MAHESH V J", 15, 4.11f, "Wheat Color", 45.1234);
		System.out.println("Name :"+self4.name+"\tAge :"+self4.age+"\tHeight :"+self4.height+"\tColor :"+self4.color+"\tWeight :"+self4.weight);
		System.out.println();
		
		Self self5 = new Self("Soft", "Daily Task");
		System.out.println("Character:"+self5.character+"\tHobbie :"+self5.hobbie);
		System.out.println();
		System.out.println("myself 8 years back");
		Self self6 = new Self("Soft++", "Readking Book");
		System.out.println("Character:"+self6.character+"\tHobbie :"+self6.hobbie);
	}

}