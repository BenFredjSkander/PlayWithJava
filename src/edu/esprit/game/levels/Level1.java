package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.Comparator;
import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		List<Employee> employees = Data.employees();

		/* TO DO 1: Afficher tous les employés */
		employees
		.stream()
		.forEach(emp -> System.out.println(emp));

		/*
		 * TO DO 2: Afficher les employés dont le nom commence par la lettre n
		 */
		employees
		.stream()
		.filter(t -> t.getName().toLowerCase().startsWith("n"))
		.forEach(System.out::println);

		/*
		 * TO DO 3: Afficher les employés dont le nom commence par la lettre n et le
		 * salaire> 1000
		 */
		employees
		.stream()
		.filter(t -> t.getName().toLowerCase().startsWith("n"))
		.filter(emp -> emp.getSalary() > 1000)
		.forEach(emp -> System.out.println(emp));

		/*
		 * TO DO 4: Afficher les employés dont le nom commence par la lettre s triés par
		 * salaire
		 */
		employees
		.stream()
		.filter(t -> t.getName().toLowerCase().startsWith("s"))
		.sorted((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()))
		.forEach(emp -> System.out.println(emp));

		/*
		 * TO DO 5: Afficher les noms des employés dont le salaire > 600 avec 2 maniéres
		 * différentes
		 */
		/* First Way */
		employees
		.stream()
		.filter(emp -> emp.getSalary() > 600)
		.forEach(emp -> System.out.println(emp.getName()));
		
		/* Second Way */
		employees
		.stream()
		.filter(emp -> emp.getSalary() > 600)
		.map(emp -> emp.getName())
		.peek(res -> System.out.println(res));

		/*
		 * TO DO 6: Ajouter 200 D pour les employés dont le nom commence avec m et les
		 * affichés ensuite
		 */
		employees
		.stream()
		.filter(t -> t.getName().toLowerCase().startsWith("m"))
		.forEach(emp ->{
			emp.setSalary(emp.getSalary() + 200);
			System.out.println(emp);
				}
		);

	}
}
