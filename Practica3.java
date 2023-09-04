
import java.util.Scanner;

public class Practica3{
	public static void main(String args[]){
		//
		System.out.println("\n\nIngresar datos de profesor");
		Profesor prof1 =  new Profesor(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de empleado"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce sueldo"));
	    System.out.println();
		Alumno al[] = new Alumno[capturaEntrada.capturarEntero("Introduce numero de alumnos")];
		
		//Inicializar arreglo y asignar valores
	    for(int i=0; i<al.length; i++){
		    System.out.println("\n Ingresar datos del alumno " + "[" + i + "]:");
		    al[i] =  new Alumno(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce matricula"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce promedio"));
		    System.out.println();
	    }
		
        //Imprimir datos de profesor
		System.out.println("\nDatos de profesor");
		System.out.println("Nombre profesor: "+ prof1.getNombre());
		System.out.println("Num. de empleado: "+ prof1.getnumEmpleado());
		System.out.println("correo: "+ prof1.getCorreo());
		System.out.println("Sueldo: "+ prof1.getSueldo());
		
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


class Persona{
	String nombre;
	String correo;
	String telefono;
	
	//Metodos set y get
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
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

}


class Alumno extends Persona{
	String matricula;
	double promedio;
	
	//Metodo constructor
	public Alumno(String nombre, String matricula, String correo, String telefono, double promedio){
		setNombre(nombre);
		setMatricula(matricula);
		setCorreo(correo);
		setTelefono(telefono);
		setPromedio(promedio);
	}
	
	//Metodos set y get
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public String getMatricula(){
		return matricula;
	}
	
	public void setPromedio(double promedio){
		this.promedio = promedio;
	}
	public double getPromedio(){
		return promedio;
	}
}


class Profesor extends Persona{
	String numEmpleado;
	double sueldo;
	
	//Metodo constructor
	public Profesor(String nombre, String numEmpleado, String correo, String telefono, double sueldo){
		setNombre(nombre);
		setnumEmpleado(numEmpleado);
		setCorreo(correo);
		setTelefono(telefono);
		setSueldo(sueldo);
	}
	
	//Metodos set y get
	public void setnumEmpleado(String numEmpleado){
		this.numEmpleado = numEmpleado;
	}
	public String getnumEmpleado(){
		return numEmpleado;
	}
	
	public void setSueldo(double sueldo){
		this.sueldo = sueldo;
	}
	public double getSueldo(){
		return sueldo;
	}
}

//Metodo de clase
class capturaEntrada{
	
	public static int capturarEntero(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+":");
		return (sc.nextInt());
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
