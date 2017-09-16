package id.rakawm.prism_example;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import io.prismapp.sdk.ui.PrismUi;

/**
 * Created by rakawm on 8/21/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        String messagePayload = remoteMessage.getData().get(PrismUi.MESSAGE_PAYLOAD);

        handleIncomingMessage(messagePayload);
    }

    private void handleIncomingMessage(String messagePayload) {
        PrismUi.getInstance().handleIncomingMessage(this, messagePayload);
    }
}
