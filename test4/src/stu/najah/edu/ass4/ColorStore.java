package stu.najah.edu.ass4;

import java.util.HashMap;

public class ColorStore  {
    public final static HashMap<String, Color> colors = new HashMap<>();

    static {
        colors.put("255,0,0",Color.getInstance(255,0,0));
        colors.put("0,255,0", Color.getInstance(0,255,0));
        colors.put("0,0,255", Color.getInstance(0,0,255));
        colors.put("0,0,0",Color.getInstance(0,0,0));
        colors.put("255,255,255", Color.getInstance(255,255,255));
    }

    public void addColor(int r,int g,int b){
        NewColor newColor=new NewColor();
        newColor.addNewColor(r,g,b);
    }


    public void printColor(int r,int g,int b){
        showColor showColor=new showColor();
        showColor.printColor(r,g,b);
    }
    public void DefaultColors(){
        showColor showColor=new showColor();
        showColor.printDefaultColors();
    }

}
