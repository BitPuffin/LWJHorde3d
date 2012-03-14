package test;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL20;

public class LwjTest {
	public
	void
	start(){
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.create();
		} catch (LWJGLException e){
			e.printStackTrace();
			System.exit(0);
		}
		while (!Display.isCloseRequested()){
			Display.update();
		}
		
		Display.destroy();
	}
	
//	public static void main(String[] woot){
//		LwjTest test = new LwjTest();
//		test.start();
//	}
}
