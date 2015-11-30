package com.aurotech.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo extends JPanel {
	


	public JTabbedPaneDemo() {
		ImageIcon icon = new ImageIcon("c:\\2.gif");
		JTabbedPane jtbExample = new JTabbedPane();
		JPanel jplInnerPanel1 = createInnerPanel("Tab 1 Contains Tooltip and Icon");
		jtbExample.addTab("One", icon, jplInnerPanel1, "Tab 1");
		jtbExample.setSelectedIndex(0);
		JPanel jplInnerPanel2 = createInnerPanel("Tab 2 Contains Icon only");
		jtbExample.addTab("Two", icon, jplInnerPanel2);
		JPanel jplInnerPanel3 = createInnerPanel("Tab 3 Contains Tooltip and Icon");
		jtbExample.addTab("Three", icon, jplInnerPanel3, "Tab 3");
		JPanel jplInnerPanel4 = createInnerPanel("Tab 4 Contains Text only");
		jtbExample.addTab("Four", jplInnerPanel4);
		// Add the tabbed pane to this panel.
		setLayout(new GridLayout(1, 1));
		add(jtbExample);
	}
	protected JPanel createInnerPanel(String text) {
		JPanel jplPanel = new JPanel();
		JLabel jlbDisplay = new JLabel(text);
		jlbDisplay.setHorizontalAlignment(JLabel.CENTER);
		jplPanel.setLayout(new GridLayout(1, 1));
		jplPanel.add(jlbDisplay);
		return jplPanel;
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("TabbedPane Source Demo");
		Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(""+screenSize.height+" "+screenSize.width);
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(new JTabbedPaneDemo(),
				BorderLayout.CENTER);
		frame.setSize(1368, 768);
		frame.setVisible(true);
	}

}
