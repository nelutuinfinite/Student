package ro.ulbs.proiectaresoftware.student.lab11;

public class Main {
    public static void main(){
        MediaInterested om= new MediaInterested("IOn");
        MediaInterested altOm= new MediaInterested("Jhon");
        YouTubeChannel muzica = new YouTubeChannel("Alin");
        muzica.addObserver(om);
        muzica.addObserver(altOm);
        muzica.uploadVideo("Ce vreau eu");
        muzica.removeObserver(om);
        muzica.uploadVideo("Alt video");
    }
}
