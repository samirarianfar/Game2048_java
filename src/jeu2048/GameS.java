package jeu2048;
import javax.swing.SwingUtilities;
import com.ggl.game2048.model.Game2048Model;
import com.ggl.game2048.view.Game2048Frame;

public class GameS implements Runnable{
	public void run(){
		new GameSFrame(new Game2048Model());
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Game2048());
	}

}
