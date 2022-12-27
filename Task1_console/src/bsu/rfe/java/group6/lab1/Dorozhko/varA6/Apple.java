package bsu.rfe.java.group6.lab1.Dorozhko.varA6;

public class Apple extends  Food{
	 private String size;
    @Override 
    public boolean equals(Object obj) {
        if (!(obj instanceof Apple)) {
            return false;
        } else if (size == null || ((Apple) obj).size == null) {  // размер не задан
            return false;
        }
        else if (!(size.equals(((Apple) obj).size))) {
            return false;
        }
        return super.equals(obj);
    }


    public String getSize(){
        return size;
    }

    public Apple(String size){
        super ("Apple");
        this.size = size;
    }

    public void consume(){
        System.out.println(this + " has been eaten");
    }

    @Override
    public String toString() {
        return super.toString() + " size of '" + size.toUpperCase() + "'";
    }
}
