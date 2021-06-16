package c;

public class State {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class Citizen {

		private String name;

		public String getName() {
			// return Citizen.this.name;
			return name;
		}

		public String getStateName() {
			return State.this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
