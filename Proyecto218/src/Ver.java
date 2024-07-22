import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ver {
	
	public static void main (String [] args) {
		
		
		//
		
		try {
			FileWriter fw = new  FileWriter(new File("datos.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Linea 1");
			bw.newLine();
			bw.write("Linea 2");
			bw.close();
			fw.close();
			
		} catch (IOException ex) {
			System.out.println("Problemas en la creacion del archivo");
			
			
			
		}
		
		try {
			FileReader fr = new FileReader(new File ("datos1.txt"));
			
			BufferedReader br = new BufferedReader(fr);
			//leer
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line =  br.readLine();
			}
			
		} catch (IOException ex) {
			System.out.println("Problemas con la lectura del archivo");
			System.out.println(ex.getMessage());

		
		}
		
		
		
		
	}

}
