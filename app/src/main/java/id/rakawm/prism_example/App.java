package id.rakawm.prism_example;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import io.prismapp.sdk.ui.PrismUi;

/**
 * Created by rakawm on 8/21/17.
 */

public class App extends Application {
    private static final String MERCHANT_ID = "df0772ed-9167-417e-86c7-4643e871fff0";

    @Override
    public void onCreate() {
        super.onCreate();

        new PrismUi
                .Builder(this)
                .merchantId(MERCHANT_ID)
                .notificationIcon(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round)
                .build();
    }

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
}
