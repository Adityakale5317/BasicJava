package Assignment_6_Access_Modifier;

class Cricket{
	void best_countries() {
		System.out.println("India, South Africa");
	}
}

class OtherCricketTeams extends Cricket{
	void other_countries(){
		System.out.println("GBR, Australia");
	}
	void all_teams() {
		other_countries();
		super.best_countries();
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		OtherCricketTeams team = new OtherCricketTeams();
		team.all_teams();

	}

}
