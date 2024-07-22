import java.io.File;

public class arbol {
	//

	public void leer(String directorio) {
		File ar = new File(directorio);
		String[] dir = ar.list();
		if (dir != null) {

			for (int i = 0; i < dir.length; i++) {
				File ar2 = new File(directorio + dir[i]);
				if (ar2.isFile()) {
					System.out.println("Archivo: " + dir[i]);
				}
				if (ar2.isDirectory()) {
					System.out.println("Directorio: " + dir[i].toUpperCase());
					leer(directorio + dir[i] + "\\");
				}
			}
		}
	}

	public static void main(String[] args) {
		arbol ar = new arbol();
		ar.leer("D:\\ImgAnime\\");
	}

}
