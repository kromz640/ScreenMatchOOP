public class Pelicula
{
    String nombre;
    int fechaDeLanzmiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeLasEvaluaciones;

    void muestraIchaTecnica()
    {
        System.out.printf("El nombre de la pelicula es %s%n", nombre);
        System.out.printf("Su fecha de lanzamiento es: %d%n", fechaDeLanzmiento);
        System.out.printf("Duracion en minutos %d%n",duracionEnMinutos);

    }

    void evalua(double nota)
    {
        sumaDeLasEvaluaciones+=nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia()
    {
        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
    }
}

