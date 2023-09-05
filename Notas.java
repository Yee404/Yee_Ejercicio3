public class Notas{
    private int calificacion;
    private Examenes examen;
    private Ingreso estudiante;
    private int promedio;
    private int mediana;
    private int moda;
    private int desviacion;

    public Notas(String calificacion, Examenes examen, int promedio, int mediana, int moda, int desviacion){
        this.calificacion = calificacion;
        this.examen = examen;
        this.promedio = promedio;
        this.mediana = mediana;
        this.moda = moda;
        this.desviacion = desviacion;
    }

    public int getCalificacion(){
        return this.calificacion;
    }

    public int getPromedio(){
        int n = this.examenes.size();
        
        int suma = 0;

        for (Curso c : this.examenes) {
            suma += c.getCalificacion();
        }

        if (n == 0) { 
            n = 1;
        }
        return (suma / n);
    }

    public int getMediana(){
        
    }
}