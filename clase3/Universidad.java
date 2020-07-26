public class Universidad{
  /*atributos*/
  public String nombre;
  private String url;

  /*funcionalides*/
  /*constructor*/
  public Universidad(){
  }

  public void mostrarEstado(){

     System.out.println("nombre=" + nombre + ", url=" + url);

  }

  public void setUrl(String pUrl){

     url = pUrl;
      
  }
  
  

  public static void main(String[] args){
     //System.out.println("Bienvenido Covidiano");
     Universidad u1 = new Universidad();
     u1.nombre="Universidad Mariano Galvez";
     //u1.mostrarEstado();
     u1.setUrl("umg.edu.gt");
     u1.mostrarEstado();

     Universidad u2 = new Universidad();
     u2.nombre = "Universidad Rafael Landivar";
     u2.setUrl("url.edu.gt");
     u2.mostrarEstado();
     
  }



}