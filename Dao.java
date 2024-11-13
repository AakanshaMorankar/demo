package moviesprojects;

public class Dao {
    
	public Entity[] getmovies() {
		Entity[] e = new Entity[10];
		e[0]=new Entity("Bagban",2002,"Abitabh bachhan","Hemamlini");
		e[1]=new Entity("Sholey",2005,"abitabh bachhan","dharmendra","hemamlini");
		e[2]=new Entity("Rocky aur rani ki prem kahani",2003,"dharmendra","ranveer Singh","Jaya Bacchan","Aliya Bhatt");
		e[3]=new Entity("ddlj",2001,"shaharukh khan","Kajol");
		e[4]=new Entity("Hum dil de chuke sanam",2002,"salman khan","Ajay devgan","aishwarya");
		e[5]=new Entity("Hum saath saath hai",2002,"salman khan","saifali khan","sonali bendre","karishma kapoor");
		e[6]=new Entity("Mission Mangal",2005,"Akshay Kumar","","vidya Balan","Sonakshi sinnha");
		e[7]=new Entity("Heyy baby",2006,"Akshay Kumar","vidya Balan");
		e[8]=new Entity("Mohara",2001,"Akshay Kumar","Sunil Shetty","Raveena Tandon");
		e[9]=new Entity("Dulhe Raja",2002,"Govinda","Raveena Tandon");
		return e;
	}

}
