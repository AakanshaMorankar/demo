package moviesprojects;

public class Controller {
      
	 public Entity[] getallmovies(){
		 Dao d = new Dao();
		 Entity[] e = d.getmovies();
		 return e;
	}
//	 public Entity[] getMovies(){
//		 Dao d = new Dao();
//		 Entity[] e = d.getmovies();
//		 return e;
//	}

}
