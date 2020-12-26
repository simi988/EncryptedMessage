import java.io.IOException;

public class Controller {
	private Cezar cezar;
	private UI ui;

	
	public void start() {
		 cezar=new Cezar();
		 ui=new UI(cezar);
		 ui.startApp();
	}
}
