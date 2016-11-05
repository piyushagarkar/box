package com.ninescript.piyush;

public class StaticS {

	private int aa=50;

	void show1(){

		class InsideOne{

			void Show(){
				System.out.println("Inner Print From Inner ");
				System.out.println(aa);
			}


		}
			InsideOne in=new InsideOne();
			in.Show();


	}

	public static void main(String[] args) {
		new StaticS().show1();
	}



}
