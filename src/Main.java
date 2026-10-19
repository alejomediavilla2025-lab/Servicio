import servicio.Servicio;

public class Main {
    public static void main(String[] args) {

        //Crear un objeto de la clase Servicio
        Servicio servicio1 = new Servicio();
        servicio1.setNombre("Servicio 1");
        servicio1.setPuerto(8080);
        servicio1.setActivo(true);
        servicio1.setCantidadPeticiones(0);

        //Imprimir el objeto
        System.out.println("\n=== DATOS DEL SERVICIO 1 ===");

        System.out.println("Nombre: " + servicio1.getNombre());
        System.out.println("Puerto: " + servicio1.getPuerto());
        System.out.println("Activo: " + servicio1.isActivo());
        System.out.println("Cantidad de peticiones: " + servicio1.getCantidadPeticiones());

        //Iniciar el servicio
        System.out.println("\n=== INICIAR SERVICIO ===");
        servicio1.iniciar();
        System.out.println("Activo: " + servicio1.isActivo());

        //Registrar peticiones
        System.out.println("\n=== REGISTRAR PETICIONES ===");
        servicio1.registrarPeticiones();
        servicio1.registrarPeticiones();
        servicio1.registrarPeticiones();
        System.out.println("Cantidad de peticiones: " + servicio1.getCantidadPeticiones());

        //Detener el servicio
        System.out.println("\n=== DETENER SERVICIO ===");
        servicio1.detener();
        System.out.println("Activo: " + servicio1.isActivo());

        // Intentar registrar una peticion con servicio detenido
        servicio1.registrarPeticiones();

        System.out.println("Cantidad de peticiones: " + servicio1.getCantidadPeticiones());

        // Validar el nombre del Servicio
        System.out.println("\n=== VALIDACION DE NOMBRE ===");
        servicio1.setNombre("Servidor Principal");
        servicio1.setNombre("");
        System.out.println("Nombre despues de validar: " + servicio1.getNombre());

        // Validar el puerto
        System.out.println("\n=== VALIDACION DEL PUERTO ===");
        servicio1.setPuerto(8080);
        servicio1.setPuerto(-1);

        System.out.println("Puerto despues de validar: " + servicio1.getPuerto());

        // Validar la cantidad de peticiones
        System.out.println("\n=== VALIDACION DE PETICIONES ===");

        servicio1.setCantidadPeticiones(100);
        System.out.println("Cantidad de peticiones despues de validar: " + servicio1.getCantidadPeticiones());



    }
}