public class Principal
{
    public static void main(String[] args)
    {
        Pelicula miPelicula= new Pelicula();
        miPelicula.nombre="Encanto";
        miPelicula.fechaDeLanzmiento=2021;
        miPelicula.duracionEnMinutos=120;

        miPelicula.muestraIchaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.printf("La Evaluacion es %f \n\n",miPelicula.sumaDeLasEvaluaciones);
        System.out.printf("Total de las evaluaciones %f\n\n,", miPelicula.totalDeLasEvaluaciones);
        System.out.printf("%f\n\n",miPelicula.calculaMedia());

//        System.out.printf("Mi pelicula es %s%n", miPelicula.nombre);
//        System.out.printf("Su fecha de lanzamiento es: %d%n", miPelicula.fechaDeLanzmiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre="Matrix";
        otraPelicula.fechaDeLanzmiento=1998;

        otraPelicula.muestraIchaTecnica();

//        System.out.printf("Mi pelicula es %s%n", otraPelicula.nombre);
//        System.out.printf("Su fecha de lanzamiento es: %d%n", otraPelicula.fechaDeLanzmiento);






    }
}
