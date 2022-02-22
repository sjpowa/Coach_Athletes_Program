package campionato;

import java.util.Arrays;

public class Coach extends Person{

	// string current team, string [] coached teams, int years of experience, int championships won
	private String currentTeam;
	private String[] coachedTeams;
	private int yearExperience, wonChampionships;
	
	// getter - setter
	public String getCurrentTeam() {
		return currentTeam;
	}
	public void setCurrentTeam(String currentTeam) {
		this.currentTeam = currentTeam;
	}
	public String[] getCoachedTeams() {
		return coachedTeams;
	}
	public void setCoachedTeams(String[] coachedTeams) {
		this.coachedTeams = coachedTeams;
	}
	public int getYearExperience() {
		return yearExperience;
	}
	public void setYearExperience(int yearExperience) {
		this.yearExperience = yearExperience;
	}
	public int getWonChampionships() {
		return wonChampionships;
	}
	public void setWonChampionships(int wonChampionships) {
		this.wonChampionships = wonChampionships;
	}
	
	// constructor
	public Coach(String name, String lastName, int dob, String task, String currentTeam, String[] coachedTeams,
			int yearExperience, int wonChampionships) {
		super(name, lastName, dob, task);
		this.currentTeam = currentTeam;
		this.coachedTeams = coachedTeams;
		this.yearExperience = yearExperience;
		this.wonChampionships = wonChampionships;
	}
	
	// toString
	@Override
	public String toString() {
		return super.toString()
				+ "\n\nCoach"
				+ "\n | currentTeam = " + currentTeam 
				+ "\n | coachedTeams = " + Arrays.toString(coachedTeams)
				+ "\n | yearExperience = " + yearExperience 
				+ "\n | wonChampionships = " + wonChampionships;
	}
	
	// public bool Faithful () -> Returns true if the experience years are more than 10 and has only coached the current team
	public boolean faithful() {
		
		for (int i = 0; i < coachedTeams.length; i++) {
			if (yearExperience >= 10 && (coachedTeams[i].toLowerCase().equals("red team")) )
				return true;
		}
		
		return false;
	}
	
	// public bool GoodCoach() -> Returns true if the number of championships won is greater than 4;
	public boolean goodCoach() {
		
		if (wonChampionships >= 4)
			return true;
		
		return false;
	}
	
	// public bool Mercenary () -> Returns true if he has coached more teams than half the years Experience;
	public boolean mercenary() {
		int counterTeamsCoached = 0;
		for (int i = 0; i < coachedTeams.length; i++) {
			counterTeamsCoached++;
		}
		if (counterTeamsCoached > (yearExperience / 2))
			return true;
		
		return false;
	}
	
	// public override double Salary () -> Add 20% if you are a loyal coach, add 35% if you are a good coach
	// , remove 10% if he is a mercernary, otherwise reward him with a bonus of 600
	public double salary() {
		double coachSalary = 0;
		
		if (mercenary())
			coachSalary = super.salary() - (super.salary() * 0.1);
		else if ((mercenary() == false) && (faithful() == true))
			coachSalary = super.salary() + 600;
		else if (faithful())
			coachSalary = super.salary() + (super.salary() * 0.2);
		else if (goodCoach())
			coachSalary = super.salary() + (super.salary() * 0.35);
		else
			coachSalary = super.salary();
		
		return coachSalary;
	}
	
}
