public class ObjetosDePersona {
    public static void main(String[] args) {
        //La HERENCIA puede verse al crear objetos o clases que se derivan de una
        //clase padre. En este caso vemos la herencia en la instancia de los objetos Persona
        Persona persona1 = new Persona("Isabella Camacho", 19, "Haciendo un parcial", 1, false );
        Persona persona2 = new Persona("Pedro Pérez", 32, 2, true);
        Persona persona3 = new Persona("José Jimenez", 45, 2, false);
        Persona persona4 = new Persona("Paola Pinares", 38, "Dirigiendo una junta administrativa", 3, false);

        System.out.println("Veamos la información inicial de las instancias de nuestra clase Persona...");
        System.out.println("");

        String txt1 = "Nombre: " + persona1.getNombreCompleto() + "\nEdad: " + persona1.getEdad() + "\nEstado: " + persona1.getEstado() + "\n" + persona1.imprimirPuesto() + "\n" + persona1.imprimirEstadoCivil();
        String txt2 = "Nombre: " + persona2.getNombreCompleto() + "\nEdad: " + persona2.getEdad() + "\nEstado: " + persona2.getEstado() + "\n" + persona2.imprimirPuesto() + "\n" + persona2.imprimirEstadoCivil();
        String txt3 = "Nombre: " + persona3.getNombreCompleto() + "\nEdad: " + persona3.getEdad() + "\nEstado: " + persona3.getEstado() + "\n" + persona3.imprimirPuesto() + "\n" + persona3.imprimirEstadoCivil();
        String txt4 = "Nombre: " + persona4.getNombreCompleto() + "\nEdad: " + persona4.getEdad() + "\nEstado: " + persona4.getEstado() + "\n" + persona4.imprimirPuesto() + "\n" + persona4.imprimirEstadoCivil();

        System.out.println(txt1);
        System.out.println("");
        System.out.println(txt2);
        System.out.println("");
        System.out.println(txt3);
        System.out.println("");
        System.out.println(txt4);
        System.out.println("");

        System.out.println("");
        System.out.println("Isabella terminó su parcial y se ha graduado, ahora se va a dedicar a la docencia, hay que actualizar su información...");
        persona1.ascenderPuesto();
        persona1.setEstado("En su cena de graduación");

        System.out.println("");
        System.out.println("Parece que Pedro está de cumpleaños...");
        System.out.println("Edad anterior: " + persona2.getEdad());
        persona2.celebrarCumpleaños();
        persona2.setEstado("Celebrando su cumpleaños");
        System.out.println("Edad actual: " + persona2.getEdad());

        System.out.println("");
        System.out.println("José y Paola se han casado, cambiemos su información desactualizada...");
        persona3.casarse();
        persona3.setEstado("En su luna de miel");
        persona4.casarse();
        persona4.setEstado("En su luna de miel");
        System.out.println("Ahora sí, " + persona3.getNombreCompleto() + " " + persona3.imprimirEstadoCivil() +  " y " + persona4.getNombreCompleto() + " " + persona4.imprimirEstadoCivil());

        System.out.println("");
        System.out.println("Pedro Pérez ha sido ascendido, actualizemos su información...");
        persona2.ascenderPuesto();

        System.out.println("");
        System.out.println("Ahora veamos la información actualizada de nuestras personas");
        System.out.println("");
        String txt5 = "Nombre: " + persona1.getNombreCompleto() + "\nEdad: " + persona1.getEdad() + "\nEstado: " + persona1.getEstado() + "\n" + persona1.imprimirPuesto() + "\n" + persona1.imprimirEstadoCivil();
        String txt6 = "Nombre: " + persona2.getNombreCompleto() + "\nEdad: " + persona2.getEdad() + "\nEstado: " + persona2.getEstado() + "\n" + persona2.imprimirPuesto() + "\n" + persona2.imprimirEstadoCivil();
        String txt7 = "Nombre: " + persona3.getNombreCompleto() + "\nEdad: " + persona3.getEdad() + "\nEstado: " + persona3.getEstado() + "\n" + persona3.imprimirPuesto() + "\n" + persona3.imprimirEstadoCivil();
        String txt8 = "Nombre: " + persona4.getNombreCompleto() + "\nEdad: " + persona4.getEdad() + "\nEstado: " + persona4.getEstado() + "\n" + persona4.imprimirPuesto() + "\n" + persona4.imprimirEstadoCivil();

        System.out.println(txt5);
        System.out.println("");
        System.out.println(txt6);
        System.out.println("");
        System.out.println(txt7);
        System.out.println("");
        System.out.println(txt8);
        System.out.println("");

    }
}
