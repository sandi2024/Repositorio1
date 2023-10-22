

public class Neumatico{

	int ancho;
	int perfil;
	int diametroRin;
	
	public Neumatico(int ancho, int perfil, int diametroRin){
		setAncho(ancho);
		setPerfil(perfil);
		setDiametroRin(diametroRin);
		
	}
	
	
	
	public void setAncho(int ancho){
		this.ancho = ancho;
	}
	public int getAncho(){
		return ancho;
	}
	
	public void setDiametroRin(int diametroRin){
		this.diametroRin = diametroRin;
	}
	public int getDiametroRin(){
		return diametroRin;
	}

	public void setPerfil(int perfil){
		this.perfil = perfil;
	}
	public int getPerfil(){
		return perfil;
	}
}