
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.table.DefaultTableModel;

public class FileOut {
   public FileOut(DefaultTableModel tablemodel){
      int rows=tablemodel.getRowCount();
      int columns=tablemodel.getColumnCount();
      
      try {
         PrintWriter pw=new PrintWriter("C:\\Users\\user\\Documents\\out.txt");
         for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
            	if(j==columns-1) {
            		pw.print(tablemodel.getValueAt(i, j));
            	}else {
            	pw.print(tablemodel.getValueAt(i, j)+", ");
            	}
               }
            pw.println("");

         }
          
           System.out.println("TextFile 저장 성공");
            pw.close();
      
      }catch(IOException e) {
         System.out.println("File not found.");
      }
      
   }
      
}