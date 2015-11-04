package musicComposition;

import java.util.List;

//класс музыкального стиля Поп
public class Pop extends Vocal implements Musicionable {

	private boolean ismusic = false;// флаг, означающий наличиие в
									// муз.композиции музыки(жанра)

	Genre genre;

	public Pop(String name, String artist, int duration, String text, Genre genre) {
		super(name, artist, duration, text, genre);
		this.genre = genre;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre() {
		this.genre = genre;
	}

	// если музыка(музыкальный жанр) в песне есть, то добавим в список
	public boolean isMusic() {
		if (genre != null)
			ismusic = true;

		else
			ismusic = false;
		return ismusic;

	}

	@Override
	public String toString() {
		return "Pop {" + "name= " + getName() + ", artist= " + getArtist() + ", duration(мин)= " + getDuration()
				+ ", Genre = " + getGenre() + '}';

	}

}
