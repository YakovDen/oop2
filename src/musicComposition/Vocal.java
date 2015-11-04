package musicComposition;

//����� ����� ����� (2-�� � �������� ���.����������) ����� ��� ������ � � �������
public class Vocal extends MusicComposition {

	private String text;

	public Vocal(String name, String artist, int duration, String text, Genre genre) {
		super(name, artist, duration, genre);
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText() {
		this.text = text;
	}

}