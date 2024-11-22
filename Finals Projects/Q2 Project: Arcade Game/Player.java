//Player Class
import java.awt.Color;
import java.awt.Graphics;


public class Player{
	private int x;
	private int y;
	
	private int width;
	private int height;
	
	private Color blue;
	private boolean visible = true;
	
	public Player(int x, int y){
		this.x = x;
		this.y = y;
		this.width = 50;
		this.height = 50;
		this.blue = new Color(0,0,255);
	}

	public boolean getVisible(){
		return visible;
	}

	public void setVisible(boolean v){
		visible = v;
	}
	
	public void drawMe(Graphics g){
		if (visible == true){
			//put in image for player
		}
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}


	
	public void moveUp(){
		y = y - 5;
	}
	
	public void moveDown(){
		y = y + 5;
	}
	
	public void moveLeft(){
		x = x - 5;
	}
	
	public void moveRight(){
		x = x + 5;
	}
	
	public boolean checkCollision(Target t){
		int pX = x;
		int pY = y;
		int pWidth = width;
		int pHeight = height;
		int tX = t.getX();
		int tY = t.getY();
		int tWidth = t.getWidth();
		int tHeight = t.getHeight();
		
		if (pX+pWidth >= tX && pX <= tX + tWidth  &&  pY+pHeight >= tY && pY <= tY + tHeight ){
			return true;
		}
		return false;
    }

}