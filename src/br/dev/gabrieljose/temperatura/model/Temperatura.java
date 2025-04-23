package br.dev.gabrieljose.temperatura.model;

public class Temperatura {
	private double celsius = 0;
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	public double converterParaFahreinhet() {
		double fahreinhet = (celsius * 1.8) + 32;
		return fahreinhet;
	}
}