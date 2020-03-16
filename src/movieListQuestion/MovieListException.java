package movieListQuestion;

/* A trivial exception class for the Movie List program.
 */
@SuppressWarnings("serial")
public class MovieListException extends Exception {

	public MovieListException() {
		super();
		int x = 1;
	}

	public MovieListException(String message) {
		super(message);
	}

}
