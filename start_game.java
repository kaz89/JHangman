package Jhangman;

public class start_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JHangMan v1.0 by Kaz");
		wordGenerator word=new wordGenerator();
		String x=word.generateFromFile();
		wordLogic hide=new wordLogic();
		hide.gameLogic(x);
	}

}
