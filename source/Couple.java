public class Couple {
	private int latence;
	private Cache c;

	public Couple(int l, Cache c) {
		this.latence = l;
		this.c = c;
	}

	public int getLatence() {
		return latence;
	}

	public void setLatence(int l) {
		this.latence = l;
	}

}