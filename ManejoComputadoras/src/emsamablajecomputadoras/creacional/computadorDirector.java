package emsamablajecomputadoras.creacional;

public class computadorDirector {
	
	private computadorasBuilder builder;
	
	public computadorDirector(computadorasBuilder builder) {
		this.builder = builder;
	}
	
	public  void construirPC() {
		builder.DefinirComputador();
		builder.crearMainboard();
		builder.definirSO();
	}
	
	public Computador getPC() {
		return builder.getComputador();
	}

}
