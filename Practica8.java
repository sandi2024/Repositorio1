

public class Practica8{
	public static void main(String args[]){

		Vehiculo coche = new Vehiculo(capturaEntrada.capturarCadena("Introduce modelo"), capturaEntrada.capturarCadena("Introduce color"), new Motor(capturaEntrada.capturarEntero("Introduce Nº cilindros"), capturaEntrada.capturarEntero("Introduce potencia de motor")), new Transmision(capturaEntrada.capturarCadena("Introduce tipo de transmision"), capturaEntrada.capturarEntero("Introduce velocidades")), capturaEntrada.capturarEntero("Numero de neumaticos"));
		

        coche.agregarNeumatico();


        System.out.println("\n   DATOS DEL VEHICULO");
        System.out.println("Modelo: "+ coche.getModelo());
		System.out.println("Color: "+ coche.getColor());
		//Imprimir datos de MOTOR
		System.out.println("  MOTOR  \nNumero de cilindros:"+ coche.motor.getNumCilindros() + "\nPotencia (Hp):" + coche.motor.getPotencia());

         //Imprimir datos de TRANSMISION
		System.out.println("  TRANSMISION  \nTipo de transmision:"+ coche.transmision.getTipoTrans() + "\nVelocidades:" + coche.transmision.getVelocidades());
		
        //Imprimir datos de NEUMATICOS
		System.out.println("  NEUMATICOS ");
	    for(int j=0; j<coche.neumaticos.length; j++){
		    System.out.println("Neumatico " + "[" + j + "]:");
		    System.out.println("Ancho nominal: " + coche.neumaticos[j].getAncho());
		    System.out.println("Altura del perfil: " + coche.neumaticos[j].getPerfil());
		    System.out.println("Diametro de ring (pulgadas): " + coche.neumaticos[j].getDiametroRin());
	    }
 
	
        System.out.println();

			

    }
}

