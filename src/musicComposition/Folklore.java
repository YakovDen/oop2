package musicComposition;

//класс стиля фольклор(песня отсутствет, только музыка)
public class Folklore extends Instrumental {

	private Genre genre;

	public Folklore(String name, String artist, int duration, String melody, Genre genre) {
		super(name, artist, duration, melody, genre);
		this.genre = genre;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setEthnos() {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Folklore {" + "name= " + getName() + ", artist= " + getArtist() + ", duration(мин)= " + getDuration()
				+ ", melody= " + getMelody() + ", Genre - Ethnos = " + getGenre() + '}';

	}
}
