package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationInfoMessageDialog extends
		AbstractApplicationMessageDialog {

	protected void showMessage(String level, String message) {
		System.out.println("INFO");
	}
}
