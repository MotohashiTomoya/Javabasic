package practice13.common;

public class Item {

	String name;
	int additionalDamage;

	public String getName() {
		return this.name;
	}
	public  int getAdditionalDamage() {
		return this.additionalDamage;
	}


	public void setName(String name) {
		this.name=name;
	}
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage=additionalDamage;
	}
	//コンストラクタ
	public Item(String string, int i){
		this.name=string;
		this.additionalDamage=i;
	}


}