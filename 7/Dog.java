package kitakoubou;

class Dog {
	private String Name;
	//int型のメンバー変数
	private int Age;

	private String Breed;
	private int HP;
	private int Weight;

	//名前メソッド
	public void SetName(String nm) {
		this.Name = nm;
	}

	//Ageメソッド
	public void SetAge(int age) {
		this.Age = age;
	}

	//犬種メソッド
	public Dog(String breed) {
		this.Breed = breed;
	}

	public void setWeight(int weight) {
		this.Weight = weight;
	}

	//体力メソッド
	public void SetHP(int hp) {
		this.HP = hp;
	}

	//体重メソッド
	public void SetWeight(int wt) {
		this.Weight = wt;
	}

	//パワーアップメソッド
	public void PowerUp() {
		this.HP = this.HP * 2;
		this.Weight = this.Weight * 2;
	}

	//ShowProfileメソッドの中身
	public void ShowProfile() {
		System.out.println("名前は、" + Name + " 、" + Age + "歳です" + "犬種は" + Breed + "です" + "体力は" + HP + "です" + "体重は" + Weight + "です");
	}

	//GETメソッド
	public int getHP() {
		return this.HP;
	}

	public int getWeight() {
		return this.Weight;
	}

	public void attack(Dog dog) {
		System.out.println("attack:" + this.HP);
		System.out.println("attack:" + this.Weight);
		System.out.println("attack:" + dog.HP);
		System.out.println("attack:" + dog.Weight);
	}
}
