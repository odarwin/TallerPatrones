package emsamablajecomputadoras.creacional;

public abstract class computadorasBuilder {
	//Declaración de referencia del producto a construir
	protected Computador pc;
	
	//Declaración del método que recuperará el objeto
	public Computador getComputador() {
		return pc;
	}
	
	//Métodos abstractos
	public abstract void DefinirComputador();
	public abstract void crearMainboard();
	public abstract void definirSO();

}
