package ejemplobjeto;

public class Alumno {
    //Properties
    private String name; //property called "name"
    private int age; // Property called "age"
    private String dni; // Property called "dni"
    //Methods
    public void setName(String name) { //Implementation of the method
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDni() {
        return dni;
    }
}
