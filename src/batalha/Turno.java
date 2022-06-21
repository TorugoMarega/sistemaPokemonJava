package batalha;

import javax.swing.JOptionPane;

import pokemon.Pokemon;

public class Turno {
	public void iniciaJogo() {
		//Instaciação dos objetos pokemon
		Pokemon pikachu = new Pokemon("Pikachu", 1, "Choquinho", 10, 10);
		Pokemon squirtle = new Pokemon("Squirtle", 2, "Aguinha", 11, 9);
		
		//Criação das variaveis
		int ataca,
			defende,
			randomAtaque1,
			randomDefesa1,
			randomAtaque2,
			randomDefesa2;
		
		//Armazenamento do nome do perdedor e do vencedor
		String ganhador="",
			   perdedor="";
		
		// ficha de dados dos pokemons
		pikachu.getDadosPokemon();
		squirtle.getDadosPokemon();
		
		
		/*---------------INICIO DA BATALHA-----------------------------*/
		
		
		do {
			
			/*-----------------------INICIO DO TURNO---------------*/
			
				//Gera numeros aleatórios no intervalo entre 0 e 5 para o player definir qual ataque e defesa escolher
				
				//randomAtaque1 = (int) (Math.random()*5);
				//randomDefesa1 = (int) (Math.random()*5);
			
				//Gera numeros aleatórios no intervalo entre 0 e 5 para o inimigo definir qual ataque e defesa escolher
				randomAtaque2 = (int) (Math.random()*5);
				randomDefesa2 = (int) (Math.random()*5);
				
				/*--------------------MENU DE ATAQUE------------------------------*/
				Object[] ataques = {"Ataque 1", "Ataque 2", "Ataque 3", "Ataque 4"};
				randomAtaque1 = JOptionPane.showOptionDialog(null,
				"Escolha seu ataque",
				"Escolha um Ataque:",
			    JOptionPane.DEFAULT_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,ataques,ataques[0]);
				
				
				/*------------------------------------------------------------------*/
				ataca = pikachu.ataca(randomAtaque1);
				defende = squirtle.defende(randomDefesa2);
				JOptionPane.showMessageDialog(null, pikachu.getNome()+ " atacou "+ squirtle.getNome() +"\n\n Ataque "+pikachu.getNome()+": "+ ataca +"\nDefesa "+squirtle.getNome()+": "+defende);
				squirtle.perdeVida(ataca,defende);
				squirtle.verificaMorte();
				if(pikachu.getMorreu()==true) {
					ganhador = squirtle.getNome();
					perdedor = pikachu.getNome();
					break;
				}
				else if(squirtle.getMorreu()==true){
					ganhador = pikachu.getNome();
					perdedor = squirtle.getNome();
					break;
				}
				
				/*--------------------MENU DE DEFESA------------------------------*/
				Object[] defesas = {"Defesa 1", "Defesa 2", "Defesa 3", "Defesa 4"};
				randomDefesa1 = JOptionPane.showOptionDialog(null,
				"Escolha sua Defesa",
				"Escolha uma Defesa:",
			    JOptionPane.DEFAULT_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,defesas,defesas[0]);
				/*------------------------------------------------------------------*/
				
				ataca = squirtle.ataca(randomAtaque2);
				defende = pikachu.defende(randomDefesa1);
				JOptionPane.showMessageDialog(null, squirtle.getNome()+ " atacou "+ pikachu.getNome() +"\n\n Ataque "+squirtle.getNome()+": "+ ataca +"\nDefesa "+pikachu.getNome()+": "+defende);
				pikachu.perdeVida(ataca,defende);
				pikachu.verificaMorte();
				if(pikachu.getMorreu()==true) {
					ganhador = squirtle.getNome();
					perdedor = pikachu.getNome();
					break;
				}
				else if(squirtle.getMorreu()==true){
					ganhador = pikachu.getNome();
					perdedor = squirtle.getNome();
					break;
				}
		} while(squirtle.getVida() > 0 || pikachu.getVida()> 0);
		JOptionPane.showMessageDialog(null, ganhador+ " Venceu!\n"+perdedor + " foi derrotado!");
	}
}
