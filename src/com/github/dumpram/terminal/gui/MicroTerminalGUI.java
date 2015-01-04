package com.github.dumpram.terminal.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
		add(toolBar, BorderLayout.PAGE_START);
	}

	private void initMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu();
		JMenu editMenu = new JMenu();
		JMenu helpMenu = new JMenu();
		JMenu optionsMenu = new JMenu();

		/* File menu items */
		JMenuItem newItem = new JMenuItem();
		JMenuItem openItem = new JMenuItem();
		JMenuItem disconnectItem = new JMenuItem();
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(disconnectItem);

		/* Edit menu items */
		JMenuItem setupItem = new JMenuItem();
		editMenu.add(setupItem);

		/* Options menu items */
		JMenuItem fontItem = new JMenuItem();
		JMenuItem languageItem = new JMenuItem();
		optionsMenu.add(fontItem);
		optionsMenu.add(languageItem);

		/* Help menu items */
		JMenuItem helpContentsItem = new JMenuItem();
		JMenuItem aboutItem = new JMenuItem();
		helpMenu.add(helpContentsItem);
		helpMenu.add(aboutItem);

		/* Adding menus in containers */
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(optionsMenu);
		menuBar.add(helpMenu);
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
