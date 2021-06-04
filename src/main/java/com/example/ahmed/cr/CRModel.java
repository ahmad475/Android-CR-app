package com.example.ahmed.cr;

/**
 * Created by Ahmed on 2017-07-02.
 */

public class CRModel {
    private int counter;
    private static int WIDTH = 4;
    private static int HEIGHT = 5;
    private int counterx;
    private int countery;



    public int CRModel(){
        this.counter=0;
        return counter;
    }

    public int n(){
        this.counter++;
        if (canGoNorth()==true) {
            this.countery--;
        }else {countery=0;}
        return countery;
    }
    public int s(){
        this.counter++;
        if (canGoSouth()==true) {
            this.countery++;
        }else {countery=4;}
        return countery;
    }
    public int e(){
        this.counter++;
        if (canGoEast()==true) {
            this.counterx++;
        }else {counterx=3;}
        return counterx;
    }
    public int w(){
        this.counter++;
        if (canGoWest()==true) {
            this.counterx--;
        }else {counterx=0;}
        return counterx;
    }

    public int getinty(){
        return countery;
    }
    public int getintx(){
        return counterx;
    }


    public String getstring(){
        int index2 = this.counter;
        String result2 =String.format("%1d",index2);
        return result2;
}


    public boolean canGoNorth(){
        if (countery <=0)
            return false;
        else  {
            return true;
        }
    }
    public boolean canGoSouth(){
        if (countery >= this.HEIGHT-1)
            return false;
        else {
            return true;
        }
    }
    public boolean canGoEast(){
        if (counterx >= this.WIDTH-1)
            return false;
        else {
            return true;
        }
    }

    public boolean canGoWest() {
        if (counterx <=0)
            return false;
        else  {
            return true;
        }
    }
}
