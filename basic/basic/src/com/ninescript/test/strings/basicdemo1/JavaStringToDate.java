package com.ninescript.test.strings.basicdemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class JavaStringToDate {
        public static void main(String args[]){
               
                //Java String having date
                String strDate = "21/08/2011";
             
               
                try{
                  
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                       
                        //convert Java String to Date using parse method of SimpleDateFormat
                        Date date = sdf.parse(strDate);
                       
                       System.out.println("Date is: " + date);

                }catch(ParseException e){
                        System.out.println("Java String could not be converted to Date: " + e);
                }
        }
}
