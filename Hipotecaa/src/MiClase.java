
	

	public MiClase(int valorInicial) {
		this.acumulado = valorInicial;
		private int acumulado;
	}

	public int getAcumulado() {
		return resultado;
	}

	public void setAcumulado(int valor) {
		this.acumulado = valor;
	}
	
	public void incrementa() {
		this.acumulado++;
	}
	
	public void decrementa() {
		this.acumulado--;
	}

	public void suma(int valor) {
		this.acumulado += valor;
	}
	
	public void resta(int valor) {
		suma(-valor);
	}
	
	public int sumaDevuelve(int valor) {
		suma(valor);
		return getAcumulado();
	}
	
	public int restaDevuelve(int valor) {
		return sumaDevuelve(-valor);
	}	
}
