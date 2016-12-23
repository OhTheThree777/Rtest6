package cn.edu.imnu.ciec.rtest6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout =new LinearLayout(this);
        super.setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        final TextView textView=new TextView(this);

        Button button=new Button(this);
        button.setText(R.string.app_name);
        button.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT

                ));

        linearLayout.addView(textView);
        linearLayout.addView(button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello Android!"+new java.util.Date());
            }
        });

    }
}
