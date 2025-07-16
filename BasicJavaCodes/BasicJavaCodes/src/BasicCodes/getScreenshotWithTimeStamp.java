package BasicCodes;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class getScreenshotWithTimeStamp {

	public static void main(String[] args) throws AWTException, IOException {
		String currentTimeSTamp=new SimpleDateFormat("ddMMyyyy_hhmmss_a").format(new Date());
		System.out.println(currentTimeSTamp);
		
		String screenShotName="Screenshot_"+currentTimeSTamp+" .png";
		System.out.println(screenShotName);
		
		Robot robot=new Robot();
		Rectangle rec=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage image=robot.createScreenCapture(rec);
		
		File f=new File(screenShotName);
		ImageIO.write(image, "png", f);
		System.out.println(screenShotName);
		
		
	}
}
