package musicComposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Symphony[] symphony;// ссылка на массив композиций в жанре Sumphony
		Folklore[] folklore;// ссылка на массив композиций в жанре Folklore
		HipHop[] hiphop;// ссылка на массив композиций в жанре HipHop
		Pop[] pop;// ссылка на массив композиций в жанре Pop
		ProgressiveRock[] progressiverock;// ссылка на массив композиций в жанре
											// ProgressiveRock
		Acapella[] acapella;//// ссылка на массив композиций в жанре Acapella

		// создаю коллекции жанров
		List<Symphony> sympHony = new ArrayList<Symphony>();
		List<Folklore> folkLore = new ArrayList<Folklore>();
		List<HipHop> hipHop = new ArrayList<HipHop>();
		List<Pop> poP = new ArrayList<Pop>();
		List<ProgressiveRock> progressiveRock = new ArrayList<ProgressiveRock>();
		List<Acapella> acapeLla = new ArrayList<Acapella>();

		Scanner sc = new Scanner(System.in);

		symphony = new Symphony[] {
				new Symphony("Увертюра фиделио", "", 320, "Людвиг ван Бетховен", Genre.TCHAIKOVSKYSYMPHONY),
				new Symphony("На прекрасном  голубом Дунае", "", 260, "Иоганн Штраус (младший)", Genre.LONDONSYMPHONY),
				new Symphony("Севильский  цирюльник", "", 180, "Джоаккино Россини", Genre.CHICAGOSYMPHONY),
				new Symphony("Зигфрид-идиллия", "", 375, "Рихард Вагнер", Genre.BOSTONSYMPHONY),
				new Symphony("Фантастическая  симфония", "", 15, "Гектор Берлиоз", Genre.BUDAPESHTFESTIVAL),
				new Symphony("Симфония № 10", "", 80, "Дмитрий Дмитриевич Шостакович", Genre.MARIINSKYTHEATRE),
				new Symphony("Свадьба  Фигаро", "", 300, "Вольфганг Амадей Моцарт", Genre.NEWYORKSYMPHONY) };

		// Заполняю ArrayList Симфония(Symphony)
		for (int i = 0; i < symphony.length; i++) {
			sympHony.add(symphony[i]);

		}

		ListIterator<Symphony> iterator = sympHony.listIterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			// System.out.println(obj.toString());
		}
		System.out.println();

		folklore = new Folklore[] {
				new Folklore("Тарантелла", "Ансамбль им.В.С.Локтева", 15, "Музыка народная", Genre.SICILIANCULTURE),
				new Folklore("Считалка", "В.Грушевский", 10, "Музыка народная", Genre.CHILDRENFOLKLORE),
				new Folklore("Чы-чы, чы-чы, верабей", "Артем Иванов и Макар Громов", 20, "Алина Безенсон",
						Genre.BELARUSIANFOLKCULTURE),
				new Folklore("Барокко", "Джаз-Ансамбл Балалайка - К.Боллинг Версальская", 25, "Ф.Сор",
						Genre.FRENCHSUITE),
				new Folklore("Охота", "Павел Мангасарян", 20, "Н.Паганини-Ф.Лист", Genre.SICILIANCULTURE),
				new Folklore("В Отеле", "Ричард Кэмерон-Вольф", 45, "Чарлз Айвз", Genre.CHURCHAMERICANCULTURE),
				new Folklore("Венгерский танец", "Ансамбль Камертон", 15, "Брамс Иоганнес", Genre.GERMANFOLKCULTURE),
				new Folklore("Ночлег в Апеннинах", "Ансамбль белорусской песни и пляски", 30, "Монюшко Станислав",
						Genre.POLISHFOLKCULTURE) };

		// Заполняю ArrayList Фольклор(Folklore)
		for (int i = 0; i < folklore.length; i++) {
			folkLore.add(folklore[i]);

		}

		ListIterator<Folklore> iter = folkLore.listIterator();
		while (iter.hasNext()) {
			Object ob = iter.next();
			// System.out.println(ob.toString());
		}
		System.out.println();

		hiphop = new HipHop[] { new HipHop("Big Pimpin", "Jay_Z", 4, "Тимбалэнд", Genre.POPRAP),
				new HipHop("Make Some Noise", "Beastie Boys", 3, "Beastie Boys", Genre.JAZZRAP),
				new HipHop("Poetic Justice", "Kendrick Lamar", 5, "Sam The Second", Genre.POPRAP),
				new HipHop("Breaking the Habit", "Linkin Park", 3, "Mike Shinoda", Genre.HARDROCKRAP),
				new HipHop("Hollywood Hoes", "Wiz Khalifa", 2, "James Horner", Genre.POPRAP),
				new HipHop("Thunderstruck", "AC - DC", 5, "Angus Young", Genre.HARDROCKRAP),
				new HipHop("Right Thru Me", "Nicki Minaj", 4, "Onika Tanya Maraj", Genre.POPRAP),
				new HipHop("It Ain't Hard to Tell", "Nasir bin Olu Dara Jones(Nas)", 3, "DJ Premier", Genre.JAZZRAP) };

		// Заполняю ArrayList Хип-хоп(HipHop) при условии, что есть музыка в
		// композиции
		for (int i = 0; i < hiphop.length; i++) {
			if (hiphop[i].isMusic()) {
				hipHop.add(hiphop[i]);
			}

		}

		ListIterator<HipHop> ite = hipHop.listIterator();
		while (ite.hasNext()) {
			Object ob = ite.next();
			// System.out.println(ob.toString());
		}
		System.out.println();

		pop = new Pop[] {
				new Pop("The Phantom of the Opera", "Freddy Профи", 150, "Andrew Lloyd Webber", Genre.MUSICAL),
				new Pop("Another sky", "Scenic", 7, "Kenichi Suzumura", Genre.lIGHTMUSIC),
				new Pop("Good guys only win in movies", "C.C.Catch", 5, "Dieter Bohlen", Genre.DISKO),
				new Pop("Creatures Of Habit", "The Kooks", 5, "Luke Pritchard", Genre.lIGHTMUSIC),
				new Pop("И опять во дворе", "Иосиф Кобзон", 3, "А.Островский", Genre.MUSICAL),
				new Pop("Talk Me Down", "Troye Sivan", 6, "Assemblage", Genre.lIGHTMUSIC),
				new Pop("Johnny Wanna Live", "Sandra", 4, "Michael Cretu", Genre.DISKO),
				new Pop("Life is a Cabaret", "Liza Minnelli", 124, "John Kander", Genre.MUSICAL) };

		// Заполняю ArrayList Pop(Поп) при условии, что есть музыка в композиции
		for (int i = 0; i < pop.length; i++) {
			if (pop[i].isMusic()) {
				poP.add(pop[i]);
			}

		}

		ListIterator<Pop> it = poP.listIterator();
		while (it.hasNext()) {
			Object ob = it.next();
			// System.out.println(ob.toString());
		}
		System.out.println();

		progressiverock = new ProgressiveRock[] {
				new ProgressiveRock("Midnight Dancer", "Arabesque", 4, "Frank Farian", Genre.ARTROCK),
				new ProgressiveRock("Payday", "Die Fish", 2, "Максим Вербицкий", Genre.SYMPHONICROCK),
				new ProgressiveRock("Stairway To Heaven", "Led Zeppelin", 8, "Stairway to Heaven", Genre.ARTROCK),
				new ProgressiveRock("Can't Get Away", "Александр Поздняков", 5, "Никита Поздняков", Genre.JAZZROCK),
				new ProgressiveRock("Транквилизатор", "Кино", 6, "В.Цой", Genre.ARTROCK),
				new ProgressiveRock("Свеча", "Symfomania", 4, "Александр Милевский", Genre.SYMPHONICROCK),
				new ProgressiveRock("С добрым утром, белокаменная!", "Анатолий Кравченко", 6, "Анатолий Кравченко",
						Genre.JAZZROCK),
				new ProgressiveRock("The Q-music sessions", "Within Temptation", 3, " Anastasia Emerald",
						Genre.SYMPHONICROCK) };

		// Заполняю ArrayList ProgressiveRock(Прогрессивный рок) при условии,
		// что есть музыка в композиции
		for (int i = 0; i < progressiverock.length; i++) {
			// есть ли в списке песня
			if (progressiverock[i].isMusic()) {
				progressiveRock.add(progressiverock[i]);
			}

		}

		ListIterator<ProgressiveRock> itterator = progressiveRock.listIterator();
		while (itterator.hasNext()) {
			Object ob = itterator.next();
			// System.out.println(ob.toString());
		}
		System.out.println();

		acapella = new Acapella[] {
				new Acapella("I Need Your Love feat", "Calvin Harris", 4, "Calvin Harris", Genre.SOLO),
				new Acapella("Преображенский марш", "Мужской хор Института певческой песни Валаам", 3,
						"Г.А. Тер-Багдасарян", Genre.CHOIR),
				new Acapella("У ворот сосна раскачалась", "Глиссандо", 5, "Н. Алаев", Genre.CHOIR),
				new Acapella("Hot N Cold", "Katy Perry", 3, "Katheryn Elizabeth Hudson", Genre.SOLO),
				new Acapella("По Дону гуляет", "Русская песня", 4, "А. Беляев", Genre.CHOIR),
				new Acapella("Right Now", "Akon", 4, "Akon", Genre.SOLO),
				new Acapella("Вдоль по улице метелица метет", "Родники", 3, "О.Агапитова", Genre.CHOIR) };

		// Заполняю ArrayList Акапелла(Acapella)
		for (int i = 0; i < acapella.length; i++) {
			acapeLla.add(acapella[i]);

		}

		ListIterator<Acapella> iteratorr = acapeLla.listIterator();
		while (iteratorr.hasNext()) {
			Object obj = iteratorr.next();
			// System.out.println(obj.toString());
		}
		System.out.println();

		// Музыкальная сборка
		// формирую общий playlist
		List<MusicComposition> list = new ArrayList<>();
		list.addAll(sympHony);
		list.addAll(folkLore);
		list.addAll(poP);
		list.addAll(hipHop);
		list.addAll(progressiveRock);
		list.addAll(acapeLla);

		// Спискок музыкальных композиций из перемешанного списка для записи на
		// диск
		List<MusicComposition> listRandom = new ArrayList<>();

		// Меню
		int choise; // переменная, отвечающая за выбор действия
		int count;// количество треков для сборки на диске
		int Min; // минимальная длительность трека на диске
		int Max; // максимальная длительность трека на диске
		do {
			// System("cls"); // очистка экрана
			System.out.println("______________________________________________________");
			System.out.println("Что желаете сделать:");
			System.out.println("\t1. Вывести весь список музыкальных композиций");
			System.out.println("\t2. Вывести перемешанный список музыкальных композиций");
			System.out.println("\t3. Задай количество треков для записи на диск");
			System.out.println("\t4. Отсортировать отобранные композиции по жанру");
			System.out.println("\t5. Длительность всех треков на диске");
			System.out.println("\t6. Музыкальные композициии на диске из заданного диапазона");
			System.out.println("\t7. Сериализация в файл");
			System.out.println("\t8. Десериализация файла");
			System.out.println("\t0. Выход");
			System.out.println("______________________________________________________");
			System.out.println("\tВаш выбор: ");
			choise = sc.nextInt(); // считываем выбор

			switch (choise) {
			case 1: {// общий playlist
				ListIterator<MusicComposition> iteraTorr = list.listIterator();
				while (iteraTorr.hasNext()) {
					Object obj = iteraTorr.next();
					System.out.println(obj.toString());
				}
				System.out.println();
			}
				break;

			case 2: {// перемешиваю случайным образом весь список
						// MusicComposition
				Collections.shuffle(list);
				for (MusicComposition r : list) {
					System.out.println(r);
				}
				System.out.println();
			}
				break;

			case 3: {// вывод музыкальных композиций на диске
				System.out.print("Количество треков на диске равно ");
				count = sc.nextInt();
				System.out.println();
				int number = 0;
				for (MusicComposition d : list) {
					if (number < count) {
						listRandom.add(d);
						System.out.println(d);
						number++;
					} else
						break;
				}
				System.out.println();
			}
				break;

			case 4: {// сортировка пузырьком музыкальных композиций на диске по
						// жанру
				MusicComposition.sort(listRandom);
				System.out.println();
			}
				break;

			case 5: {// длительность всех треков на диске
				MusicComposition.durationAll(listRandom);
			}
				break;

			case 6: {// композиция в заданном диапазоне
				System.out.print("Задайте нижнюю границу музыкальной композиции ");
				Min = sc.nextInt();
				System.out.print("Задайте верхнюю границу музыкальной композиции ");
				Max = sc.nextInt();
				MusicComposition.rangeOfTraks(listRandom, Min, Max);
			}
				break;

			case 7: {// сериализация в файл
				MusicComposition.serialization(listRandom);
			}
				break;

			case 8: {// десериализация файла
				MusicComposition.deserialization(listRandom);

			}
				break;
			case 0:
				return;

			default:
				System.out.println("\n Вы ввели неверное значение");
				break;
			}
		} while (choise != 0); // пока не нажали выход

	}

}
