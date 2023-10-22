

public class Practica7{
	public static void main(String args[]){
		
		Grupo grupo[] = new Grupo[capturaEntrada.capturarEntero("Introduce numero de Grupos a capturar")];
    
        // Capturar datos
        for(int i=0; i<grupo.length; i++){
		    System.out.println("\n Ingresar datos de grupo " + "[" + i + "]:");
            grupo[i] = new Grupo(capturaEntrada.capturarCadena("Introduce ID_grupo"), new Materia(capturaEntrada.capturarCadena("Introduce clave"), capturaEntrada.capturarCadena("Introduce Nombre de materia")), new Profesor(capturaEntrada.capturarCadena("Introduce nombre de profesor"), capturaEntrada.capturarCadena("Introduce correo")), capturaEntrada.capturarEntero("Introduce numero de alumnos"));
		    System.out.println();
	    }


        // Imprimir datos
	    for(int j=0; j<grupo.length; j++){          
            System.out.println("\n\n Datos de grupo " + "[" + j + "]:");
            System.out.println("ID_grupo: "+ grupo[j].getId());
		    System.out.println("Clave: "+ grupo[j].materia.getClave());
		    System.out.println("Nombre de materia: "+ grupo[j].materia.getNombre());

		    System.out.println("Nombre de profesor: "+ grupo[j].profesor.getNombre());
		    System.out.println("correo: "+ grupo[j].profesor.getCorreo() + "@uabc.edu.mx");


	        System.out.println("\n Lista de alumnos:");

	        for(int k=0; k<grupo[j].alumnos.length; k++){
//	        	System.out.println("\n Alumno " + "[" + k + "]:");
		        System.out.println("Nombre:" + grupo[j].alumnos[k].getNombre());
//		        System.out.println("Correo:" + grupo[j].alumnos[k].getCorreo() + "@uabc.edu.mx");
	        }

	    }
	
 
        System.out.println();

			

    }
}



