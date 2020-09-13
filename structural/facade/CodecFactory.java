package com.newbie.structural.facade;

import com.newbie.structural.facade.videoCodecTypes.aviVideoCodec;
import com.newbie.structural.facade.videoCodecTypes.mp4VideoCodec;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: prepare to play MP4 video data...");
            return new mp4VideoCodec();
        }
        else {
            if (type.equalsIgnoreCase("avi")) {
                System.out.println("CodecFactory: prepare to play AVI video data...");
                return new aviVideoCodec();
            }
                else {
                    System.out.println("CodecFactory: prepare to play MPEG video data...");
                    return new aviVideoCodec();
                }
            }
        }
}
