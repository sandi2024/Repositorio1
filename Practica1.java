
class Alumno{
	String nombre;
	String matricula;
	String correo;
	String telefono;
	double promedio;

//Metodo constructor
	public Alumno(String nom, String mat, String cor, String tel, double prom){
		setNombre(nom);
		setMatricula(mat);
		setCorreo(cor);
		setTelefono(tel);
		setPromedio(prom);
	}

//Metodos set y get
	public void setNombre(String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setMatricula(String mat){
		matricula = mat;
	}
	public String getMatricula(){
		return matricula;
	}
	public void setCorreo(String cor){
		correo = cor;
	}
	public String getCorreo(){
		return correo;
	}
	
	public void setTelefono(String tel){
		telefono = tel;
	}
	public String getTelefono(){
		return telefono;
	}

	public void setPromedio(double prom){
		promedio = prom;
	}
	public double getPromedio(){
		return promedio;
	}


}



public class Practica1{
	public static void main(String args[]){

		//Asignacion de forma directa
		Alumno al1 = new Alumno("Karen Castellanos", "1274578", "karen.castellanos@uabc.edu.mx", "6634606750", 8.8);


        //Imprimir valores 
		System.out.println("Datos del alumno");
		System.out.println("Nombre:" + al1.getNombre());
		System.out.println("Matricula:" + al1.getMatricula());
		System.out.println("Correo:" + al1.getCorreo());
		System.out.println("Telefono:" + al1.getTelefono());
		System.out.println("Promedio:" + al1.getPromedio());


	}
}

