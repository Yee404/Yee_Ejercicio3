public class Ingreso{
  private String nombre;
  private String apellido;
  private int carnet;
  private String fecha;
  private String correo;
  

  // getters
  public Usuario(String nombre, String apellido, int carnet, String fecha, String correo){
    this.nombre = nombre;
    this.apellido = apellido;
    this.carnet = carnet;
    this.fecha = fecha;
    this.correo = correo;
  }

  public String getNombre(){
    return this.nombre;
  }

  public String getApellido(){
    return this.apellido;
  }

  public int getCarnet(){
    return this.carnet;
  }

  public String getFecha(){
    return this.fecha;
  }

  public String getCorreo(){
    return this.correo;
  }



}