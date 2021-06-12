package model;

import java.io.Serializable;

public class LoadingBar implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int MAXSYZE = 212;
	private int progressLevel;
	private boolean active;
	
	
	public LoadingBar() {
		progressLevel = 0;
		active = true;
	}
	
	
	public int getProgressLevel() {
		return progressLevel;
	}
	

	public void advance() {
		if(progressLevel>=MAXSYZE) {
			active = false;
		}else {			
			progressLevel++;
		}
	}
	
	
	public void setActive(boolean act) {
		active = act;
	}
	
	public boolean isActive() {
		return active;
	}

}
