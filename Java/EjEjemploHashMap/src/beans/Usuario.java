package beans;
/**
 * Bean que contiene los datos de un usuario
 * @author Eduardo A. Ponce
 * @version 1.0
 *
 */
public class Usuario {
	
		/**
		 * Nombre del usuario
		 */
		private String nombre;
		/**
		 * Apellidos del usuario
		 */
		private String apellidos;
		/**
		 * DNI del usuario;
		 */
		private String dni;
		
		
		/**
		 * Constructor con parámetros de entrada para inicializar sus propiedades
		 * @param nombre Nombre del usuario
		 * @param apellidos Apellidos del usuario
		 * @param dni DNI del usuario
		 */
		public Usuario(String nombre, String apellidos, String dni) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.dni = dni;
		}
		/**
		 * Obtiene el valor de nombre
		 * @return El nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * Establece el valor de nombre
		 * @param nombre El valor de nombre a establecer
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * Obtiene el valor de apellidos
		 * @return El apellidos
		 */
		public String getApellidos() {
			return apellidos;
		}
		/**
		 * Establece el valor de apellidos
		 * @param apellidos El valor de apellidos a establecer
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		/**
		 * Obtiene el valor de dni
		 * @return El dni
		 */
		public String getDni() {
			return dni;
		}
		/**
		 * Establece el valor de dni
		 * @param dni El valor de dni a establecer
		 */
		public void setDni(String dni) {
			this.dni = dni;
		}
		
		/**
		 * Convierte a cadena un objeto usuario
		 */
		public String toString() {
			return ("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nDNI: "+dni);
		}
		
		/**
		 * Implementación del método de comparación equals()
		 */
		public boolean equals(Object usr) {
			Usuario usuario = (Usuario) usr;
			System.out.println("Se emplea la comparación equals de Usuario");
			if 	(
					usuario != null &&
					this.dni.equals(usuario.dni) &&
					this.nombre.equals(usuario.nombre) &
					this.apellidos.equals(usuario.apellidos)
				)
				return true;
			else
				return false;
		}
		
		/**
		 * Implementación del método hashCode()
		 */
		public int hashCode() {
			System.out.println("Se emplea hashCode del objeto Usuario");
			return (this.dni+this.nombre+this.apellidos).hashCode();
		}

}
