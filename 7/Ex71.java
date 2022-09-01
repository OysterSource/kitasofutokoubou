package kitakoubou;

public class Ex71 {
	//
	public static void main(String[] args) {
		// Dogクラスのインスタンス化
		Dog dog1 = new Dog("チャウチャウ");
		//SetNameメソッドでdogの名前を設定
		dog1.SetName("ぶち");
		//SetAgeメソッドでdogの歳を設定
		dog1.SetAge(6);
		//SetHPメソッドでdogの体力を設定
		dog1.SetHP(400);
		dog1.SetWeight(30);

		//2つ目のdogインスタンス
		Dog dog2 = new Dog("ドーベル");
		//SetNameメソッドでdog2の名前を設定
		dog2.SetName("佐助");
		//SetAgeメソッドでdog2の歳を設定
		dog2.SetAge(8);
		//SetHPメソッドでdog2の体力を設定
		dog2.SetHP(250);
		dog2.SetWeight(65);

		//ShowProfileメソッドでプロフィールを表示
		dog1.ShowProfile();
		//ShowProfileメソッドでdog2のプロフィールを表示
		//dog.SetWeight(60);
		dog2.ShowProfile();
		System.out.println(dog1.getHP());
		System.out.println(dog1.getWeight());

		dog1.PowerUp();
		System.out.println(dog1.getHP());
		System.out.println(dog1.getWeight());

		dog1.PowerUp();
		System.out.println(dog1.getHP());
		System.out.println(dog1.getWeight());

		dog1.attack(dog2);
		System.out.println(dog1.getHP());
		System.out.println(dog2.getHP());
	}
}
