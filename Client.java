package moviesprojects;

public class Client {

	public static void main(String[] args) {
		Service s = new Service();
		Entity[] q = s.getallmovies();

		// Get All Movies
		for (Entity f : q) {
			System.out.println(f);
		}
		System.out.println();

		// Get salman khan movies
		for (Entity f : q) {
			if (f.getHero_name() == "salman khan" || f.getHero_name2() == "salman khan") {
				System.out.println(f);
			}
		}
		System.out.println();

		// Get Akshay Kumar Movies
		for (Entity f : q) {
			if (f.getHero_name() == "Akshay Kumar" || f.getHero_name2() == "Akshay Kumar") {
				System.out.println(f);
			}
		}
		System.out.println();

		// Get movies released after the year 2004
		for (Entity f : q) {
			if (f.getYear() < 2004) {
				System.out.println(f);
			}
		}
		System.out.println();

		// Get hero name starts with a ignore upper and lower cases
		for (Entity f : q) {
			if (f.getHero_name().toLowerCase().startsWith("a")) {
				System.out.println(f);
			}
		}
		System.out.println();

		// Get movies where hero name starts with "A" (ignoring case)
		for (Entity f : q) {
			if (f.getHero_name2() != null && f.getHero_name().toLowerCase().startsWith("a")
					|| f.getHero_name2() != null && f.getHero_name2().toUpperCase().startsWith("A")) {
				System.out.println(f);
			}
		}
		System.out.println();

		// Get movies where either hero name or hero name2 starts with "A" (ignoring
		// case)
		for (Entity f : q) {
			if (f.getHero_name2() != null && f.getHero_name2().startsWith("A")) {
				System.out.println(f);
			}
		}
		System.out.println();

		// Get the 6th character of heroien_name
		for (Entity f : q) {
			if (f.getHeroien_name() != null) {
				try {
					System.out.println(f.getHeroien_name().charAt(6));
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println("name is too short");
				}
			} else {
				System.out.println("Missing");
			}
		}
		System.out.println();

		// Get the 6th character of heroien_name2
		for (Entity f : q) {
			if (f.getHeroien_name2() != null) {
				try {
					System.out.println(f.getHeroien_name2().charAt(4));
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println("name is too short");
				}
			} else {
				System.out.println("Missing");
			}
		}
		System.out.println();
          
		//Get the each characters of hero names in separate line
		for (Entity f : q) {
			for (int i = 0; i < f.getHero_name().length(); i++) {
				System.out.println(f.getHero_name().charAt(i));
			}
			System.out.println("****************************");
		}
		System.out.println();
		
		
		//Get the each characters of Heroien name2 in separate line
		for (Entity f : q) {
			if(f.getHeroien_name2()!=null) {
			for (int i = 0; i < f.getHeroien_name2().length(); i++) {
				System.out.println(f.getHeroien_name2().charAt(i));
			}
			}
			else {
				System.out.println("missing");
			}
			System.out.println("****************************");
		}
	}

}
