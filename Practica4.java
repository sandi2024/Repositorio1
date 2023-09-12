import java.util.Scanner;

public class Practica4{
	public static void main(String args[]){
		
		System.out.println("\n\nIngresar datos (alumno)");
		Alumno al1 =  new Alumno(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de matricula"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce promedio"));
	    System.out.println();
		System.out.println("\n\nIngresar datos (empleo)");
		Empleo em1 =  new Empleo(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de empleado"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce sueldo"));
	    System.out.println();
		System.out.println("\n\nIngresar datos (casa)");
		Casa ca1 =  new Casa(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarCadena("Introduce habitos"), capturaEntrada.capturarCadena("Introduce hobies"));
	    System.out.println();
		
		
		//Imprimir datos de alumno
		System.out.println("\n\n Datos del alumno");
		System.out.println("Nombre:" + al1.getNombre());
		System.out.println("Matricula:" + al1.getMatricula());
		System.out.println("Correo:" + al1.getCorreo());
		System.out.println("Telefono:" + al1.getTelefono());
		System.out.println("Promedio:" + al1.getPromedio());
		
        //Imprimir datos de Empleado
		System.out.println("\nDatos de empleado");
		System.out.println("Nombre profesor: "+ em1.getNombre());
		System.out.println("Num. de empleado: "+ em1.getnumEmpleado());
		System.out.println("correo: "+ em1.getCorreo());
		System.out.println("Sueldo: "+ em1.getSueldo());
		
		//Imprimir datos de casa
		System.out.println("\n\n Datos de casa");
		System.out.println("Nombre:" + ca1.getNombre());
		System.out.println("Correo:" + ca1.getCorreo());
		System.out.println("Telefono:" + ca1.getTelefono());
		System.out.println("Habitos:" + ca1.getHabitos());
		System.out.println("Hobies:" + ca1.getHobies());
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
	

	public Alumno(String nombre, String matricula, String correo, String telefono, double promedio){
		setNombre(nombre);
		setMatricula(matricula);
		setCorreo(correo);
		setTelefono(telefono);
		setPromedio(promedio);
	}
	
	
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


class Empleo extends Persona{
	String numEmpleado;
	double sueldo;
	
	
	public Empleo(String nombre, String numEmpleado, String correo, String telefono, double sueldo){
		setNombre(nombre);
		setnumEmpleado(numEmpleado);
		setCorreo(correo);
		setTelefono(telefono);
		setSueldo(sueldo);
	}
	
	
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

class Casa extends Persona{
	String habitos;
	String hobies;
	
	
	public Casa(String nombre, String numEmpleado, String correo, String habitos, String hobies){
		setNombre(nombre);
		setCorreo(correo);
		setTelefono(telefono);
		setHabitos(habitos);
		setHobies(hobies);
	}
	
	
	public void setHabitos(String habitos){
		this.habitos = habitos;
	}
	public String getHabitos(){
		return habitos;
	}
	
	public void setHobies(String hobies){
		this.hobies = hobies;
	}
	public String getHobies(){
		return hobies;
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
