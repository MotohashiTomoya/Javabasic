package practice18;

public class Player {
	/*
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */
	String position;
	String name;
	String country;
	String team;
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return position + "," +name+","+country+","+team;

	}
}