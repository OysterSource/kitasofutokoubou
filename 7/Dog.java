package kitakoubou;

class Dog {
	private String Name;
	//int型のメンバー変数
	private int Age;

	private String Breed;

	public void SetName(String nm) {
		Name = nm;
	}

	//Ageメソッド
	public void SetAge(int age) {
		Age = age;
	}

	//犬種メソッド
	public Dog(String breed) {
		Breed = breed;
	}

	//ShowProfileメソッドの中身
	public void ShowProfile() {
		System.out.println("名前は、" + Name + " 、" + Age + "歳です" + "犬種は" + Breed + "です");
	}
}
