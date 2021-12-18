import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ControlKeyboard {
    public static void main(String[] args) {
        try{
            try {//创建Windows命令打开记事本
                Runtime.getRuntime().exec("notepad");
            } catch (IOException e) {
                e.printStackTrace();
            }
			//创建机器人
            Robot myRobot = new Robot();
            // 打出一个大写的Q
			myRobot.keyPress(KeyEvent.VK_SHIFT);    // 模拟键盘按下shift键
			myRobot.keyPress(KeyEvent.VK_Q);        // 模拟键盘按下Q键（小写）
			myRobot.keyRelease(KeyEvent.VK_Q);      // 模拟键盘释放Q键
			myRobot.keyRelease(KeyEvent.VK_SHIFT);  // 模拟键盘释放shift键
			// 移动鼠标到坐标（x,y)处，并点击左键
			// myRobot.mouseMove(x, y);                // 移动鼠标到坐标（x,y）处
			// myRobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);     // 模拟按下鼠标左键
			// myRobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);   // 模拟释放鼠标左键
			// myRobot.mousePress(KeyEvent.BUTTON3_DOWN_MASK);     // 模拟按下鼠标右键
			// myRobot.mouseRelease(KeyEvent.BUTTON3_DOWN_MASK);   // 模拟释放鼠标右键
			// 设置每次输入的延迟为200ms
			//myRobot.setAutoDelay(200);
        } catch (AWTException e){
            e.printStackTrace();
        }
    }
}
