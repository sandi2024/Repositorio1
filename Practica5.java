import java.util.Scanner;

public class Practica5{
	public static void main(String args[]){
		
		System.out.println("\n\nIngresar datos persona");
		Persona per1 =  new Persona(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarCadena("Introduce parentesco"), capturaEntrada.capturarEntero("Introduce num. de posicion"), capturaEntrada.capturarDoble("Introduce ingreso economico"));
	    System.out.println();

		System.out.println("\n\nIngresar datos alumno");
		PersonaEscuela al1 =  new PersonaEscuela(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de matricula"), capturaEntrada.capturarCadena("Introduce facultad"), capturaEntrada.capturarCadena("Introduce correo"), capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce promedio"));
	    System.out.println();

		System.out.println("\n\nIngresar datos empleado");
		PersonaTrabajo em1 =  new PersonaTrabajo(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de empleado"), capturaEntrada.capturarCadena("Introduce puesto"), capturaEntrada.capturarCadena("Introduce correo"), capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce sueldo"));
	    System.out.println();
		
		//Imprimir datos de PersonaCasa
		System.out.println("\n\n Datos de persona");
		System.out.println("Nombre:" + per1.getNombre());
		System.out.println("Correo:" + per1.getCorreo());
		System.out.println("Telefono:" + per1.getTelefono());
		System.out.println("Parentesco:" + per1.getParentesco());
		System.out.println("Num. de posicion:" + per1.getPosicion());
		System.out.println("Ingreso que aporta:" + per1.getIngreso());
		
		//Imprimir datos de PersonaEscuela
		System.out.println("\n\n Datos del alumno");
		System.out.println("Nombre:" + al1.getNombre());
		System.out.println("Matricula:" + al1.getMatricula());
		System.out.println("Facultad:" + al1.getFacultad());
		System.out.println("Correo:" + al1.getCorreo());
		System.out.println("Telefono:" + al1.getTelefono());
		System.out.println("Promedio:" + al1.getPromedio());
		
        //Imprimir datos de PersonaTrabajo
		System.out.println("\nDatos de empleado");
		System.out.println("Nombre: "+ em1.getNombre());
		System.out.println("Num. de empleado: "+ em1.getnumEmpleado());
		System.out.println("Puesto: "+ em1.getPuesto());
		System.out.println("correo: "+ em1.getCorreo());
		System.out.println("Telefono:" + em1.getTelefono());
		System.out.println("Sueldo: "+ em1.getSueldo());

	}

}

//Atributos de clase PersonaCasa en clase Persona.
class Persona{
	String nombre;
	String correo;
	String telefono;
	String parentesco;
	int posicion;
	double ingreso;
    //Metodos constructor
	public Persona(String nombre, String correo, String telefono, String parentesco, int posicion, double ingreso){
	    setNombre(nombre);
		setCorreo(correo);
		setTelefono(telefono);
		setParentesco(parentesco);
		setPosicion(posicion);
		setIngreso(ingreso);
	}
	
	public Persona(String nombre, String correo, String telefono){
	    setNombre(nombre);
		setCorreo(correo);
		setTelefono(telefono);
	}
	
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


	public void setParentesco(String parentesco){
		this.parentesco = parentesco;
	}
	public String getParentesco(){
		return parentesco;
	}


	public void setPosicion(int posicion){
		this.posicion = posicion;
	}
	public int getPosicion(){
		return posicion;
	}


	public void setIngreso(double ingreso){
		this.ingreso = ingreso;
	}
	public double getIngreso(){
		return ingreso;
	}

}


class PersonaEscuela extends Persona{
	String matricula;
	String facultad;
	double promedio;
	
    //Metodo constructor    
	public PersonaEscuela(String nombre, String matricula, String facultad, String correo, String telefono, double promedio){
		super(nombre, correo, telefono);
		setMatricula(matricula);
		setFacultad(facultad);
		setPromedio(promedio);
	}
	
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public String getMatricula(){
		return matricula;
	}

	public void setFacultad(String facultad){
		this.facultad = facultad;
	}
	public String getFacultad(){
		return facultad;
	}
	
	public void setPromedio(double promedio){
		this.promedio = promedio;
	}
	public double getPromedio(){
		return promedio;
	}
}


class PersonaTrabajo extends Persona{
	String numEmpleado;
	String puesto;
	double sueldo;
	
	//Metodo constructor
	public PersonaTrabajo(String nombre, String numEmpleado, String puesto, String correo, String telefono, double sueldo){
		super(nombre, correo, telefono);
		setnumEmpleado(numEmpleado);
		setPuesto(puesto);
		setSueldo(sueldo);
	}
	
	
	public void setnumEmpleado(String numEmpleado){
		this.numEmpleado = numEmpleado;
	}
	public String getnumEmpleado(){
		return numEmpleado;
	}

	public void setPuesto(String puesto){
		this.puesto = puesto;
	}
	public String getPuesto(){
		return puesto;
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
