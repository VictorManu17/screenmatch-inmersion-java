package modelo;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnPlanBasico;
    private int tiempoDeDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }

    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("********** FICHA TÉCNICA **********");
        System.out.println("Nombre del título: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos.");
        System.out.println("***********************************");
    }
}
