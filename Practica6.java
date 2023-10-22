import java.util.Scanner;

public class Practica6{
	public static void main(String args[]){
		
            Grupo grupo = new Grupo(capturaEntrada.capturarCadena("Introduce ID_grupo."), new Materia(capturaEntrada.capturarCadena("Introduce clave"), capturaEntrada.capturarCadena("Introduce Nombre de materia")), new Profesor(capturaEntrada.capturarCadena("Introduce nombre de profesor"), capturaEntrada.capturarCadena("Introduce correo")), capturaEntrada.capturarEntero("Introduce numero de alumnos"));


        System.out.println("\nDatos de grupo");
        System.out.println("ID_grupo: "+ grupo.getId());
		System.out.println("Clave: "+ grupo.materia.getClave());
		System.out.println("Nombre de materia: "+ grupo.materia.getNombre());
		System.out.println();

           //Imprimir datos de profesor
		System.out.println("Nombre de profesor: "+ grupo.profesor.getNombre());
		System.out.println("correo: "+ grupo.profesor.getCorreo() + "@uabc.edu.mx");
		
		 //Imprimir datos de alumnos
	    for(int j=0; j<grupo.alumnos.length; j++){
		    System.out.println("\n\n Datos de los alumnos " + "[" + j + "]:");
		    System.out.println("Nombre:" + grupo.alumnos[j].getNombre());
		    System.out.println("Correo:" + grupo.alumnos[j].getCorreo() + "@uabc.edu.mx");
	    }
 
            System.out.println();

			
		


    }
}


class Grupo{

	String id;
	Materia materia;
	Alumno alumnos[];
	Profesor profesor;
	
	public Grupo(String id, Materia materia, Profesor profesor, int num){
		setId(id);
		setMateria(materia);
		setProfesor(profesor);
		setAlumno(num);


	}
    
    public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
   
	public void setMateria(Materia materia){
		this.materia = materia;
	}


	public void setProfesor(Profesor profesor){
		this.profesor = profesor;
	}


	public void setAlumno(int num){
		alumnos = new Alumno[num];
		
	  	for(int i=0; i<alumnos.length; i++){
		    System.out.println("\n Ingresar datos del alumno " + "[" + i + "]:");
		    alumnos[i] =  new Alumno(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce correo"));
		    System.out.println();
	    }
	}

	
}

class Materia{
	String clave;
	String nombre;

	public Materia(String clave, String nombre){
		setClave(clave);
		setNombre(nombre);
		
	}
	
	//Metodos set y get
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setClave(String clave){
		this.clave = clave;
	}
	public String getClave(){
		return clave;
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
	
	public Alumno(String nombre, String correo){
		setNombre(nombre);
		setCorreo(correo);
	}
    
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


class Profesor extends Persona{
	String numEmpleado;
	double sueldo;
	
	public Profesor(String nombre, String correo){
		setNombre(nombre);
		setCorreo(correo);
	}
	
	public Profesor(String nombre, String numEmpleado, String correo, String telefono, double sueldo){
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
