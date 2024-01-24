package CommonFunction;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

public class Helper {

	public static String getscreenshot(WebDriver driver) throws AWTException, IOException {
		Robot robot = new Robot();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dimension);
		BufferedImage image = robot.createScreenCapture(rectangle);
		String Screenshot = System.getProperty("user.dir") + "./ScreenShot/Flyone" + getcurrenttime() + ".png";
		File file = new File(Screenshot);
		ImageIO.write(image, "png", file);
		return Screenshot;
	}

	public static String getcurrenttime() {
		DateFormat dateFormat = new SimpleDateFormat();
		Date date = new Date();
		String data = dateFormat.format(date);
		return data;
	}
}
