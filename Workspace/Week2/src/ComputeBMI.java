import javax.swing.JOptionPane;
public class ComputeBMI {

	public static void main(String[] args) {
		double pounds, height, bmi;
		String input;
		
		input = JOptionPane.showInputDialog("Enter your weight in pounds.");
		pounds = Double.parseDouble(input);
		pounds *= .45359237;
		input = JOptionPane.showInputDialog("Enter your height in inches.");
		height = Double.parseDouble(input);
		height *= 0.0254;
		bmi = pounds/(height * height);
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + bmi);
		
		System.exit(0);

	}

}
