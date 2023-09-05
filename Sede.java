import java.util.ArrayList;
// solamente realiza los cálculos pertinentes para los resultados que se le
// solicitan a cada sede: máximo, mínimo y cantidad de examens realizados.

public class Sede{
    private String sede;
    private int cantidad;
    private int alta;
    private int baja;
    private ArrayList<Examenes> examenes;
    

    public Sede(String sede, int cantidad, int alta, int baja){
        this.sede = sede;
        this.cantidad = cantidad;
        this.alta = alta;
        this.baja = baja;
        this.examenes = new ArrayList<Examenes>();
    }

    public String getSede(){
        return this.sede;
    }

    public int getCantidad(){
        return this.examenes.size();
    }

    public int getAlta(){
        int mayor = examenes.get(0).getNota();
        
        // calcular el valor mayor (corregir: y si existen dos notas iguales)
        for (int i = 0; i < examenes.length; i++){
            if (examenes.get(i).getNota() > mayor){
                mayor = examenes.get(i).getNota();
            }
        }
        
        System.out.println("La nota más alta fue: " + mayor);
        return mayor;
    }

    public int getBaja(){
        int menor = examenes.get(0).getNota();
        
        // calcular el menor valor (corregir: y si existen dos notas iguales)
        for (int i = 0; i < examenes.length; i++){
            if (examenes.get(i).getNota() < menor){
                menor = examenes.get(i).getNota();
            }
        }
        
        System.out.println("La nota más baja fue: " + menor);
        return menor;
    }
}