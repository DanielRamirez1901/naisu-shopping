package Thread;

import javafx.application.Platform;
import model.ProgressBar;
import ui.NaisuShoppingUI;

public class ProgressBarThread extends Thread{
	
	private ProgressBar progressbar;
	private NaisuShoppingUI naisu;
	
	public ProgressBarThread(ProgressBar progressB, NaisuShoppingUI naisuS) {
		progressbar = progressB;
		naisu = naisuS;
	}
	
	public void run() {
		while (progressbar.isActive()) {
			progressbar.advance();
			Platform.runLater(new Thread() {
				public void run() {
					naisu.updateBar();
				}
			});
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
	}
}
