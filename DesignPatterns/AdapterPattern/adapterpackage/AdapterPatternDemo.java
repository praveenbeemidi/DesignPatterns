package adapterpackage;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer=new AudioPlayer();
		
		audioPlayer.play("mp3", "baahubali.mp3");
		audioPlayer.play("mp4", "spyder.mp4");
		audioPlayer.play("vlc", "kabali.vlc");
		audioPlayer.play("avi", "raone.avi");
		

	}

}
