public class Mouse {

    private String sound;

    Mouse(String sound){
        this.sound = sound;
    }
    public String sound(){
        return "Mouse says " + sound;
    }

}
