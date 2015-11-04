package musicComposition;

//класс стил€ »нструментальный(песн€ отсутствет, только музыка)-2ой в иерархии муз.композиции
public class Instrumental extends MusicComposition {

	private String melody;

	public Instrumental(String name, String artist, int duration, String melody, Genre genre) {
		super(name, artist, duration, genre);
		this.melody = melody;
	}

	public String getMelody() {
		return melody;
	}

	public void setMelody() {
		this.melody = melody;
	}

}
