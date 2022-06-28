package csvTabellieren;

import java.util.ArrayList;

public class Table {

	FileRead fileRead = new FileRead();

	public void createTable() {
		String[][] array = listToArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf(array[i][j] + " |");
			}
			System.out.println();
		}
	}

	public String[][] listToArray() {

		ArrayList<String> fileContent = fileRead.readFile();
		String[][] array = new String[fileContent.size()][];
		for (int i = 0; i < fileContent.size(); i++)
			array[i] = fileContent.get(i).split(";");

		return array;
	}
}
