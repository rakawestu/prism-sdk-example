package id.rakawm.prism_example;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import io.prismapp.sdk.ui.PrismUi;

/**
 * Created by rakawm on 8/21/17.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
        PrismUi.getInstance().registerUpdatedFcmToken(this, refreshedToken);
    }
}
