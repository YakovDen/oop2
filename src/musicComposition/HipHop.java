package musicComposition;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//класс музыкального стиля Hip-Hop
public class HipHop extends Vocal implements Musicionable {
	// флаг, означающий наличиие в муз.композиции музыки(жанра)
	private boolean ismusic = false;

	Genre genre;

	public HipHop(String name, String artist, int duration, String text, Genre genre) {
		super(name, artist, duration, text, genre);
		this.genre = genre;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre() {
		this.genre = genre;
	}

	public boolean isMusic() {
		if (genre != null)
			ismusic = true;

		else
			ismusic = false;
		return ismusic;

	}

	@Override
	public String toString() {
		return "Hip_hop {" + "name= " + getName() + ", artist= " + getArtist() + ", duration(мин)= " + getDuration()
				+ ", Genre = " + getGenre() + '}';
	}

}
