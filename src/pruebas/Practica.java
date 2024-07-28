package pruebas;

public class Practica {

	public static void main(String[] args) {
		//Se crea una variable primitiva
		int numeroOriginal = 31;
		//La variable pasa como parametro a una funcion
		metodo_valor(numeroOriginal);
		//Se imprime la variable, la cual no es afectada por el metodo
		System.out.println("•Ejemplo -paso por VALOR-");
		System.out.println(numeroOriginal);
		
		/*******************************************************/
		
		//Se crea un ARRAY, funciona de igual manera con objetos
		int [] listaOriginal = new int[4];
		//Se llena el ARRAY
		listaOriginal[0] = 11;
		listaOriginal[1] = 21;
		listaOriginal[2] = 31;
		listaOriginal[3] = 41;
		//nuestro ARRAY es enviado como parametro
		metodo_referencia(listaOriginal);
		//Se imprime nuestro ARRAY en esta ocasion si es modificado por el metodo
		System.out.println("\n•Ejemplo -paso por REFERENCIA-");
		for (int dato: listaOriginal) {
			System.out.println(dato);
		}
	}
	
	static void metodo_valor(int numeroOriginal) {
		/*La variable llega como parametro, es actualizada
		al ser una copia de nuestra variable original no afectamos
		a nuestra variable del MAIN la que esta aqui 
		existe en otro espacio en memoria diferente
		Podriamos si quisieramos imprimirla desde aqui
		y asi ver su valor actualizado*/
		numeroOriginal = 231;
		//System.out.println(numeroOriginal);
	}
	
	static void metodo_referencia(int [] listaOriginal) {
		/*Se imprime el ARRAY al mismo tiemo que se le coloca
		el valor 0 en cada una de las posiciones*/
		listaOriginal[0] = 101;
		listaOriginal[1] = 102;
		listaOriginal[2] = 103;
		listaOriginal[3] = 104;
	}
	
}
