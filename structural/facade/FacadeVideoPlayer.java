package com.newbie.structural.facade;

public class FacadeVideoPlayer {
   public void playVideoFile(String fileName) {
       System.out.println("FacadeVideoPlayer: started. Prepared to play...");
       VideoFile file = new VideoFile(fileName);
       Codec sourceCodec = CodecFactory.extract(file);
       Bitrate.readAudio(fileName);
       Bitrate.audioConvert(fileName);
       System.out.println("FacadeVideoPlayer:  Playing film : " + fileName);
   }
}
