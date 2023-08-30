import java.util.*;


public class Practica2{
	
public static void main(String args[]){
	//Declaracion de arreglo
	Alumno al[] = new Alumno[capturaEntrada.capturarEntero("Introduce numero de alumnos")];
	
	//Inicializar arreglo y asignar valores
	for(int i=0; i<al.length; i++){
		System.out.println("\n Ingresar datos del alumno " + "[" + i + "]:");
		al[i] =  new Alumno(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarEntero("Introduce matricula"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce promedio"));
		System.out.println();
	}
	
	//Imprimir datos de alumnos
	for(int j=0; j<al.length; j++){
		System.out.println("\n\n Datos del alumno " + "[" + j + "]:");
		System.out.println("Nombre:" + al[j].getNombre());
		System.out.println("Matricula:" + al[j].getMatricula());
		System.out.println("Correo:" + al[j].getCorreo());
		System.out.println("Telefono:" + al[j].getTelefono());
		System.out.println("Promedio:" + al[j].getPromedio());
		
	}
	
}
}

//Entidad Alumno
class Alumno{
	String nombre;
	int matricula;
	String correo;
	String telefono;
	double promedio;

//Metodo constructor con parametros
	public Alumno(String nombre, int matricula, String correo, String telefono, double promedio){
		setNombre(nombre);
		setMatricula(matricula);
		setCorreo(correo);
		setTelefono(telefono);
		setPromedio(promedio);
	}


//Metodos set y get
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	public int getMatricula(){
		return matricula;
	}
	
	public void setCorreo(String correo){
		this.correo = correo;
	}
	public String getCorreo(){
		return correo;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}
	public String getTelefono(){
		return telefono;
	}
  
  public void setPromedio(double promedio){
		this.promedio = promedio;
	}
	public double getPromedio(){
		return promedio;
	}
}


//Metodo de clase
class capturaEntrada{
	
	public static int capturarEntero(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+":");
		return (sc.nextInt());
	}
	
	public static float capturarFlotante(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+":");
		return (sc.nextFloat());
	}
	
	public static double capturarDoble(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+":");
		return (sc.nextDouble());
	}
	
	public static String capturarCadena(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+":");
		return (sc.nextLine());
	}
}

