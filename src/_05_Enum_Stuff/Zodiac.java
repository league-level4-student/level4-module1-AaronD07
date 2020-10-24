package _05_Enum_Stuff;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public class Zodiac{
public enum Zodiacs {
	ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, 
	LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
}


public static void main(String[] args) {


	Zodiacs data = Zodiacs.GEMINI;

switch(data) {
case ARIES:
	System.out.println("Don't get so stuck in your ways today that you insist on having the one true answer without really considering the options. You must be aware of a lot before you commit yourself one way or another. The people around you are apt to get annoyed with your narrow-mindedness, for this is how you will be viewed unless you stop and take a considered look at the whole picture.");
	break;
case TAURUS:
	System.out.println("Ummm hi");
	break;
case GEMINI:
	System.out.println("Geminis are amazing, but they are unloyal and two-faced sometimes");
	break;
case CANCER:
	System.out.println("Idk much abt Cancers");
	break;
case LEO:
	System.out.println("Leos are rlly good friends");
	break;
case VIRGO:
	System.out.println("VIRGOS ARE LITERALLY THE BEST ZODIAC SIGN. You are so talented and skilled at everything you do.");
	break;
case LIBRA:
	System.out.println("Being a libra doesn't make you better than everyone, don't think so highly of yourself");
	break;
case SCORPIO:
	System.out.println("Most ppl don't understand you, be outgoing and make friends");
	break;
case SAGITTARIUS:
	System.out.println("Sags are so fun and rlly great influences");
	break;
case CAPRICORN:
	System.out.println("What's it like being irrelevant");
	break;
case AQUARIUS:
	System.out.println("Aquarius' are rare but they are amazing ppl and make life fun");
	break;
case PISCES:
	System.out.println("Speak up, you are too shy and quiet but rlly talented.");
	break;
}
}
}
