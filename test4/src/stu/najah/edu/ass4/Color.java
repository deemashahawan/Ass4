package stu.najah.edu.ass4;

public class Color {
    private int red;
    private int green;
    private int blue;
    private static Color instance=null;
    public static Color getInstance(int r,int g,int b){
        Boolean t=ColorStore.colors.containsKey(r+","+g+","+b);
        if(instance==null) {
            if (t.equals(false)) {
                synchronized (Color.class) {
                    if (instance == null) {
                        instance = new Color(r, g, b);
                    }
                }
            }
        }
        return instance;
    }
    private Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
    @Override
    public String toString(){
        return this.red + ", " + this.green + " ," + this.blue;
    }


}
