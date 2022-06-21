package pokemon;

import javax.swing.JOptionPane;

public class Pokemon {
	private boolean morreu = false;
	private int vida = 10;
	private String nome;
	private Ataque ataque;
	private Defesa defesa;
	private Tipo tipo;
	
	//----------------------CONSTRUTOR DO POKEMON------------------------------------------------
	// NECESSITA DE NOME, ID E TIPO, VALOR BASE DE ATAQUE E DEFESA 
	public Pokemon (String nome,int idTipo,String tituloTipo, int valorAtaque, int valorDefesa) {
		
		this.nome = nome;
		
		Ataque ataque = new Ataque(valorAtaque);
		this.ataque = ataque;
		Defesa defesa = new Defesa(valorDefesa);
		this.defesa = defesa;
		Tipo tipo = new Tipo (idTipo, tituloTipo);
		this.tipo = tipo;
	}

	public int getVida() {
		return vida;
	}

	public String getNome() {
		return nome;
	}
	

	public void getDadosPokemon() {
		JOptionPane.showMessageDialog(null,
				"Nome: " +this.getNome()
				+"\n------------------------"
				+"\nTipo: "+this.tipo.getIdTipo()+" - "+this.tipo.getTituloTipo()
				+"\n------------------------"
				+"\nAtaque 1: "+this.ataque.getAtaque1()
				+"\nAtaque 2: "+this.ataque.getAtaque2()
				+"\nAtaque 3: "+this.ataque.getAtaque3()
				+"\nAtaque 4: "+this.ataque.getAtaque4()
				+"\n------------------------"
				+"\nDefesa 1: "+this.defesa.getValorDefesa1()
				+"\nDefesa 2: "+this.defesa.getValorDefesa2()
				+"\nDefesa 3: "+this.defesa.getValorDefesa3()
				+"\nDefesa 4: "+this.defesa.getValorDefesa4()
				+"\n------------------------"
				+"\nVida: "+ this.getVida()
		);
	}

	public int ataca(int numeroAtaque) {
		if (numeroAtaque == 0) {
			return this.ataque.getAtaque1();
		}
		else if (numeroAtaque == 1) {
			return this.ataque.getAtaque2();
		}
		else if (numeroAtaque == 2) {
			return this.ataque.getAtaque3();
		}
		else if (numeroAtaque == 3) {
			return this.ataque.getAtaque4();
		}
		else {
			return this.ataque.getAtaque1();
		}
	}

	public int defende(int numeroDefesa) {
		if (numeroDefesa == 0) {
			return this.defesa.getValorDefesa1();
		}
		else if (numeroDefesa == 1) {
			return this.defesa.getValorDefesa2();
		}
		else if (numeroDefesa == 2) {
			return this.defesa.getValorDefesa3();
		}
		else if (numeroDefesa == 3) {
			return this.defesa.getValorDefesa4();
		}
		else {
			return this.defesa.getValorDefesa1();
		}
	}

	public void perdeVida(int valorDoAtaqueDoInimigo, int valorDaDefesa) {
		int pv;
		if(valorDaDefesa >= valorDoAtaqueDoInimigo) {
			pv = 0;
			this.vida +=pv;
			
		}
		else {
			pv = valorDoAtaqueDoInimigo - valorDaDefesa;
			if(this.vida - pv < 0) {
				this.vida =0;
			}
			else {
				this.vida -= pv;
			}
		}
			JOptionPane.showMessageDialog(null,this.getNome() +" Perdeu "+ pv + " pontos de vida\nVida: " + this.getVida());
	}
	
	public boolean getMorreu() {
		return this.morreu;
	}
	
	public void verificaMorte() {
		if (this.vida <=0) {
			this.vida = 0;
			this.morreu = true;
		}
		else {
			this.morreu=false;
		}
		
	}

}
