
public class Recu {

	public int[] vec = { 200, 100, 50, 25 };

	public void ordenar() {
		ordenar(vec, vec.length);
	}

	private void ordenar(int[] v, int cant) {
		if (cant > 1) {
			for (int i = 0; i < cant - 1; i++) {
				if (v[i] > v[i + 1]) {
					int aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
				}
			}
			ordenar(v, cant - 1);
		}
	}
	
	
	public void imprimir() {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+" - ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Recu re = new Recu();
		re.imprimir();
		re.ordenar();
		re.imprimir();
	}
}
