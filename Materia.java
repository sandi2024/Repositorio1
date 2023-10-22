

public class Materia{
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