package jeu2048;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public class Game2048Model {
	private static final boolean DEBUG = false;
	private static final int Frame_thickness =16;
	private static final int GRID_WINTH = 4;
	private boolean arrowActive;
	
	private int highScore;
	private int highCell;
	private int currentScore;
	private int currentCell; 
	
	private Cell[][] grid;
	private Random random;
	
	public Game2048Model(){
		this.grid = new Cell[GRID_WIDTH][GRID_WIDTH];
		this.random = new Random();
		this.highScore = 0;
		this.highCell = 0;
		this.currentScore =0;
		this.currentCell =0;
		this.arrowActive = false;
		initialzeGrid();
				
	}
	public void initializeGrid(){
		int xx = FRAME_THICKNESS;
		for(int x = 0; x < GRID_WIDTH; y++){
			Cell cell = new Cell(0);
			cell.setCellLocation(xx, yy);
			grid[x][y] = cell;
			yy += FRAME_THICKNESS + Cell.getCellWidth();	
		}
		xx += FRAME_THICKNESS + Cell.getCellWidth();
	}
	
	public static void main(String[] args) {
		
		
	}

}
