package musicComposition;

/**
 * 
 * @author Den
 *
 */

public class Acapella extends Vocal {

	private Genre genre;

	public Acapella(String name, String artist, int duration, String text, Genre genre) {
		super(name, artist, duration, text, genre);
		this.genre = genre;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre() {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Acapella {" + "name= " + getName() + ", artist= " + getArtist() + ", duration(мин)= " + getDuration()
				+ ", authorText= " + getText() + ", Genre - Acapella = " + getGenre() + '}';

	}

}
