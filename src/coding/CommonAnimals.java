package coding;

public class CommonAnimals {

	public static void main(String[] args) {
		Animals anm = new Animals();
		System.out.println(anm.getName());
		System.out.println(anm.favFood);
		Cats moshi = new Cats("moshi", "Tuna","Rubber Mouse");
			System.out.println();
			System.out.println(moshi.getName());
			System.out.println(moshi.favFood);
			System.out.println(moshi.favToy);
		
	}
	

}
