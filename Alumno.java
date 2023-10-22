

public class Alumno extends Persona{
	String matricula;
	double promedio;

	public Alumno(String nombre){
		setNombre(nombre);
	}
	
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