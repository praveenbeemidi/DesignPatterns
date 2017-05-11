package adapterpackage;

public class AudioPlayer implements MediaPlayer{

	@Override
	public void play(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("Mp3")){
			System.out.println("Playing Mp3 file. Name:" + fileName);
		}
		
		else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
			MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			
			mediaAdapter.play(audioType, fileName);
		}
		
		else{
			System.out.println("Invalid media"+audioType+"format not supported");
		}
	}

}
