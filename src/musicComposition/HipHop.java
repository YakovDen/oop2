package musicComposition;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//����� ������������ ����� Hip-Hop
public class HipHop extends Vocal implements Musicionable {
	// ����, ���������� �������� � ���.���������� ������(�����)
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
		return "Hip_hop {" + "name= " + getName() + ", artist= " + getArtist() + ", duration(���)= " + getDuration()
				+ ", Genre = " + getGenre() + '}';
	}

}
