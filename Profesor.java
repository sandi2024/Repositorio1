

public class Profesor extends Persona{
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