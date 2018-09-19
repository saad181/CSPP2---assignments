class Person {
	private String user;
	private List<String> friendsList;
	Person(String user) {
		this.user = user;
		friendsList = new List<String>();
	}
	public String getUser() {
		return this.user;
	}
	public void addFriend(String follower) {
		friendsList.add(follower);
	}
	public List<String> getList() {
		return friendsList;
	}
	public String toString() {
		// String str = "[";
		// for (int i = 0; i < friendsList.size() - 1; i++) {
		// 	str +=  friendsList.get(i) + ", ";
		// }
		// str += friendsList.get(friendsList.size() - 1) + "]";
		String str = this.user+": "+friendsList.toString();
		return str;
	}
}