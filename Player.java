package campionato;

import java.text.DecimalFormat;

public class Player extends Person{

	private String team, role;
	private int yearExperience, jerseyNumber, wonGames, lostGames, wonChampionship;
	private boolean captain;
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getYearExperience() {
		return yearExperience;
	}
	public void setYearExperience(int yearExperience) {
		this.yearExperience = yearExperience;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public int getWonGames() {
		return wonGames;
	}
	public void setWonGames(int wonGames) {
		this.wonGames = wonGames;
	}
	public int getLostGames() {
		return lostGames;
	}
	public void setLostGames(int lostGames) {
		this.lostGames = lostGames;
	}
	public boolean isCaptain() {
		return captain;
	}
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	public int getWonChampionship() {
		return wonChampionship;
	}
	public void setWonChampionship(int wonChampionship) {
		this.wonChampionship = wonChampionship;
	}
	
	// constructor
	public Player(String name, String lastName, int dob, String task, String team, String role, int yearExperience,
			int jerseyNumber, int wonGames, int lostGames, boolean captain, int wonChampionship) {
		super(name, lastName, dob, task);
		this.team = team;
		this.role = role;
		this.yearExperience = yearExperience;
		this.jerseyNumber = jerseyNumber;
		this.wonGames = wonGames;
		this.lostGames = lostGames;
		this.captain = captain;
		this.wonChampionship = wonChampionship;
	}
	
	// toString() Method
	@Override
	public String toString() {
		return 
				super.toString() + // recall with the keyword super the ToString() Method so i can check who is this person!
				"\n\nPlayer"
				+ "\n | Team =  " + role 
				+ "\n | yearExperience = " + yearExperience 
				+ "\n | jerseyNumber = " + jerseyNumber 
				+ "\n | wonGames = " + wonGames 
				+ "\n | lostGames = " + lostGames 
				+ "\n | captain = " + captain
				+ "\n | wonChampionship = " + wonChampionship 
				;
	}
	
	// public bool Expert()-> return true if the yearExperience are more than 10
	public boolean expert() {
		if (yearExperience > 10)
			return true;
		return false;
	}
	
	// public bool Winner() -> return true if the wonChamps are more than half yearExperience
	public boolean winner() {
		if (wonChampionship > (yearExperience / 2))
			return true;
		return false;
	}
	
	// decimal format
	DecimalFormat df = new DecimalFormat("0.00");
	
	// public double Statistics() -> Return the percentage of games won compared to the total number of games played
	public double statistics() {
		double matchPlayed = wonGames + lostGames;
		
		// to check the percentage of the wonGames -> wonGame / nrMatchPlayed * 100;
		double x = ((wonGames / matchPlayed) * 100);
		double winPercentage = Double.valueOf(df.format(x));
		return winPercentage;
	}
	
	// public override double Salary () -> Add 10% if he is an experienced player, add 35% if he is a winner,
	@Override
	public double salary() {
		double salaryPlayer = 0;
		
		// 700 : x = 100 : 10
		// x = 700 * 10 / 100
		
		if (expert())
			salaryPlayer = (super.salary()) + ( (super.salary()) * 10 / 100);
		else if (winner())
			salaryPlayer = (super.salary()) + ( (super.salary()) * 35 / 100);
		else {
			salaryPlayer = super.salary();
		}
		
		return salaryPlayer;
	}
	
} //endClass
