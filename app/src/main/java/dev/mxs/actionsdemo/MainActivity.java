package dev.mxs.actionsdemo;
import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int count = 0;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.rgb(240, 246, 255));
        TextView title = new TextView(this);
        title.setText("Android Actions Demo");
        title.setTextSize(26);
        title.setTextColor(Color.rgb(30, 60, 100));
        title.setGravity(Gravity.CENTER);
        TextView counter = new TextView(this);
        counter.setTextSize(22);
        counter.setGravity(Gravity.CENTER);
        counter.setPadding(0, 32, 0, 24);
        counter.setText("点击次数：0");
        Button button = new Button(this);
        button.setText("点我 +1");
        button.setOnClickListener(v -> counter.setText("点击次数：" + (++count)));
        layout.addView(title, new LinearLayout.LayoutParams(-1, -2));
        layout.addView(counter, new LinearLayout.LayoutParams(-1, -2));
        layout.addView(button, new LinearLayout.LayoutParams(-1, -2));
        setContentView(layout);
    }
}
