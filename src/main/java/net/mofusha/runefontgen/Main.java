package net.mofusha.runefontgen;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedImage image = new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB);
        for (int i = 0; i < 4; i++) {
            if (i % 2 != 0){
                image.getGraphics().drawImage(ImageIO.read(new File("src/main/resources/x.png")), 16 * i, 0, null);
            }
        }
        ImageIO.write(image, "PNG", new File("generated/output.png"));
    }
}
