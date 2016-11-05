
package com.ninescript.inheritanceUse;

/**
 * 
 * @author Piyush
 *
 */

class GameShape

{
	public void displayShape()
		{
			System.out.println("From GameShape Class and diplayShape Method");
		}
	
}



class PlayPiece extends GameShape

	{
		public void movePiece()
			{
				System.out.println("From playPiece class and movePiece method");
			}
	}



public class Test

{
	public static void main(String gh[])
		{
				PlayPiece p=new PlayPiece();
					p.displayShape();
					p.movePiece();
		
	}

}


