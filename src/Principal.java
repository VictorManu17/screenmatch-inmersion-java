import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 4){

            String menu = """
                    ***** Bienvenido(a) a Screenmatch *****
                    Seleccione la opción de su interés:
                    1) Registrar nueva pelicula 🎟️
                    2) Registrar nueva serie 🎞️
                    3) Calcular de tiempo necesario 🕰️
                    
                    4) SALIR ➡️
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            int fechaDeLanzamiento;
            int duracionEnMinutos;
            String nombre;

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película:");
                    fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película:");
                    duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie:");
                    fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese los minutos por episodio:");
                    duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombre);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    serieUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    serieUsuario.muestraFichaTecnica();
                    break;

                case 4:
                    System.out.println("***** Saliendo del programa *****");
                    System.out.println("***** Gracias por tu tiempo *****");
                    System.out.println("******** Vuelve pronto! *********");
                    break;

                default:
                    System.out.println("Opción no valida");


            }

        }

    }

}
