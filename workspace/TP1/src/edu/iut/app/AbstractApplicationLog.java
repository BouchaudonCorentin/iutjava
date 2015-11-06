package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	/** TP1 : Tableau au sens des collections **/
	protected ArrayList <IApplicationLogListener> listeners;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList();
	}
	
    /** TP1 : Fonction venant de l'interface par héritage */
	public void setMessage(String message){
		this.message=message;
	}
	
	public void addListeners(IApplicationLogListener listener){
		listeners.add(listener);
	}
	
	public ArrayList<IApplicationLogListener> getApplicationLogListeners(){
		return listeners;
	}

	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
