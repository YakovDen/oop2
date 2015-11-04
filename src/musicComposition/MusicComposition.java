package musicComposition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.swing.JOptionPane;

//������� ����� � �������� ����������� ����������
public abstract class MusicComposition implements Serializable {

	private String name;
	private String artist;
	private int duration;
	private Genre genre;

	// ����������� ������� �� ������������, ������� �� ������������
	public transient Context myContext;

	// ����������� � �����������
	public MusicComposition(String name, String artist, int duration, Genre genre) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.genre = genre;
	}

	// ������ ��� ������� � ����������
	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public int getDuration() {
		return duration;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setName() {
		this.name = name;
	}

	public void setArtist() {
		this.artist = artist;
	}

	public void setDuration() {
		this.duration = duration;
	}

	public void setGenre() {
		this.genre = genre;
	}

	// ���������� ��������� ����������� ���������� �� ����� �� �����
	public static MusicComposition sort(List<MusicComposition> listRandom) {
		MusicComposition temp = null;
		for (int j = listRandom.size() - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (listRandom.get(i).getGenre().compareTo(listRandom.get(i + 1).getGenre()) > 0) {
					temp = listRandom.get(i);
					listRandom.set(i, listRandom.get(i + 1));
					listRandom.set((i + 1), temp);
				}
			}
		}

		for (MusicComposition d : listRandom) {
			System.out.println(d);
		}
		return null;
	}

	// ������������ ���� ������ �� �����
	public static MusicComposition durationAll(List<MusicComposition> listRandom) {
		int durationDiskAll = 0;
		for (MusicComposition duration : listRandom) {
			durationDiskAll += duration.getDuration();
		}
		System.out.println("����� ������������ ������ �� ����� = " + durationDiskAll + " ���");
		return null;
	}

	// ����������� ���������� �� ����� � �������� ���������
	public static MusicComposition rangeOfTraks(List<MusicComposition> listRandom, int Min, int Max) {
		for (MusicComposition m : listRandom) {
			if (m.getDuration() <= Max && m.getDuration() >= Min)
				System.out.println("���� ����� � �������� ��������� = " + m);
		}

		return null;
	}

	// ������������
	public static MusicComposition serialization(List<MusicComposition> listRandom) {
		try {
			// �������� ���� ������� � ������� ������ ������� � �����
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
			Date now = new Date(System.currentTimeMillis());
			out.writeObject(now);
			out.writeObject(listRandom);
			out.close();
			System.out.println("���� �������!");
			System.out.println("���� ������ �����: " + now);

		} catch (FileNotFoundException e) {
			// ������� ������� � �����, �� ������������� �� �����, �������������
			// ��������
			// �������� ���������� ������������ ����������, �� ����, ��� ���
			// ��������� � ����� ������ ����
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "��������");
		} catch (IOException e) {
			// ���� ���� �� ����� ���� ������ ���� �� ����� ���� ������
			// �������� ���������� ������������ ����������, �� ����, ��� ���
			// ��������� � ����� ������ ����
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "��������");
		}
		return null;
	}

	// ��������������
	public static MusicComposition deserialization(List<MusicComposition> listRandom) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects.dat"));
			Date d1 = (Date) in.readObject();
			System.out.println("���� ��������:");
			System.out.println("���� ������ �����: " + d1);
			in.close();
		} catch (ClassNotFoundException | IOException e) {
			// ������� ������� � �����, �� ������������� �� �����, �������������
			// ��������
			// ���� ���� �� ����� ���� ������ ���� �� ����� ���� ������
			// �������� ���������� ������������ ����������, �� ����, ��� ���
			// ��������� � ����� ������ ����
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String toString() {
		return "Music Composition {" + "name= " + getName() + ", artist= " + getArtist() + ", duration(���)= "
				+ getDuration() + ", Genre = " + getGenre() + '}';

	}
}
