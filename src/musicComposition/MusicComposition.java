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

//Базовый класс в иерархии музыкальной композиции
public abstract class MusicComposition implements Serializable {

	private String name;
	private String artist;
	private int duration;
	private Genre genre;

	// контекстные объекты не сериализуемы, поэтому их пробрасываем
	public transient Context myContext;

	// конструктор с параметрами
	public MusicComposition(String name, String artist, int duration, Genre genre) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.genre = genre;
	}

	// методы для доступа к переменным
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

	// сортировка пузырьком музыкальных композиций на диске по жанру
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

	// длительность всех треков на диске
	public static MusicComposition durationAll(List<MusicComposition> listRandom) {
		int durationDiskAll = 0;
		for (MusicComposition duration : listRandom) {
			durationDiskAll += duration.getDuration();
		}
		System.out.println("Общая длительность треков на диске = " + durationDiskAll + " мин");
		return null;
	}

	// музыкальные композиции на диске в заданном диапазоне
	public static MusicComposition rangeOfTraks(List<MusicComposition> listRandom, int Min, int Max) {
		for (MusicComposition m : listRandom) {
			if (m.getDuration() <= Max && m.getDuration() >= Min)
				System.out.println("Трек диске в заданном диапазоне = " + m);
		}

		return null;
	}

	// сериализация
	public static MusicComposition serialization(List<MusicComposition> listRandom) {
		try {
			// создание цепи потоков с потоком вывода объекта в конце
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
			Date now = new Date(System.currentTimeMillis());
			out.writeObject(now);
			out.writeObject(listRandom);
			out.close();
			System.out.println("Файл записан!");
			System.out.println("Дата записи файла: " + now);

		} catch (FileNotFoundException e) {
			// попытка доступа к файлу, не существующему на диске, заканчивается
			// неудачей
			// печатать информацию относительно исключения, то есть, как оно
			// произошло и какой строке кода
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ошибочка");
		} catch (IOException e) {
			// если файл не может быть создан файл не может быть создан
			// печатать информацию относительно исключения, то есть, как оно
			// произошло и какой строке кода
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ошибочка");
		}
		return null;
	}

	// десериализация
	public static MusicComposition deserialization(List<MusicComposition> listRandom) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects.dat"));
			Date d1 = (Date) in.readObject();
			System.out.println("Файл прочитан:");
			System.out.println("Дата чтения файла: " + d1);
			in.close();
		} catch (ClassNotFoundException | IOException e) {
			// попытка доступа к файлу, не существующему на диске, заканчивается
			// неудачей
			// если файл не может быть создан файл не может быть создан
			// печатать информацию относительно исключения, то есть, как оно
			// произошло и какой строке кода
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String toString() {
		return "Music Composition {" + "name= " + getName() + ", artist= " + getArtist() + ", duration(мин)= "
				+ getDuration() + ", Genre = " + getGenre() + '}';

	}
}
