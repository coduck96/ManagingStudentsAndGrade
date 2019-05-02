

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class setFile {
	File file;
	FileReader reader;
	Object[][] table = new Object[20][8];
	String[][] stable = new String[20][8];

	public setFile(String filePath) {
		String readLine[] = new String[30];
		file = new File(filePath);
		try {
			// ���ο� ������ ���� �ʱ�ȭ
			reader = new FileReader(file);
			BufferedReader in = new BufferedReader(reader);
			
			// ���� ����
			for (int i = 0; i < readLine.length; i++)
				readLine[i] = new String();

			// ���θ��� ���ۿ� ����
			int rows = 0;
			while ((readLine[rows] = in.readLine()) != null) {
				rows++;
			}
			
			String[] st = new String[8];
			
			for (int j = 0; j <rows; j++) {
				
				for (int i = 0; i < 8; i++) {
					st[i] = new String();
					st = readLine[j].split(",");
					stable[j][i]=st[i];
				}
			
			}
			in.close();
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: FileNotFoundException");

		} catch (IOException e) {
			System.out.println("File not found: IOException");

		}

	}
	
	public Object[][] setArray() {
		table=stable;
		return table;
	}

}