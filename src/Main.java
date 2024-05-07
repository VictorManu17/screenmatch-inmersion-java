import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java!");
        //System.out.println("Película Matrix");
        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio.
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("¿Incluye en el plan básico?: " + incluidoEnPlanBasico);

        double mediaEvaluacion = (4.5+4.8+3)/3;
        System.out.println("Media de su evaluación: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        int i = 0;
        while (i < 3){

            Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Ingrese la nota que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            i++;

        }

        System.out.println("La media de la pelicula " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}