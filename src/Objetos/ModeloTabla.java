package Objetos;

import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public boolean isCellEditable (int row, int column)
   {
       // Aqu� devolvemos true o false seg�n queramos que una celda
       // identificada por fila,columna (row,column), sea o no editable
       if (column == 15000)
          return true;
       return false;
   }
}