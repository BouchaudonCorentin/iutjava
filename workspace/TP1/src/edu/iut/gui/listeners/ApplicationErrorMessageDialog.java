package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends AbstractApplicationMessageDialog {

	protected void showMessage(String level, String message) {
		System.out.println("ERREUR");
	}

}
