package parcial;

import processing.core.PApplet;

public class Main extends PApplet {
	
	Logica app;
	
	static public void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "Main" };
		if (passedArgs != null) {
			PApplet.main(concat(appletArgs, passedArgs));
		} else {
			PApplet.main(appletArgs);
		}
	}
	
	@Override
	public void settings(){
		size(1000,700);
	}
	
	@Override
	public void setup(){
		app = new Logica(this);
		
	}
	
	@Override
	public void draw(){
		background(0);
		app.ejecutar();
		
	}
}