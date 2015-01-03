package com.github.dumpram.terminal.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

/**
 * GUI class for MicroTerminal project.
 * 
 * @author Ivan Pavic
 *
 */
public class MicroTerminalGUI extends JFrame {

	/**
	 * Default serial version.
	 */
	private static final long serialVersionUID = 1L;

	private static final int GUI_WIDTH = 500;

	private static final int GUI_HEIGHT = 500;

	/**
	 * Constructor delegates job of initializing GUI and configuring
	 * communication.
	 */
	public MicroTerminalGUI() {
		initGUI();
		initCom();
	}

	private void initCom() {
		// TODO Auto-generated method stub

	}

	/**
	 * Initializes GUI.
	 */
	private void initGUI() {
		initFrame();
		initLayout();
		initLanguage();
		initMenuBar();
		initToolBar();
		initComSpace();
	}

	private void initComSpace() {

	}

	private void initToolBar() {
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.LINE_START);
	}

	private void initMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
	}

	private void initLanguage() {
		// TODO Auto-generated method stub

	}

	private void initLayout() {
		setLayout(new BorderLayout());
	}

	private void initFrame() {
		setTitle("µTerminal");
		setSize(GUI_WIDTH, GUI_HEIGHT);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	/**
	 * Main method starts MicroTerminal.
	 * 
	 * @param args
	 *            none provided
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MicroTerminalGUI().setVisible(true);
			}
		});
	}
}
