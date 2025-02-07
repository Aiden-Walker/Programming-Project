package procesos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import beans.Usuario;

/**
 * Proceso que emplea HashMap
 * Nota: La estructura de colecciones en Java no considera a un mapa como una colección
 * en sí mismo. Pueden obtenerse vistas del mapa con el propósito, entre otros, de 
 * recorrerlo. Hay tres vistas:
 * - conjunto de claves (Set keySet())
 * - colección de valores (Collection values())
 * - conjunto parejas clave/valor (Set entrySet())
 * @author Eduardo A. Ponce
 * @version 1.0
 */
public class ProcesoMap {
	/**
	 * Ejecuta el proceso asociado al ejemplo de uso de ArrayList
	 */
	public void ejecutar() {
		HashMap<String,Usuario> conjuntoUsr = new HashMap<String,Usuario>();
		Iterator<String> iterador = null;
		Iterator<Map.Entry<String,Usuario>> iterador2 = null;
		Set<Entry<String, Usuario>> entradas = null;
		Map.Entry<String,Usuario> entrada = null;
		Usuario usr = null;
		 
		usr = new Usuario("José","López Rodríguez","19226458E");
		mensaje("Se inserta "+usr);
		conjuntoUsr.put(usr.getDni(),usr);
		usr = new Usuario("Francisco","Martín Luca","29226458J");
		mensaje("Se inserta "+usr);
		conjuntoUsr.put(usr.getDni(),usr);
		usr = new Usuario("Ana","Viera Luján","24781902T");
		mensaje("Se inserta "+usr);
		conjuntoUsr.put(usr.getDni(),usr);
		mensaje("Se inserta "+usr);
		conjuntoUsr.put(usr.getDni(),usr);
		
		// Obtener vistas del mapa
		// Recuperar las claves del mapa
		Set<String> claves = conjuntoUsr.keySet();
		mensaje("Se listan los DNI de los usuarios:");
		iterador = claves.iterator();
		while (iterador.hasNext())
			mensaje(iterador.next());
		
		// Mostrar todos los valores del HashMap
		entradas = conjuntoUsr.entrySet();
                
                // empleando iterador
                mensaje("Empleando iterador.");
		iterador2 = entradas.iterator();
		while (iterador2.hasNext()) {
			entrada = (Map.Entry<String, Usuario>) iterador2.next();
			mensaje("Clave: "+entrada.getKey()+" - DNI: "+((Usuario)entrada.getValue()).getDni()+
					" - Apellidos: "+((Usuario)entrada.getValue()).getApellidos()+
					" - Nombre: "+((Usuario)entrada.getValue()).getNombre());
		}
                
                // empleando foreach
                mensaje("Empleando foreach.");
                for (Map.Entry<String,Usuario> elemento: entradas) {
                    mensaje("Clave: "+elemento.getKey()+" - DNI: "+((Usuario)elemento.getValue()).getDni()+
                                    " - Apellidos: "+((Usuario)elemento.getValue()).getApellidos()+
                                    " - Nombre: "+((Usuario)elemento.getValue()).getNombre());
                }
		// También se puede mostrar un HashMap a lo "bestia"
                
                mensaje("Mostrando el HashMap a lo bestia.");
		mensaje(conjuntoUsr);
		
		// Eliminar el usuario con DNI 29226458J
		conjuntoUsr.remove("29226458J");
		
		// Añadir un usuario
		conjuntoUsr.put("29496471Y", new Usuario("Alberto","Molina Mesa","29496471Y"));
		
		// Mostrar los datos de un Usuario concreto
                mensaje("se muestran los datos del usuario con dni 29496471Y.");
		mensaje(conjuntoUsr.get("29496471Y"));
		
		// Se muestran otra vez los datos
		mensaje("Este es el resultado final: ");
		
		entradas = conjuntoUsr.entrySet();
		iterador2 = entradas.iterator();
		while (iterador2.hasNext()) {
			entrada = (Map.Entry<String, Usuario>) iterador2.next();
			mensaje("Clave: "+entrada.getKey()+" - DNI: "+((Usuario)entrada.getValue()).getDni()+
					" - Apellidos: "+((Usuario)entrada.getValue()).getApellidos()+
					" - Nombre: "+((Usuario)entrada.getValue()).getNombre());
		}
	}
	
	/**
	 * Muestra el mensaje cadena
	 * @param cadena
	 */
	public void mensaje(String cadena) {
		System.out.println(cadena);
	}
	/**
	 * Muestra la cadena resultante de Usuario
	 * @param usr Objeto Usuario que se mostrará como cadena
	 */
	public void mensaje(Usuario usr) {
		System.out.println(usr);
	}
	/**
	 * Muestra la cadena resultante del HashMap
	 * @param usr Objeto Usuario que se mostrará como cadena
	 */
	public void mensaje(HashMap<String,Usuario> usr) {
		System.out.println(usr);
	}
}

