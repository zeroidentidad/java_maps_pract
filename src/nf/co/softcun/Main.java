package nf.co.softcun;

import java.util.HashMap;

import java.util.Map;

public class Main {
	
	public static final String DESAYUNO = "desayuno";
	public static final String ALMUERZO = "almuerzo";
	public static final String CENA = "cena";
	
	public static void main(String[] args) {
		
		Map<String,String> comidas = new HashMap<>();
		comidas.put(DESAYUNO,"webitos");
		comidas.put(ALMUERZO,"empanadas");
		comidas.put(CENA,"licuado");
		
		System.out.println(comidas+"\n");
		
		System.out.println(comidas.get(CENA)+"\n");
		
		String almuerzo = comidas.remove(ALMUERZO);
		
		boolean tieneAlmuerzo = comidas.containsKey(ALMUERZO);
		boolean tieneEmpanadas = comidas.containsValue("empanadas");
		
		int tamanio = comidas.size();
		
		System.out.println(almuerzo+" "+tieneAlmuerzo+" "+tieneEmpanadas+" "+tamanio);
		
	}

}
