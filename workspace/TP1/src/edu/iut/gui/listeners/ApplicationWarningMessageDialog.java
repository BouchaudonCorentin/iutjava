package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationWarningMessageDialog extends
		AbstractApplicationMessageDialog {

	protected void showMessage(String level, String message) {
		System.out.println("WARNING");
	}

}
