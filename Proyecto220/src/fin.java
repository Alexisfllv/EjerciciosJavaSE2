import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fin {

	public static void main(String []args) {
		
		//
		
		FileWriter fw = null;
		BufferedWriter bw =  null;
		
		try {
			fw =  new FileWriter(new File("datos.txt"));
			bw = new BufferedWriter(fw);
			
			bw.write("Linea 1");
			bw.newLine();
			bw.write("Linea 2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (bw !=  null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		//
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("datos.txt");
			br = new BufferedReader(fr);
			
			String linea;
			linea = br.readLine();
			
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
