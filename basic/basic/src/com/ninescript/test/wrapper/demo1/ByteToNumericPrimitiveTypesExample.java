package com.ninescript.test.wrapper.demo1;

public class ByteToNumericPrimitiveTypesExample {

	
	public static void main(String[] args) {
		
		Byte b=new Byte("8");
		byte b1=b.byteValue();
		System.out.println(b);
		System.out.println(b1);
		System.out.println();
		
		Integer i =new Integer("120");
		int ii=i.intValue();
		System.out.println(ii);
		System.out.println(i);
		System.out.println();


		Short s=new Short("22");
		short ss=s.shortValue();
		System.out.println(s);
		System.out.println(ss);
		System.out.println();
		
		Long l=new Long("3464636");
		long ll=l.longValue();
		System.out.println(l);
		System.out.println(ll);
		System.out.println();

		

	}
}
