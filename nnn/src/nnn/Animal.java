package nnn;

 class Animal {

	String name;
	String hairColor;
	String eyeColor;
	Integer length;
	Integer weight;
	Integer hight;
	Integer db;
	Integer speed;
	
	public Integer getDb() {
		return db;
	}
	public void setDb(Integer db) {
		this.db = db;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getHight() {
		return hight;
	}
	public void setHight(Integer hight) {
		this.hight = hight;
	}
	
	/**@Override
	public String toString() {
		return "dog [name=" + name + ", hairColor=" + hairColor + ", eyeColor=" + eyeColor + ", length=" + length
				+ ", weight=" + weight + ", hight=" + hight + "]";
	}*/
	
}


class dog extends Animal implements Jinterface {
 
	@Override
	public void barking() {
		System.out.println("小狗在叫，可欢乐了！");
		
	}

	@Override
	public void runing() {
		System.out.println("小狗在快乐的奔跑！");
		
	}
}