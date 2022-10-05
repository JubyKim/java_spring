package ch08;

public class People {

	int height;
	int weight;
	String name;
	String sex;
	int age;
	
	public People(int height, int weight, String sex, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
		this.age = age;
		
	}
	
	public String showPeopleInfo() {
		return "키가" +  height +"이고 몸무게가 " + weight+ "킬로인 " + sex + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.";
	}
}
//키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.