package ch13.work.adaptor;

import ch13.work.command.Broker;
import ch13.work.command.BuyStock;
import ch13.work.command.SellStock;
import ch13.work.command.Stock;

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}