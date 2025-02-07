//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero; //declaración de variable
        int contador; //Todas las variables se declaran juntas y antes de hacer cualquier cosa
        int resultado;

        numero = 4; //asignar o inicializar(la primera vez que se le da valor) valor a una variable
        contador = 1; // Se puede hacer junto: int contador = 1;
                    //bloque que se repite
        do {
            resultado = numero * contador;
            System.out.println(numero+"*"+contador+"="+resultado);
            contador++;
        } while (contador < 11);


    }
}

//if (contador > 10) {} //Salimos
        // código en caso afirmativo
  //      else //repetimos
// código en caso negativo
