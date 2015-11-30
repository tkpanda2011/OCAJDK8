package com.aurotech.calender_date_locale_TimeZone;




import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DateUI extends JPanel{

	static JFrame frame;
	JLabel  resultLabel;
	String currentPattern;
	Date currentDate;
	LocaleGroup avaiableLocales;
	
	public DateUI(){
		
		currentDate = new Date();
		avaiableLocales = new LocaleGroup();

		    String[] patternExamples = { "dd MMMMM yyyy", "dd.MM.yy", "MM/dd/yy",
		        "yyyy.MM.dd G 'at' hh:mm:ss z", "EEE, MMM d, ''yy", "h:mm a",
		        "H:mm:ss:SSS", "K:mm a,z", "yyyy.MMMMM.dd GGG hh:mm aaa" };

		    currentPattern = patternExamples[0];
		    
		    
		   //Patern Component Sertup  
		    JLabel patternLabel =new JLabel("Enter The Pattern or Select ");
		   JLabel patternLabel2 =new JLabel("Select The Location ");
		   
		   patternLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		   patternLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);
		   
		   
		   JComboBox<String> patternList= new JComboBox<String>(patternExamples);
		   patternList.setEditable(true);
		 
		   patternList.setSelectedIndex(0);
		   patternList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			      JComboBox cb = (JComboBox) event.getSource();
			      String newSelection = (String) cb.getSelectedItem();
			      currentPattern = newSelection;
			      reformat();
			    }
		});
		   // Locale selection 
		   
		   JLabel localeLabel =new JLabel("Select Country                        ");  
		   localeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		   JComboBox<String> localeList= new JComboBox<String>(avaiableLocales.getLocaleNames());
		   localeList.setSelectedIndex(0);
		  
		   localeList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			      JComboBox cb = (JComboBox) event.getSource();
			      
			      avaiableLocales.setCurrentLocale(cb.getSelectedIndex());
			      reformat();
			    }
		});
		  
		   	   JLabel resultLabel2 = new JLabel("Current Date and Time", JLabel.LEFT);
		   	resultLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);
		   	
		    resultLabel = new JLabel("");
		    resultLabel.setForeground(Color.BLACK);
		        resultLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		    resultLabel.setBorder(BorderFactory.createCompoundBorder(BorderFactory
		        .createLineBorder(Color.black), BorderFactory.createEmptyBorder(5, 5,
		        5, 5))); 
		   
		 // Lay out everything
		    JPanel patternPanel = new JPanel();
		    patternPanel.setLayout(new BoxLayout(patternPanel, BoxLayout.Y_AXIS));
		    patternPanel.add(patternLabel);
		 //   patternPanel.add(patternLabel2);
		    
		    JPanel patternPanel3 = new JPanel();
		    patternPanel3.add(patternList);
		    patternPanel3.add(new JPanel());
		    JPanel patternPanel2 = new JPanel();
		    patternPanel2.setLayout(new BoxLayout(patternPanel2, BoxLayout.X_AXIS));
		    patternPanel2.add(patternPanel);
		    patternPanel2.add(patternList);
		    
		   
		    JPanel localePanel = new JPanel();
		    localePanel.setLayout(new BoxLayout(localePanel, BoxLayout.X_AXIS));
		    localePanel.add(localeLabel);
		    localePanel.add(localeList);

		    JPanel resultPanel = new JPanel();
		    resultPanel.setLayout(new GridLayout(1, 0));
		    resultPanel.add(resultLabel2);
		    resultPanel.add(resultLabel);
		    
		    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		    patternPanel2.setAlignmentX(Component.CENTER_ALIGNMENT);
		    localePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		    resultPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		    patternPanel2.setAutoscrolls(true);
		    add(patternPanel2);
		    add(Box.createVerticalStrut(10));
		    add(localePanel);
		   add(Box.createVerticalStrut(10));
		    add(resultPanel);
		   
		    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		    reformat();

		   
	}
	
	protected void reformat() {
		SimpleDateFormat formatter=new SimpleDateFormat(currentPattern, avaiableLocales.getCurrentLocale());
		
		String date=formatter.format(currentDate);
		resultLabel.setForeground(Color.BLACK);
		resultLabel.setText(date);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		WindowListener listner =new WindowAdapter() {
			public void windowClosing(WindowEvent event){
				
				System.exit(0);
			}
		};
		
		frame=new JFrame("Date Example with UI");
		frame.addWindowListener(listner);
		frame.getContentPane().add("Center", new DateUI());
	//	frame.pack();
		
	frame.setResizable(false);
		frame.setBounds(300, 200, 450, 150);
		frame.setVisible(true);
	}
	
	private class LocaleGroup{
		 private Locale currentLocale;
		private Locale[] supprotedLocale=Locale.getAvailableLocales();
		
		public LocaleGroup(){
			currentLocale=supprotedLocale[0];
		}
		public Locale getCurrentLocale(){
			return currentLocale;
		}
		/**
		 * @param index
		 */
		public void setCurrentLocale(int index){
			currentLocale=supprotedLocale[index];
		}
		
		public String[] getLocaleNames(){
			String[] names= new String[supprotedLocale.length];
			for(int i=0;i<supprotedLocale.length;i++){
				names[i]=supprotedLocale[i].getDisplayName();
				System.out.println(supprotedLocale[i].getCountry());
				System.out.println("names i"+names[i]);
			}
			return names;
		}
	}
}
