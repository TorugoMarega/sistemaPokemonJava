package batalha;

import javax.swing.JOptionPane;

public class Batalha {

	public static void main(String[] args) {
		Turno turnos = new Turno();
		
		 String buttons[]={"Sim","Não"};
         int inicia = JOptionPane.showOptionDialog(null,"Deseja iniciar a partida?","POKÉMON",JOptionPane.NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,buttons,"default");
         if (inicia ==0) {
        	 turnos.iniciaJogo(); 
         }
         else {
        	 JOptionPane.showMessageDialog(null, "Programa Finalizado!");
        	 System.exit(1);
         }
	}
}
