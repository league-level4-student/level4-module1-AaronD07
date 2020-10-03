package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		
		switch(choice) {
		case "Sunday": 
			System.out.println("You have school tm. eek");
			break;
		case "Monday": 
			System.out.println("Congrats it's the worst day of the week");
			break;
		case "Tuesday": 
			System.out.println("Stonks");
			break;
		case "Wednesday": 
			System.out.println("It's the middle of the week XD");
			break;
		case "Thursday": 
			System.out.println("Wowwwww grapeeeeeee ");
			break;
		case "Friday": 
			System.out.println("Yessss best day of the week, finish your homework");
			break;
		case "Saturday": 
			System.out.println("Congrats if you made it this far, second best day of the week");
			break;
		default: 
			System.out.println("Something went wrong :(     "
					+ "https://www.bing.com/videos/search?q=trollz+ear+rape&docid=607997262849311141&mid=04B7A231D5FF57C4024A04B7A231D5FF57C4024A&view=detail&FORM=VIRE");
			break;
		}
	}
		//use a switch statement to do something cool for each option
		
	}
