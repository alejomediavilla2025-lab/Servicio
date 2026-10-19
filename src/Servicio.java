public class Servicio {

    public class Servicio {
        //Declaracion de variables de la clase Servicio
        private String nombre;
        private int puerto;
        boolean activo;
        private int cantidadPeticiones;

        //Getters

        public String getNombre() {
            return nombre;
        }

        public int getPuerto() {
            return puerto;
        }

        public boolean isActivo() {
            return activo;
        }

        public int getCantidadPeticiones() {
            return cantidadPeticiones;
        }

        //setters

        // El nombre no puede estar vacio
        public void setNombre(String nombre) {
            if (nombre != null && !nombre.trim().isEmpty()) {
                this.nombre = nombre;
            }
        }

        //El puerto debe ser mayor a 0
        public void setPuerto(int puerto) {
            if (puerto >= 0) {
                this.puerto = puerto;
            }
        }

        // Este atributo represeneta si el servicio esta activo o no
        public void setActivo(boolean activo) {
            this.activo = activo;
        }

        //El numero de peticiones es un numero entero positivo
        public void setCantidadPeticiones(int cantidadPeticiones) {
            if (cantidadPeticiones >= 0)
                this.cantidadPeticiones = cantidadPeticiones;
        }

        //Metodos iniciar detener y registrar peticiones

        //Cambia activo a true
        public void iniciar(){
            this.activo = true;
        }
        //Cambia activo a false
        public void detener(){
            this.activo = false;
        }
        //Suma una peticion solo si el sistema esta activo, si no lo esta no suma la peticion
        public void registrarPeticiones(){
            if (this.activo) {
                this.cantidadPeticiones++;
            }
        }

    }
}
