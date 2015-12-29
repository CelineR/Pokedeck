package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Datas.ModelDeck;
import IHM.ShowDeckContent;

public class ControlerShowDeck implements ActionListener{
	
	ShowDeckContent SHD;
	ModelDeck MD = new ModelDeck();
	
	public ControlerShowDeck(ShowDeckContent SHD){
		
		this.SHD=SHD;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(((JButton)(e.getSource())).getText()=="OK"){
			
			SHD.setVisible(false);
		
		}
		

		
	}

}
