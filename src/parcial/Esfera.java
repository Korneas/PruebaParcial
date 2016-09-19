package parcial;

import processing.core.PApplet;

public class Esfera implements Comparable<Esfera>{

	private PApplet app;
	private String[] car;
	private int radio, num, stroker;
	private int r, g, b;
	private float x, y;

	public Esfera(PApplet app, String datosB) {
		this.app = app;
		variables(datosB);
	}

	public void pintar() {
		app.text(num, x, y+radio);
		app.strokeWeight(3);
		app.stroke(stroker);
		app.fill(r, g, b);
		app.ellipse(x, y, radio, radio);
	}

	@Override
	public boolean equals(Object esf) {
		if (radio == ((Esfera) esf).getRadio()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Esfera o){
		return (int) (radio-o.getRadio());
	}

	public void mover(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public boolean validar(float posX, float posY) {
		if (PApplet.dist(posX, posY, x, y) < 25) {
			return true;
		} else {
			return false;
		}
	}

	private void variables(String datos) {
		car = PApplet.split(datos, ":");
		radio = Integer.parseInt(car[0]);
		num = Integer.parseInt(car[1]);
		stroker = Integer.parseInt(car[2]);
		r = Integer.parseInt(car[3]);
		g = Integer.parseInt(car[4]);
		b = Integer.parseInt(car[5]);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getStroker() {
		return stroker;
	}

	public void setStroker(int stroker) {
		this.stroker = stroker;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	

}
