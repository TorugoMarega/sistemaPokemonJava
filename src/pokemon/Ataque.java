package pokemon;

public class Ataque {
	private int ataqueBase;

	//---------CONSTRUTOR DO OBJETO ATAQUE------
	public Ataque(int valorAtaque) {
		this.ataqueBase = valorAtaque;
	}

	public int getAtaque1() {
		return this.ataqueBase;
	}

	public int getAtaque2() {
		return this.ataqueBase + 3;
	}

	public int getAtaque3() {
		return this.ataqueBase + 5;
	}

	public int getAtaque4() {
		return this.ataqueBase + 7;
	}
}
