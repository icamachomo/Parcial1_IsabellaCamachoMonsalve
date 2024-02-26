
//Aquí vemos la ABSTRACCIÓN, que es la capacidad de crear una clase
//con sus respectivos atributos y métodos
public class Persona {
    //Vemos en ENCAPSULAMIENTO al utilizar una visibilidad privada
    //Esta hace que no podamos sacar los elememtos de un objeto de la clase
    //a menos que se utilicen getters y setters
    private String nombreCompleto;
    private int edad;
    private String estado;
    private int puesto;
    //El puesto es 1, 2 o 3 dependiendo de si es Estudiante, Docente o Administrativo, respectivamente
    private boolean estaCasado;

    public Persona(String nombreCompleto, int edad, int puesto, boolean estaCasado) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.estado = "La persona está descansando";
        this.puesto = puesto;
        this.estaCasado = estaCasado;
    }

    //En el segundo constructor vemos el POLIMORFISMO, que me permite acceder a métodos distintos con el
    //mismo nombre. En este caso lo que diferencia mis métodos es que en uno puedo inicializar el atributo estado
    //como "La persona está descansando" por defecto, y el el otro recibo el atributo estado como un parámetro específico
    //ingresado al constructor
    public Persona(String nombreCompleto, int edad, String estado, int puesto, boolean estaCasado) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.estado = estado;
        this.puesto = puesto;
        this.estaCasado = estaCasado;
    }

    public void celebrarCumpleaños(){
        int edad = this.edad;
        edad++;
        System.out.println("¡Feliz cumpleaños " + this.nombreCompleto + "!");
        this.edad = edad;
    }

    public void casarse(){
        this.estaCasado = true;
    }

    public void ascenderPuesto(){
        int puesto = this.getPuesto();
        if(puesto == 3){
            System.out.println(this.nombreCompleto + " está en el mayor puesto posible");
        } else if(puesto == 1){
            this.puesto = 2;
            System.out.println("Felicidades, " + this.nombreCompleto + " se ha graduado, ahora es docente" );
        } else {
            this.puesto = 3;
            System.out.println("Felicidades, " + this.nombreCompleto + " ahora es administrativo/a" );
        }
    }

    public String imprimirEstadoCivil(){
        boolean estaCasado = this.estaCasado;
        String respuesta = "";
        if(estaCasado){
            respuesta += "Está casado/a";
        } else {
            respuesta += "No está casado/a";
        }
        return respuesta;
    }

    public String imprimirPuesto(){
        int puesto = this.getPuesto();
        String respuesta = "";
        switch(puesto){
            case 1:
                respuesta += "El puesto es ESTUDIANTE";
                break;
            case 2:
                respuesta += "El puesto es DOCENTE";
                break;
            case 3:
                respuesta += "El puesto es ADMINISTRATIVO";
                break;
        }
        return respuesta;
    }



    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public boolean getEstaCasado() {
        return estaCasado;
    }

    public void setEstaCasado(boolean estaCasado) {
        this.estaCasado = estaCasado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
