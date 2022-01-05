class Self{
	String name;
	int age;
	float height;
	String color;
	double weight;
	String character;
	String hobbie;
	 
	Self(){
		System.out.println("calling default constructor");
	}
	Self(String nameof,int ageof,float heightof,String colorof,double weightof){
		name = nameof;
		age = ageof;
		height = heightof;
		color = colorof;
		weight = weightof;
	}
	Self(String characterof,String hobbieof){
		character = characterof;
		hobbie = hobbieof;
	}
}