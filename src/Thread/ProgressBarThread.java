package Thread;

import javafx.application.Platform;
import model.LoadingBar;
import ui.NaisuShoppingUI;

public class ProgressBarThread extends Thread{
	
	private LoadingBar loadBar;
	private NaisuShoppingUI naisu;
	
	public ProgressBarThread(LoadingBar loadB, NaisuShoppingUI naisuS) {
		loadBar = loadB;
		naisu = naisuS;
	}
	
	public void run() {
		while (loadBar.isActive()) {
			loadBar.advance();
			Platform.runLater(new Thread() {
				public void run() {
					naisu.updateBar();
				}
			});
			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
	}
}
