package prueba;

public class Bisiesto {
	private int anho;
	
	public Bisiesto()
	{
		
	}
	
	public Bisiesto(int anho)
	{
		this.anho = anho;
	}
	
	public int getAnho()
	{
		return anho;
	}
	
	public void setAnho(int anho)
	{
		this.anho = anho;
	}
	
	public boolean esAnhoBisiesto() {
        boolean resp = false;
        if (this.anho % 4 == 0
                        && (this.anho % 100 != 0 || this.anho % 400 == 0)) {
                resp = true;
        } else {
                resp = false;
        }
        return resp;
}
}
