package Aggregation;
class MusicPlayer{
    private String name;
    public MusicPlayer(String name){
        this.name=name;
    }
    public void start(){
        System.out.println("Music Player Started.....");
    }
    public void stop(){
        System.out.println("Music Player Stopped");
    }
}

class Car{
    private String name;
    private MusicPlayer player;
    public Car(String name,MusicPlayer player){
        this.name=name;
        this.player=player;
    }
    public String getName(){
        return name;
    }
    public void startPlayer(){
        player.start();
    }
    public void stopPlayer(){
        player.start();
    }
}
public class TestAggr {

    public static void main(String[] args) {
        MusicPlayer player= new MusicPlayer("sony");
        Car brezza = new Car("Brezza",player);
        System.out.println("Car is:"+brezza.getName());
        brezza.startPlayer();
        brezza.stopPlayer();
    }


}
