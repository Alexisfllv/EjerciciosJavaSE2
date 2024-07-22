import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class stcc {

	public static void leer() throws IOException {
			FileReader fr = new FileReader("datos.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();
			fr.close();
	}

	public static void main(String[] args) {

		//
		
		try {
			leer();
		} catch (IOException e) {
			System.out.println("Problemas para lectura");
			System.out.println(e.getMessage());
		}
		

	}

}
