import javax.swing.*; 
public class Gui {

	public static void main(String[] args) {
		
			String input1 = JOptionPane.showInputDialog("Enter First Number");
			int number1 = Integer.parseInt(input1);
			String input2 = JOptionPane.showInputDialog("Enter Second Number");
			int number2 = Integer.parseInt(input2);
			
			int sum = number1+number2; 
			
			JOptionPane.showMessageDialog(null, "The Sum of two numbers = " + sum);
			}

	}

