class Adidas{
	int price;
	String name;
	String color;
	double size;
	char quality;
	float weight;
	int pairs;
	
		Adidas(){
			System.out.println("calling empty constructor");
		}
		Adidas(int priceof,String nameof,String colorof,double sizeof,char qualityof){
			price = priceof;
			name = nameof;
			color = colorof;
			size = sizeof;
			quality = qualityof;
		}
		Adidas( float weightof,int pairsof){
			weight = weightof;
			pairs = pairsof;
		}
}