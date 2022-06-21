package pokemon;

public class Defesa {

	private int defesaBase;
	
	//---------CONSTRUTOR DO OBJETO DEFESA------
	public Defesa(int ValorDefesa) {
		this.defesaBase = ValorDefesa;
	}

	public int getValorDefesa1() {
		return this.defesaBase;
	}

	public int getValorDefesa2() {
		return this.defesaBase + 2;
	}

	public int getValorDefesa3() {
		return this.defesaBase + 5;
	}

	public int getValorDefesa4() {
		return this.defesaBase * 2;
	}
}