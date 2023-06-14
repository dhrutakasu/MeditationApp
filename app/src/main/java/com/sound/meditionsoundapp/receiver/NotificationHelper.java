package com.sound.meditionsoundapp.receiver;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

import com.sound.meditionsoundapp.R;

public class NotificationHelper extends ContextWrapper {
    public static final String channelID = "CHANNEL_ID";
    public static final String channelName = "CHANNEL_NAME";

    private NotificationManager mManager;

    public NotificationHelper(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChannel();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createChannel() {
        NotificationChannel channel = new NotificationChannel(channelID, channelName, NotificationManager.IMPORTANCE_HIGH);

        getManager().createNotificationChannel(channel);
    }

    public NotificationManager getManager() {
        if (mManager == null) {
            mManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        return mManager;
    }

    public NotificationCompat.Builder getChannelNotification(Context context) {
        return new NotificationCompat.Builder(getApplicationContext(), channelID)
                .setContentTitle(context.getString(R.string.app_name))
                .setContentText(context.getString(R.string.notification_msg))
                .setSmallIcon(R.mipmap.ic_launcher);
    }
}
