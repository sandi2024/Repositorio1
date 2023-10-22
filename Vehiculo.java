

public class Vehiculo{

	String modelo;
	String color;
	Motor motor;
	Transmision transmision;
	Neumatico neumaticos [];

	public Vehiculo(String modelo, String color, Motor motor, Transmision transmision, int num){

		setModelo(modelo);
		setColor(color);
		setMotor(motor);
		setTransmision(transmision);
		neumaticos = new Neumatico[num];

	}


	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getModelo(){
		return modelo;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}


	public void setMotor(Motor motor){
		this.motor = motor;
	}

	public void setTransmision(Transmision transmision){
		this.transmision = transmision;
	}


	public void agregarNeumatico(){

		for(int i=0; i<neumaticos.length; i++){
		    System.out.println("\n Ingresar datos de neumatico " + "[" + i + "]:");
		    neumaticos[i] =  new Neumatico(capturaEntrada.capturarEntero("Introduce ancho nominal"), capturaEntrada.capturarEntero("Introduce altura perfil"), capturaEntrada.capturarEntero("Introdece diametro de rin"));
		   
	    }
	}
	

	
 

}





