package campionato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PERSON OBJ
		// Person p1 = new Person("Pippo", "Rossi", 1955, "Coach");
	
		// System.out.println(p1.age());
		// System.out.println(p1.toString());
		
		// ======================================
		
		// PLAYER OBJ
		// (String name, String lastName, int dob, String task, String team, String role, int yearExperience,
		// int jerseyNumber, int wonGames, int lostGames, boolean captain, int wonChampionship)
		// Player p2 = new Player("Pippo", "Rossi", 1988, "Player", "Red Team", "Striker", 10, 10, 67, 41, true, 10);
	
		// System.out.println(p2);
		// System.out.println("\n > THIS PLAYER HAS: " + p2.age() + " YEARS");
		// System.out.println("\n > IS THIS PLAYER AN EXPERT??? ---> " + p2.expert());
		// System.out.println("\n > IS THIS PLAYER A WINNER?!? | wonChamps > experience/2 | ---> " + p2.winner());
		// System.out.println("\n > PERCENTAGE WIN GAMES OF THIS PLAYER ---> " + p2.statistics() +"%");
		// System.out.println("\n > SALARY OF THIS PLAYER IS: " + p2.salary() + "$);
		
		// ======================================
		
		// COACH OBJ
		String[] coachedTeams = new String[] {"Red Team", "Blue Team", "Green Team", "Yellow Team"};
		
		Coach c1 = new Coach("Paperino", "Joss", 1976, "Coach", "Red Team", coachedTeams, 10, 5);
		
		System.out.println(c1.toString());
		System.out.println("\n> THE AGE OF THE COACH IS: " + c1.age() + " YEARS");
		System.out.println("\n> HAS THE COACH MORE THAN 10 YEARS OF EXPERIENCE?!? ---> " + c1.faithful());
		System.out.println("\n> IS THIS PERSON A GOOD COACH?!? ---> " + c1.goodCoach());
		System.out.println("\n> IS THIS COACH A MERCENARY?!? ---> " + c1.mercenary());
		System.out.println("\n> THE SALARY OF THE COACH IS: ---> " + c1.salary() + "$");
		
	}

}
