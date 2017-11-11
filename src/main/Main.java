package main;

import java.sql.SQLException;

import view.layout.MainJFrame;

/**
 *
 * @author EnTeRs
 */
public class Main {
	
	public static void main(String[] args) throws SQLException {
		new MainJFrame().createAndShowGUI();
	}		
}
