public class Principal
{
    public static void main(String[] args)
    {
        Pelicula miPelicula= new Pelicula();
        miPelicula.nombre="Encanto";
        miPelicula.fechaDeLanzmiento=2021;
        miPelicula.duracionEnMinutos=120;

        System.out.printf("Mi pelicula es %s%n", miPelicula.nombre);
        System.out.printf("Su fecha de lanzamiento es: %d%n", miPelicula.fechaDeLanzmiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre="Matrix";
        otraPelicula.fechaDeLanzmiento=1998;

        System.out.printf("Mi pelicula es %s%n", otraPelicula.nombre);
        System.out.printf("Su fecha de lanzamiento es: %d%n", otraPelicula.fechaDeLanzmiento);






    }
}
