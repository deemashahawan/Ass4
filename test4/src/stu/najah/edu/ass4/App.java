package stu.najah.edu.ass4;

public class App {
    public static void main(String[] args) {

        ColorStore colorStore=new ColorStore();
        // default colors in store (red,green,blue,white,black)
         colorStore.DefaultColors();
        //add new color
        colorStore.addColor(1,44,100);
        colorStore.addColor(6,99,1);
        //if we add the same color we added before the store dont create new one
        colorStore.addColor(6,99,1);
        //print colors
        colorStore.printColor(0,0,0);
        colorStore.printColor(6,88,233);
        colorStore.printColor(255,0,0);
        colorStore.printColor(1,44,100);

    }
}
