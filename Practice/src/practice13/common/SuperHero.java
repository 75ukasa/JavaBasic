package practice13.common;

public class SuperHero extends Hero {

	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */

	Item equipment ;

	public SuperHero(){
		super();
	}



		public int attack(){
			return this.attack() + equipment.additionalDamage;

		}
			// ダメージ計算



		public Item getEquipment() {
			return equipment;
		}
		public void setEquipment(Item equipment) {
			this.equipment = equipment;
		}
}
