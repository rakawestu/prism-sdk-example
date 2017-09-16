package id.rakawm.prism_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.prismapp.sdk.ui.PrismUi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrismUi.getInstance().startChatUi(this);
        finish();
    }
}
