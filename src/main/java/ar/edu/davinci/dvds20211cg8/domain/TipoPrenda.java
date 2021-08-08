package ar.edu.davinci.dvds20211cg8.domain;

public enum TipoPrenda {
	SACO("Saco"),
	PANTALON("Pantalón"),
	CAMISA("Camisa"),
	CAMPERA("Campera"),
	TAPADO("Tapado"),
	CHAQUETA("Chaqueta"),
	MEDIA("Media"),
	BUFANDA("Bufanda");
	
	private String descripcion;
	
	private TipoPrenda(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

}