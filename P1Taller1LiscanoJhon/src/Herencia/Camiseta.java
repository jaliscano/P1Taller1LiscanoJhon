package Herencia;

public class Camiseta extends Vestimenta {
	private String Color;
	private String Talla;
	private String TipoCamiseta;
	public Camiseta(String tipoPrenda , String Color, String Talla, String TipoCamiseta) {
		super(tipoPrenda);
		this.Color = Color;
		this.Talla = Talla;
		this.TipoCamiseta = TipoCamiseta;
	}
	public void MostrarDatos (){
		System.out.println("Prenda 1. "+ tipoPrenda+
				"\nColor : "+Color+
				"\nTalla : "+Talla+
				"\nTipoCamiseta: "+TipoCamiseta);
	}
}
