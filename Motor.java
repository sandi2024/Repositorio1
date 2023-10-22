

public class Motor{

	int numCilindros;
	int potencia;
	
	public Motor(int numCilindros, int potencia){
		setNumCilindros(numCilindros);
		setPotencia(potencia);
	}
	
	
	
	public void setNumCilindros(int numCilindros){
		this.numCilindros = numCilindros;
	}
	public int getNumCilindros(){
		return numCilindros;
	}
	
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public int getPotencia(){
		return potencia;
	}
}