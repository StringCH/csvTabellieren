package csvTabellieren;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

	public ArrayList<String> readFile() {

		ArrayList<String> fileContent = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/csvTabellieren/Customers.csv"));
			String line;
			while ((line = reader.readLine()) != null) {
				fileContent.add(line);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileContent;
	}
}
