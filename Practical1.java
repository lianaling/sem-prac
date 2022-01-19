import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Practical1 implements ItemListener {
	// Define GUI var
	FlowLayout layout = new FlowLayout();
	JComboBox<String> fruitbox = new JComboBox<>();
	JComboBox<String> herobox = new JComboBox<>();
	JLabel fruitlist = new JLabel("Fruit List");
	JLabel herolist = new JLabel("Hero List");
	JLabel selectEvent = new JLabel("Price will be shown on text box for selected fruit");
	JLabel heroEvent = new JLabel("Score will be shown on text box for selected hero");
	JTextField fruitprice = new JTextField(20);
	JTextField heroscore = new JTextField(20);
	JPanel mypane = new JPanel();
	JFrame frame = new JFrame("Practical 1 - My Favourite Fruit and Hero");

	// Define var
	int[] listprice = { 10, 9, 6, 12 };
	int[] listscore = { 95, 85, 90, 80 };
	int totalprice = 0;
	int score = 0;
	String output;

	public Practical1() {
		mypane.setLayout(layout);

		// Add item to fruit list
		mypane.add(fruitlist);
		fruitbox.addItemListener(this);
		fruitbox.addItem("Orange");
		fruitbox.addItem("Apple");
		fruitbox.addItem("Banana");
		fruitbox.addItem("Berries");

		// Add fruit list functionality
		mypane.add(fruitbox);
		mypane.add(selectEvent);
		mypane.add(fruitprice);

		// Break newline
		mypane.add(new JLabel(" "));
		mypane.add(new JLabel("<html><br/></html>"));

		// Add item to hero list
		mypane.add(herolist);
		herobox.addItemListener(this);
		herobox.addItem("Superman");
		herobox.addItem("My Lecturer");
		herobox.addItem("My Tutor");
		herobox.addItem("Myself");

		// Add hero box functionality
		mypane.add(herobox);
		mypane.add(heroEvent);
		mypane.add(heroscore);

		// Add pane to frame
		frame.add(mypane);
	}

	public static void main(String[] args) {
		Practical1 practical1 = new Practical1();

		// Set frame features
		practical1.frame.setSize(700, 500);
		practical1.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		practical1.frame.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();
		int choice = 0;

		// Update text field on index change
		updateTextField(source, choice, fruitbox, listprice, totalprice, fruitprice);
		updateTextField(source, choice, herobox, listscore, score, heroscore);
	}

	private void updateTextField(Object source, int choice, JComboBox<String> box, int[] list, int total, JTextField textfield){
		if(source == box){
			choice = box.getSelectedIndex();
			total = list[choice];
			output = "The fruit price is " + total;
			textfield.setText(output);
		}
	}
}
