

public class Grupo{

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
		    alumnos[i] =  new Alumno(capturaEntrada.capturarCadena("Introduce nombre"));
		   // System.out.println();
	    }
	}

	
}