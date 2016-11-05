package com.ninescript.staticUse;

public class DemoForStsticNested1

{

		public static void main(String asd[])
		{
			StaticNested1 sn1=new StaticNested1();
			StaticNested1.ABC abc= sn1.new ABC();
			StaticNested1.ABC.XYZ xyz= abc.new XYZ();
			xyz.xyzShow();
		}
}
