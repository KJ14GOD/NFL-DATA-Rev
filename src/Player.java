
public class Player {
	private int age;
	private String name;
	private String team;
	private boolean isActive;
	
	public Player(int age, String name, String team, boolean isActive) {
		this.age = age;
		this.name = name;
		this.team = team;
		this.isActive = isActive;
	}
	
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public String getTeam(){
		return team;
	}
	public boolean getisActive(){
		return isActive;
	}
}
