package nnn;

public class test {

	public static void main(String[] args){
	
		dog dog1=new dog();
	
	
	dog1.setName("小白");
	dog1.setSpeed(5);
	dog1.setDb(115);
	dog1.barking();
	dog1.runing();
	
	System.out.println(dog1.getName()+"叫声大小是"+dog1.getDb()+
			"分贝"+",它的奔跑速度是"+dog1.getSpeed()+"千米/小时。");
	
}
}