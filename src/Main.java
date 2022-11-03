public class Main {



    public static void main(String[] args) {
       UserInterface ui = new UserInterface();


       String sound = ui.readString("Hvad siger musen? ");

       Mouse m = new Mouse(sound);
       String s = m.sound();

       ui.println(s);










    }
}