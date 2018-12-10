package emsamablajecomputadoras.creacional;

public abstract class computadorasBuilder {
	//Declaraci�n de referencia del producto a construir
	protected Computador pc;
	
	//Declaraci�n del m�todo que recuperar� el objeto
	public Computador getComputador() {
		return pc;
	}
	
	//M�todos abstractos
	public abstract void DefinirComputador();
	public abstract void crearMainboard();
	public abstract void definirSO();

}
