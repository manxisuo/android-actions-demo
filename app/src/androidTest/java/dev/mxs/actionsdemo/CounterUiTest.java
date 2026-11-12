package dev.mxs.actionsdemo;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.Until;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class CounterUiTest {
    @Test public void tappingButtonIncrementsCounter() {
        UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        var context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        var intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        assertNotNull("Launch intent", intent);
        intent.addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK | android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
        assertNotNull("Initial counter", device.wait(Until.findObject(By.text("点击次数：0")), 10000));
        var button = device.findObject(By.text("点我 +1"));
        assertNotNull("Counter button", button);
        button.click();
        assertNotNull("Updated counter", device.wait(Until.findObject(By.text("点击次数：1")), 5000));
    }
}
