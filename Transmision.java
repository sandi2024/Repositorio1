

public class Transmision{
	
	String tipoTrans;
	int velocidades;
	
	public Transmision(String tipoTrans, int velocidades){
		setTipoTrans(tipoTrans);
		setVelocidades(velocidades);
	}
	
	
	
	public void setTipoTrans(String tipoTrans){
		this.tipoTrans = tipoTrans;
	}
	public String getTipoTrans(){
		return 	tipoTrans;
	}
	
	public void setVelocidades(int volocidades){
		this.velocidades = velocidades;
	}
	public int getVelocidades(){
		return velocidades;
	}
}