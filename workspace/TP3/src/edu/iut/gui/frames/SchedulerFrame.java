package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;


public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;	
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;
	
	protected void setupUI() {
		
		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);
		
		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());
	
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu file;		
		JMenuItem load;
		JMenuItem save;
		JMenuItem quit;
		
		/* File Menu */
		/** EX4 : MENU : UTILISER L'AIDE FOURNIE DANS LE TP**/		
		file = new JMenu("File");
		menuBar.add(file);
		load =new JMenuItem("Load");
		file.add(load);
		save =new JMenuItem("Save");
		file.add(save);
		quit =new JMenuItem("Quit");
		file.add(quit);
		
		JMenu edit;		
		JMenu view;
		JMenuItem week;
		JMenuItem month;
		JMenuItem day;
	
		edit = new JMenu("Edit");
		menuBar.add(edit);
		view =new JMenu("View");
		edit.add(view);
		month =new JMenuItem("Month");
		view.add(month);
		week =new JMenuItem("Week");
		view.add(week);
		day =new JMenuItem("Day");
		view.add(day);
		
		JMenu help;		
		JMenuItem display;
		JMenuItem about;
	
		help = new JMenu("Help");
		menuBar.add(help);
		display =new JMenuItem("Display");
		help.add(display);
		about =new JMenuItem("About");
		help.add(about);
		JSpinner spinner;
		SpinnerModel model=new SpinnerNumberModel(2015,2000,2020,1);
		
		spinner =new JSpinner(model);
		
		contentPane.add(spinner);
		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
		
	}
	
	public SchedulerFrame() {
		super();
		
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

		
	}
	public SchedulerFrame(String title) {
		super(title);
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		setupUI();
	}
	
}
