package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends computadorasBuilder{

	@Override
	public void DefinirComputador() {
		pc = new Computador();
		pc.setMarca("Asus");
		pc.setModelo("Zenbook");
		pc.setRam(16);
		pc.setAlmacenamiento(500);
		pc.setCoolerExterno(true);
		
	}

	@Override
	public void crearMainboard() {
		pc.getPlaca().setModelo("Prime");
		pc.getPlaca().setNumeracion("Z370");
		
	}

	@Override
	public void definirSO() {
		pc.getOs().setArquitectura(64);
		pc.getOs().setNombre("Windows");
		pc.getOs().setVersion("10 Home");
		
	}

}
