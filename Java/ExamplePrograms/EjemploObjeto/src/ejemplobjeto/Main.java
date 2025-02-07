package ejemplobjeto;

public class Main {
    public static void main (String[] args) {
        Alumno alumno = new Alumno(); //variable alumno and Alumno() is a builder method
        alumno.setName("John"); // Use of the method
        alumno.setDni("12345678N");
        alumno.setAge(29);

        System.out.println("Name of the alumno: " + alumno.getName());
        System.out.println("Dni of the alumno: " + alumno.getDni());
        System.out.println("Age of the alumno: " + alumno.getAge());
    }
}
