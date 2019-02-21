package practice13.common;

public class SuperHero extends Hero{

	Item equipment;

	//オーバーライド
	public int attack() {
		return super.attack()+equipment.getAdditionalDamage();

	}

	public Item equipment () {
		return this.equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment=equipment;
	}
}
