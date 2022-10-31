package interfaces;

public class NiceCar {
    private  Engine engine;
   private Media player = new CdPlayer();
public  NiceCar(){
    engine =new PowerEngine();
}
    void  startEngine(){
      engine.start();
    }
    void  stopEngine(){
        engine.stop();
    }

    void  startMedia(){
    player.start();
    }

    void  stopMedia(){
        player.stop();
    }

    void upgradeEngine( ){
   this.engine = new ElectricEngine();
    }
}
