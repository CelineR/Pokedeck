package Datas;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Controlers.ControlerMenu;


public class ModelDeck extends AbstractTableModel  {
	


	public int getColumnCount() {

		return 4;
	}
	
	public int getRowCount() {

		return ControlerMenu.getP1().getCardsList().size();
	}
	
	public String getColumnName(int arg0) {

		switch (arg0) {

		case 0:
			return "Nom";
		case 1:
			return "type";
		case 2:
			return "Numero";
		case 3:
			return "description";

		}

		return null;
	}
	
	@Override
	public Object getValueAt(int arg0, int arg1) {
		cards c = ControlerMenu.getP1().getCardsList().get(arg0);
		switch (arg1) {

		case 0:
			return c.getName();
		case 1:
			return c.getType();
		case 2:
			return c.getNumCarte();
		case 3:
			return c.getdescription();

		}
		return null;
	}
	
}
