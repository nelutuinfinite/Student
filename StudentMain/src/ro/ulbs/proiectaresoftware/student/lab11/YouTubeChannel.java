package ro.ulbs.proiectaresoftware.student.lab11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    private String channelName;
    private List<Observer> Observatori=  new ArrayList<>();

    @Override
    public void addObserver(Observer Altul) {
        Observatori.add(Altul);
    }

    @Override
    public void removeObserver(Observer Altul) {
        Observatori.remove(Altul);
    }
    @Override
    public void notifyObservers(String mesaj){
        for (final Observer Obervator : Observatori){
            Obervator.UpDate(mesaj);
        }
    }

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void uploadVideo(String title) {
        System.out.println("{"+ channelName + "} uploaded a new video: " + title);
        notifyObservers(title);
    }
}