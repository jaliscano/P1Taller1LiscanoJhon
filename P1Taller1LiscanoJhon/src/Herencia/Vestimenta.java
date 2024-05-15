package Herencia;

public abstract class Vestimenta {
	protected String tipoPrenda;

	public Vestimenta (String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	public String GetTipoPrenda() {
		return tipoPrenda;
	}
}