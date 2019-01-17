/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binirization;

/**
 *
 * @author WorkSpace
 */


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Binirization {

  
  public static void main(String[] args) throws IOException {

    File file = new File("grayscale2.jpg");
    BufferedImage orginalImage = ImageIO.read(file);

    BufferedImage Binirization = new BufferedImage(
        orginalImage.getWidth(), orginalImage.getHeight(),
        BufferedImage.TYPE_BYTE_BINARY);

    Graphics2D graphics = Binirization.createGraphics();
    graphics.drawImage(orginalImage, 0, 0, null);

    ImageIO.write(Binirization, "jpg", new File("bin2.jpg")); 
  }

}