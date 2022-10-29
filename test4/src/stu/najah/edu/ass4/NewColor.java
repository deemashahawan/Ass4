package stu.najah.edu.ass4;

import stu.najah.edu.ass4.intf.adder;

public class NewColor implements adder {
    @Override
    public void addNewColor(int r, int g, int b) {
        Boolean t=ColorStore.colors.containsKey(r+","+g+","+b);
        if(t.equals(false)) {
            ColorStore.colors.put((r+","+g+","+b),Color.getInstance(r,g,b));
            System.out.println("Color added successfully");
        }
        else System.out.println("The color is already in store");
    }
}
