package grensesnitt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import acm.program.ConsoleProgram;

public class Hovedprogram extends ConsoleProgram {

	public void run() {
//		println("Hei!");
//		Person p = new Person1();
//		p.setFornavn("Hallvard");
//		println(p.getFornavn());
		
		List<Person1> personList = new ArrayList<Person1>(Arrays.asList(
				new Person1("Ola Nordmann", 42),
				new Person1("Kari Nordmann", 39),
				new Person1("Hallvard Trūtteberg", 45)
		));
		Collections.sort(personList);
//		Collections.sort(personList, new Personsammenligner());
<<<<<<< .mine
//		sort(personList);
=======
		sort(personList, ???);
>>>>>>> .r519
		println(personList);
	}
	
	void sort(List<Person1> persons, PersonComparison comparison) {
		for (int i = persons.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				Person1 p1 = persons.get(j), p2 = persons.get(j + 1);
				if (comparison.comparePerson(p1, p2)) {
					persons.set(j, p2);
					persons.set(j + 1, p1);
				}
			}
		}
	}
}
