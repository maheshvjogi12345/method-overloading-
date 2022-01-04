class CaroverloadTester{
	public static void main(String []args){
		Caroverload.speed();
		int index = 80;
		Caroverload.speed(index);
		byte num = 2;
		Caroverload.speed(num);
		short OS = 101;
		String Speedlimit = "DaGa DaGa";
		Caroverload.speed(OS,Speedlimit);
		String sound = "Daga Daga";
		short limit = 70;
		Caroverload.speed(sound,limit);
		System.out.println("end of method speed()");
		System.out.println();
		
		Caroverload.music();
		String Songname = "kannada song";
		Caroverload.music(Songname);
		int id = 10;
		String list = "Hindi";
		Caroverload.music(id,list);
		Caroverload.music(list,id);
		System.out.println("end of method music()");
		System.out.println();
		
		Caroverload.driving();
		Caroverload.driving("");
		int limitspeed = 60;
		String ns = "dont drink and drive";
		Caroverload.driving(limitspeed,ns);
		String nd = "Amazing driving";
		int number = 100;
		Caroverload.driving(nd,number);
		System.out.println("end of method driving()");
		System.out.println();
		
		Caroverload.trafficrules();
		Caroverload.trafficrules("");
		String rule = "stay in lane";
		int am = 3;
		Caroverload.trafficrules(rule,am);
		int aa = 2;
		String rul = "Start ur vehicle";
		Caroverload.trafficrules(aa,rul);
		System.out.println("end of method trafficrules()");
		System.out.println();
		
		Caroverload.vehicle();
		Caroverload.vehicle("");
		String st = "KA";
		int mm = 17;
		Caroverload.vehicle(mm,st);
		int mn = 1600;
		String mh = "Horse Power";
		Caroverload.vehicle(mh,mn);
		System.out.println("end of method vehicle()");
		
	}
}