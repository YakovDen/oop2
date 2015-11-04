package musicComposition;

//����� ����� ����������������(����� ����������, ������ ������)-2�� � �������� ���.����������
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
