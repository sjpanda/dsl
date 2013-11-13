package webapp.db;

public class MainGenerateDBSchema {
	public static void main(String[] args) {
		GenerateDBSchema generator = GenerateDBSchema.create(null);
		System.out.println(generator.generate(1));
	}

}
