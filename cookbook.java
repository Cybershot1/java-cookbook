import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class cookbook {
	
	/*public void hello() {
		System.out.println("Hello from a thread!");
	}*/
	
	/**
	*	Creates the UI for the program.
	*/
	public void buildUI() {
		//JFrame and JPanel creation.
		JFrame cookbookWindow = new JFrame("Cook Book");
		
		BorderLayout layout = new BorderLayout(20, 20);
		JPanel cookbookPanel = new JPanel(layout);
		
		cookbookPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		//Closing behavior of the JFrame.
		cookbookWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Recipes JComboBox creation
		String[] testRecipes = { "recipe1", "recipe2", "recipe3" };
		JComboBox<String> recipesList = new JComboBox<String>(testRecipes);
		recipesList.setSelectedIndex(0);
		
		recipesList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				String recipe = (String)cb.getSelectedItem();
			}
		});
		
		//Description JTextArea creation
		JTextArea description = new JTextArea("Test text here\n 10ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss10");
		
		description.setLineWrap(true);
		description.setWrapStyleWord(true);
		
		JScrollPane descriptionPane = new JScrollPane(description);

		//Add elements.
		cookbookPanel.add(recipesList, BorderLayout.PAGE_START);
		cookbookPanel.add(descriptionPane, BorderLayout.CENTER);
		
		cookbookWindow.add(cookbookPanel);

		//Showing the JFrame.
		cookbookPanel.setVisible(true);
		cookbookWindow.setVisible(true);
		
		//Set minimum size.
		cookbookWindow.setMinimumSize(new Dimension(480, 800));
	}
	
		
	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating the main object for this application
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new cookbook().buildUI();
            }
        });
    }
}