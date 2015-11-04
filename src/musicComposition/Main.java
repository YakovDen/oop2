package musicComposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Symphony[] symphony;// ������ �� ������ ���������� � ����� Sumphony
		Folklore[] folklore;// ������ �� ������ ���������� � ����� Folklore
		HipHop[] hiphop;// ������ �� ������ ���������� � ����� HipHop
		Pop[] pop;// ������ �� ������ ���������� � ����� Pop
		ProgressiveRock[] progressiverock;// ������ �� ������ ���������� � �����
											// ProgressiveRock
		Acapella[] acapella;//// ������ �� ������ ���������� � ����� Acapella

		// ������ ��������� ������
		List<Symphony> sympHony = new ArrayList<Symphony>();
		List<Folklore> folkLore = new ArrayList<Folklore>();
		List<HipHop> hipHop = new ArrayList<HipHop>();
		List<Pop> poP = new ArrayList<Pop>();
		List<ProgressiveRock> progressiveRock = new ArrayList<ProgressiveRock>();
		List<Acapella> acapeLla = new ArrayList<Acapella>();

		Scanner sc = new Scanner(System.in);

		symphony = new Symphony[] {
				new Symphony("�������� �������", "", 320, "������ ��� ��������", Genre.TCHAIKOVSKYSYMPHONY),
				new Symphony("�� ����������  ������� �����", "", 260, "������ ������ (�������)", Genre.LONDONSYMPHONY),
				new Symphony("����������  ���������", "", 180, "��������� �������", Genre.CHICAGOSYMPHONY),
				new Symphony("�������-�������", "", 375, "������ ������", Genre.BOSTONSYMPHONY),
				new Symphony("��������������  ��������", "", 15, "������ �������", Genre.BUDAPESHTFESTIVAL),
				new Symphony("�������� � 10", "", 80, "������� ���������� ����������", Genre.MARIINSKYTHEATRE),
				new Symphony("�������  ������", "", 300, "��������� ������ ������", Genre.NEWYORKSYMPHONY) };

		// �������� ArrayList ��������(Symphony)
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
				new Folklore("����������", "�������� ��.�.�.�������", 15, "������ ��������", Genre.SICILIANCULTURE),
				new Folklore("��������", "�.����������", 10, "������ ��������", Genre.CHILDRENFOLKLORE),
				new Folklore("��-��, ��-��, �������", "����� ������ � ����� ������", 20, "����� ��������",
						Genre.BELARUSIANFOLKCULTURE),
				new Folklore("�������", "����-������� ��������� - �.������� �����������", 25, "�.���",
						Genre.FRENCHSUITE),
				new Folklore("�����", "����� ����������", 20, "�.��������-�.����", Genre.SICILIANCULTURE),
				new Folklore("� �����", "������ �������-�����", 45, "����� ����", Genre.CHURCHAMERICANCULTURE),
				new Folklore("���������� �����", "�������� ��������", 15, "����� ��������", Genre.GERMANFOLKCULTURE),
				new Folklore("������ � ���������", "�������� ����������� ����� � ������", 30, "������� ���������",
						Genre.POLISHFOLKCULTURE) };

		// �������� ArrayList ��������(Folklore)
		for (int i = 0; i < folklore.length; i++) {
			folkLore.add(folklore[i]);

		}

		ListIterator<Folklore> iter = folkLore.listIterator();
		while (iter.hasNext()) {
			Object ob = iter.next();
			// System.out.println(ob.toString());
		}
		System.out.println();

		hiphop = new HipHop[] { new HipHop("Big Pimpin", "Jay_Z", 4, "���������", Genre.POPRAP),
				new HipHop("Make Some Noise", "Beastie Boys", 3, "Beastie Boys", Genre.JAZZRAP),
				new HipHop("Poetic Justice", "Kendrick Lamar", 5, "Sam The Second", Genre.POPRAP),
				new HipHop("Breaking the Habit", "Linkin Park", 3, "Mike Shinoda", Genre.HARDROCKRAP),
				new HipHop("Hollywood Hoes", "Wiz Khalifa", 2, "James Horner", Genre.POPRAP),
				new HipHop("Thunderstruck", "AC - DC", 5, "Angus Young", Genre.HARDROCKRAP),
				new HipHop("Right Thru Me", "Nicki Minaj", 4, "Onika Tanya Maraj", Genre.POPRAP),
				new HipHop("It Ain't Hard to Tell", "Nasir bin Olu Dara Jones(Nas)", 3, "DJ Premier", Genre.JAZZRAP) };

		// �������� ArrayList ���-���(HipHop) ��� �������, ��� ���� ������ �
		// ����������
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
				new Pop("The Phantom of the Opera", "Freddy �����", 150, "Andrew Lloyd Webber", Genre.MUSICAL),
				new Pop("Another sky", "Scenic", 7, "Kenichi Suzumura", Genre.lIGHTMUSIC),
				new Pop("Good guys only win in movies", "C.C.Catch", 5, "Dieter Bohlen", Genre.DISKO),
				new Pop("Creatures Of Habit", "The Kooks", 5, "Luke Pritchard", Genre.lIGHTMUSIC),
				new Pop("� ����� �� �����", "����� ������", 3, "�.����������", Genre.MUSICAL),
				new Pop("Talk Me Down", "Troye Sivan", 6, "Assemblage", Genre.lIGHTMUSIC),
				new Pop("Johnny Wanna Live", "Sandra", 4, "Michael Cretu", Genre.DISKO),
				new Pop("Life is a Cabaret", "Liza Minnelli", 124, "John Kander", Genre.MUSICAL) };

		// �������� ArrayList Pop(���) ��� �������, ��� ���� ������ � ����������
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
				new ProgressiveRock("Payday", "Die Fish", 2, "������ ���������", Genre.SYMPHONICROCK),
				new ProgressiveRock("Stairway To Heaven", "Led Zeppelin", 8, "Stairway to Heaven", Genre.ARTROCK),
				new ProgressiveRock("Can't Get Away", "��������� ���������", 5, "������ ���������", Genre.JAZZROCK),
				new ProgressiveRock("��������������", "����", 6, "�.���", Genre.ARTROCK),
				new ProgressiveRock("�����", "Symfomania", 4, "��������� ���������", Genre.SYMPHONICROCK),
				new ProgressiveRock("� ������ �����, ������������!", "�������� ���������", 6, "�������� ���������",
						Genre.JAZZROCK),
				new ProgressiveRock("The Q-music sessions", "Within Temptation", 3, " Anastasia Emerald",
						Genre.SYMPHONICROCK) };

		// �������� ArrayList ProgressiveRock(������������� ���) ��� �������,
		// ��� ���� ������ � ����������
		for (int i = 0; i < progressiverock.length; i++) {
			// ���� �� � ������ �����
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
				new Acapella("�������������� ����", "������� ��� ��������� ��������� ����� ������", 3,
						"�.�. ���-����������", Genre.CHOIR),
				new Acapella("� ����� ����� �����������", "���������", 5, "�. �����", Genre.CHOIR),
				new Acapella("Hot N Cold", "Katy Perry", 3, "Katheryn Elizabeth Hudson", Genre.SOLO),
				new Acapella("�� ���� ������", "������� �����", 4, "�. ������", Genre.CHOIR),
				new Acapella("Right Now", "Akon", 4, "Akon", Genre.SOLO),
				new Acapella("����� �� ����� �������� �����", "�������", 3, "�.���������", Genre.CHOIR) };

		// �������� ArrayList ��������(Acapella)
		for (int i = 0; i < acapella.length; i++) {
			acapeLla.add(acapella[i]);

		}

		ListIterator<Acapella> iteratorr = acapeLla.listIterator();
		while (iteratorr.hasNext()) {
			Object obj = iteratorr.next();
			// System.out.println(obj.toString());
		}
		System.out.println();

		// ����������� ������
		// �������� ����� playlist
		List<MusicComposition> list = new ArrayList<>();
		list.addAll(sympHony);
		list.addAll(folkLore);
		list.addAll(poP);
		list.addAll(hipHop);
		list.addAll(progressiveRock);
		list.addAll(acapeLla);

		// ������� ����������� ���������� �� ������������� ������ ��� ������ ��
		// ����
		List<MusicComposition> listRandom = new ArrayList<>();

		// ����
		int choise; // ����������, ���������� �� ����� ��������
		int count;// ���������� ������ ��� ������ �� �����
		int Min; // ����������� ������������ ����� �� �����
		int Max; // ������������ ������������ ����� �� �����
		do {
			// System("cls"); // ������� ������
			System.out.println("______________________________________________________");
			System.out.println("��� ������� �������:");
			System.out.println("\t1. ������� ���� ������ ����������� ����������");
			System.out.println("\t2. ������� ������������ ������ ����������� ����������");
			System.out.println("\t3. ����� ���������� ������ ��� ������ �� ����");
			System.out.println("\t4. ������������� ���������� ���������� �� �����");
			System.out.println("\t5. ������������ ���� ������ �� �����");
			System.out.println("\t6. ����������� ����������� �� ����� �� ��������� ���������");
			System.out.println("\t7. ������������ � ����");
			System.out.println("\t8. �������������� �����");
			System.out.println("\t0. �����");
			System.out.println("______________________________________________________");
			System.out.println("\t��� �����: ");
			choise = sc.nextInt(); // ��������� �����

			switch (choise) {
			case 1: {// ����� playlist
				ListIterator<MusicComposition> iteraTorr = list.listIterator();
				while (iteraTorr.hasNext()) {
					Object obj = iteraTorr.next();
					System.out.println(obj.toString());
				}
				System.out.println();
			}
				break;

			case 2: {// ����������� ��������� ������� ���� ������
						// MusicComposition
				Collections.shuffle(list);
				for (MusicComposition r : list) {
					System.out.println(r);
				}
				System.out.println();
			}
				break;

			case 3: {// ����� ����������� ���������� �� �����
				System.out.print("���������� ������ �� ����� ����� ");
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

			case 4: {// ���������� ��������� ����������� ���������� �� ����� ��
						// �����
				MusicComposition.sort(listRandom);
				System.out.println();
			}
				break;

			case 5: {// ������������ ���� ������ �� �����
				MusicComposition.durationAll(listRandom);
			}
				break;

			case 6: {// ���������� � �������� ���������
				System.out.print("������� ������ ������� ����������� ���������� ");
				Min = sc.nextInt();
				System.out.print("������� ������� ������� ����������� ���������� ");
				Max = sc.nextInt();
				MusicComposition.rangeOfTraks(listRandom, Min, Max);
			}
				break;

			case 7: {// ������������ � ����
				MusicComposition.serialization(listRandom);
			}
				break;

			case 8: {// �������������� �����
				MusicComposition.deserialization(listRandom);

			}
				break;
			case 0:
				return;

			default:
				System.out.println("\n �� ����� �������� ��������");
				break;
			}
		} while (choise != 0); // ���� �� ������ �����

	}

}
