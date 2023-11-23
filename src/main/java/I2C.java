
import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.io.i2c.*;
import com.pi4j.io.i2c.I2CProvider;
import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

package.robot;

public class I2C {
    public static final int PCA9685_ADDRESS = 0x40;     
    static void i2cConfig() {

    var pi4j = Pi4J.newAutoContext();

    I2CProvider i2cProvider = pi4j.provider("linuxfs-i2c");
    I2CConfig i2cConfig = I2C.newConfigBuilder(pi4j).id("PCA9685-1").bus(1).device(0x40).build();

    I2CBus i2c = I2CFactory.getInstance(I2CBus.BUS1);
    I2CDevice device = i2c.getDevice(PCA9685_ADDRESS);
    


    }


//    VictorSP motor1 = new VictorSP(1);
    
}
