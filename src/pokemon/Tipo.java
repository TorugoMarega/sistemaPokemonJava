package pokemon;

public class Tipo {

	private int idTipo;
	private String tituloTipo;

	//---------CONSTRUTOR DO OBJETO TIPO------
	public Tipo(int id, String tipo) {
		this.idTipo = id;
		this.tituloTipo = tipo;
	}

	public int getIdTipo() {
		return this.idTipo;
	}

	public String getTituloTipo() {
		return this.tituloTipo;
	}
	
}