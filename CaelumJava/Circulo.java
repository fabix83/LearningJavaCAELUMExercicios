
public class Circulo implements AreaCalculavel {

	int raio;
	
	public Circulo(int raio) {
		super();
		this.raio = raio;
	}
	public int getRaio(){
		return this.raio;
	}
	@Override
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}
}
