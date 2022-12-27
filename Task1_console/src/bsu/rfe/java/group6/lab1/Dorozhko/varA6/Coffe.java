package bsu.rfe.java.group6.lab1.Dorozhko.varA6;

public class Coffe extends Food {
	
	 private String aroma;
    @Override // явное переопределение метода
    public boolean equals(Object obj) {
        if (!(obj instanceof Coffe)){
           return false;
        }
        if (aroma == null || ((Coffe)obj).aroma == null){
            return false;
        }
        if(!(aroma.equals(((Coffe) obj).aroma))){
            return false;
        }

        return super.equals(obj);
    }

  

    public String getAroma(){
        return aroma;
    }

    public void setAroma(String aroma){
        this.aroma = aroma;
    }

    public Coffe(String aroma){
        super ("Coffe");
        this.aroma = aroma;
    }

    public void consume(){
        System.out.println(this + " has been drinken");
    }

    @Override
    public String toString() {
        return super.toString() + " with aroma of '" + aroma.toUpperCase() + "'";
    }

}
