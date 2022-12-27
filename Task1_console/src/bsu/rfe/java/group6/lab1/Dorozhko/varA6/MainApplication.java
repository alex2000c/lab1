package bsu.rfe.java.group6.lab1.Dorozhko.varA6;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[args.length];
        for (int i = 0; i < args.length; i++) {
            String[] parts = args[i].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            } else if (parts[0].equals("Coffe")) {
                breakfast[i] = new Coffe(parts[1]);
            }
        }
        for (Food item : breakfast) {
            item.consume();
        }

        Food food = new Apple("big");
        System.out.println(food + ": " + countFoods(breakfast, food));
        printFoods(breakfast);
        System.out.println("Goodluck!");
    }

    static Integer countFoods(Food[] breakfast, Food food) {
        Integer count = 0;
        for(int i = 0; i < breakfast.length; i++) {
            if(food.equals(breakfast[i]))
            {
                count++;
            }
        }
        return count;
    }

    static void printFoods(Food[] breakfast){
        int ch = 0;
        int ap = 0;
        int cf = 0;
        for(int i = 0; i < breakfast.length; i++) {

            if(breakfast[i] instanceof Cheese){
                ch++;
            }
            else if (breakfast[i] instanceof Apple){
                ap++;
            }
            else if (breakfast[i] instanceof Coffe){
                cf++;
            }
        }
        System.out.println("Amount of Cheese - " + ch);
        System.out.println("Amount of Apple - " + ap);
        System.out.println("Amount of Coffe - " + cf);
    
}
} 
