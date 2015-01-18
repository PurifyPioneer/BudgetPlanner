package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BudgetPlannerFrame extends JFrame{

	private String title = "Budget Planner";
	
	public BudgetPlannerFrame() {
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setTitle(title);

//		this.initObjects();
//
//		this.createWidgets();
//		this.addWidgets();
		
		this.pack();

		this.setLocationRelativeTo(null);
		this.setMinimumSize(getContentPane().getPreferredSize());

		WindowListener winListener = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int answer = JOptionPane.showConfirmDialog(BudgetPlannerFrame.this,
						"Wollen sie das Programm wirklich beenden ?",
						"Wirklich beenden ?", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				if (answer == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		};
		this.addWindowListener(winListener);
	}
	
}
