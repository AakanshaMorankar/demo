package moviesprojects;

public class Entity {
     private String mname;
     private int year;
     private String hero_name;
     private String hero_name2;
     private String heroien_name;
     private String heroien_name2;
     
	public Entity() {
		super();
	}


	public Entity(String mname, int year, String hero_name, String heroien_name) {
		super();
		this.mname = mname;
		this.year = year;
		this.hero_name = hero_name;
		this.heroien_name = heroien_name;
	}

	public Entity(String mname, int year, String hero_name, String hero_name2, String heroien_name) {
		super();
		this.mname = mname;
		this.year = year;
		this.hero_name = hero_name;
		this.hero_name2 = hero_name2;
		this.heroien_name = heroien_name;
	}
    
	

	public Entity(String mname, int year, String hero_name, String hero_name2, String heroien_name,
			String heroien_name2) {
		super();
		this.mname = mname;
		this.year = year;
		this.hero_name = hero_name;
		this.hero_name2 = hero_name2;
		this.heroien_name = heroien_name;
		this.heroien_name2 = heroien_name2;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getHero_name() {
		return hero_name;
	}


	public void setHero_name(String hero_name) {
		this.hero_name = hero_name;
	}


	public String getHeroien_name() {
		return heroien_name;
	}


	public void setHeroien_name(String heroien_name) {
		this.heroien_name = heroien_name;
	}
    

	public String getHero_name2() {
		return hero_name2;
	}


	public void setHero_name2(String hero_name2) {
		this.hero_name2 = hero_name2;
	}

	public String getHeroien_name2() {
		return heroien_name2;
	}


	public void setHeroien_name2(String heroien_name2) {
		this.heroien_name2 = heroien_name2;
	}


	@Override
	public String toString() {
		return "Entity [mname=" + mname + ", year=" + year + ", hero_name=" + hero_name + ", hero_name2=" + hero_name2
				+ ", heroien_name=" + heroien_name + ", heroien_name2=" + heroien_name2 + "]";
	}

     
}
