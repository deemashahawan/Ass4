package stu.najah.edu.ass4;

import stu.najah.edu.ass4.intf.Printer;

public class showColor implements Printer {
    @Override
    public void printColor(int r, int g, int b) {
        Boolean t=false;
        t=ColorStore.colors.containsKey(r+","+g+","+b);
        if(t.equals(false)){
            System.out.println("This color is not available in store");
        }else{
            if((r+","+g+","+b).equals("255,0,0")) System.out.println("Red");
            else if((r+","+g+","+b).equals("0,255,0")) System.out.println("Green");
            else if((r+","+g+","+b).equals("0,0,255")) System.out.println("Blue");
            else if((r+","+g+","+b).equals("0,0,0")) System.out.println("White");
            else if((r+","+g+","+b).equals("255,255,255")) System.out.println("Black");
            else {
                System.out.println(r+","+g+","+b);
            }
        }
    }

    public void printDefaultColors(){
        System.out.println("****Default Colors****");
        System.out.println("Red => 255,0,0");
        System.out.println("Green => 0,255,0");
        System.out.println("Blue => 0,0,255");
        System.out.println("White => 0,0,0");
        System.out.println("Black => 255,255,255");
        System.out.println("*********************");
    }
}
