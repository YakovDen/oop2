package musicComposition;

//класс музыкального стиля Симфония(песни отсутствуют, только музыка)
public class Symphony extends Instrumental {

	private Genre genre;

	public Symphony(String name, String artist, int duration, String melody, Genre genre) {
		super(name, artist, duration, melody, genre);
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
		return "Symphony {" + "name= " + getName() + ", artist= " + getArtist() + ", duration(мин)= " + getDuration()
				+ ", melody= " + getMelody() + ", Genre - Orchestra = " + getGenre() + '}';

	}

}
