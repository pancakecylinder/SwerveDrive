
import com.pi4j.io.i2c.*;
import io.mraa.upm.libupm.pca9685;

public class UPM {

    PCA9685 PCA9685_Module = new PCA9685(I2CBus.BUS1, 0x40);
    PCA9685_Module->ledOnTime(PCA9685_ALL_LED, 0);
    PCA9685_Module->ledOffTime(PCA9685_ALL_LED, 2048);
    
}
