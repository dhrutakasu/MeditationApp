package com.sound.meditionsoundapp.ui.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.sound.meditionsoundapp.R;
import com.sound.meditionsoundapp.receiver.AlertReceiver;
import com.sound.meditionsoundapp.utils.Constants;
import com.sound.meditionsoundapp.utils.Pref;

import java.util.Calendar;

public class ExerciseTimerActivity extends AppCompatActivity implements View.OnClickListener {
    private Context context;
    private ImageView IvBack;
    private TextView TvTitle;
    private TimePicker PickerSetReminders;
    private LinearLayout LlSetReminders;
    private int IntHr = 12;
    private int IntMin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_timer);
        initViews();
        initListeners();
        initActions();
    }

    private void initViews() {
        context = this;
        IvBack = (ImageView) findViewById(R.id.IvBack);
        TvTitle = (TextView) findViewById(R.id.TvTitle);
        PickerSetReminders = (TimePicker) findViewById(R.id.PickerSetReminders);
        LlSetReminders = (LinearLayout) findViewById(R.id.LlSetReminders);
    }

    private void initListeners() {
        IvBack.setOnClickListener(this);
        LlSetReminders.setOnClickListener(this);
    }

    private void initActions() {
        TvTitle.setText(getString(R.string.meditation_time));

        System.out.println("---- : HR " + new Pref(context).getInt(Constants.NOTIFICATION_HOUR, IntHr));
        System.out.println("---- : MIN " + new Pref(context).getInt( Constants.NOTIFICATION_MINUTES, IntMin));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            PickerSetReminders.setHour(new Pref(context).getInt( Constants.NOTIFICATION_HOUR, IntHr));
            PickerSetReminders.setMinute(new Pref(context).getInt( Constants.NOTIFICATION_MINUTES, IntMin));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.IvBack:
                onBackPressed();
                break;
            case R.id.LlSetReminders:
                GotoSetReminders();
                break;
        }
    }

    private void GotoSetReminders() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Dexter.withActivity(this)
                    .withPermission(Manifest.permission.POST_NOTIFICATIONS)
                    .withListener(new PermissionListener() {
                        @Override
                        public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                IntHr = PickerSetReminders.getHour();
                                IntMin = PickerSetReminders.getMinute();
                            } else {
                                IntHr = PickerSetReminders.getCurrentHour().intValue();
                                IntMin = PickerSetReminders.getCurrentMinute().intValue();
                            }
                            new Pref(context).putBoolean( Constants.ExerciseSetTime, true);
                            new Pref(context).putInt( Constants.NOTIFICATION_HOUR, IntHr);
                            new Pref(context).putInt( Constants.NOTIFICATION_MINUTES, IntMin);
                            Log.d("ReminderCheck", "Reminder set in ExerciseFragment page");
                            Log.d("ReminderCheck", "Reminder set in " + new Pref(context).getInt( Constants.NOTIFICATION_HOUR, IntHr) + ":" + new Pref(context).getInt( Constants.NOTIFICATION_MINUTES, IntMin) + ":0");

                            GotoSetAlarm(new Pref(context).getInt( Constants.NOTIFICATION_HOUR, IntHr), new Pref(context).getInt( Constants.NOTIFICATION_MINUTES, IntMin));
                            onBackPressed();
                        }

                        @Override
                        public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                            showSettingsDialog();
                        }

                        @Override
                        public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                            permissionToken.continuePermissionRequest();
                        }
                    }).withErrorListener(error -> {
                    }).onSameThread().check();
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                IntHr = PickerSetReminders.getHour();
                IntMin = PickerSetReminders.getMinute();
            } else {
                IntHr = PickerSetReminders.getCurrentHour().intValue();
                IntMin = PickerSetReminders.getCurrentMinute().intValue();
            }
            new Pref(context).putBoolean( Constants.ExerciseSetTime, true);
            new Pref(context).putInt( Constants.NOTIFICATION_HOUR, IntHr);
            new Pref(context).putInt( Constants.NOTIFICATION_MINUTES, IntMin);
            Log.d("ReminderCheck", "Reminder set in ExerciseFragment page");
            Log.d("ReminderCheck", "Reminder set in " + new Pref(context).getInt( Constants.NOTIFICATION_HOUR, IntHr) + ":" + new Pref(context).getInt( Constants.NOTIFICATION_MINUTES, IntMin) + ":0");

            GotoSetAlarm(new Pref(context).getInt( Constants.NOTIFICATION_HOUR, IntHr), new Pref(context).getInt( Constants.NOTIFICATION_MINUTES, IntMin));
            onBackPressed();
        }
    }

    private void GotoSetAlarm(int Hr, int Min) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, Hr);
        c.set(Calendar.MINUTE, Min);
        c.set(Calendar.SECOND, 0);

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlertReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(this,1,intent,PendingIntent.FLAG_IMMUTABLE);

        if (c.before(Calendar.getInstance())) {
            c.add(Calendar.DATE, 1);
        }

//        alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo( c.getTimeInMillis(), pendingIntent), pendingIntent);
//        alarmManager.setExact(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), pendingIntent);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, c.getTimeInMillis() - (60 * 1000), AlarmManager.INTERVAL_DAY, pendingIntent);
//        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent);
    }

    private void showSettingsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Need Permissions");
        builder.setMessage("This app needs permission to use this feature. You can grant them in app settings.");
        builder.setPositiveButton("GOTO SETTINGS", (dialog, which) -> {
            dialog.cancel();
            Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
            Uri uri = Uri.fromParts("package", getPackageName(), null);
            intent.setData(uri);
            startActivityForResult(intent, 101);
        });
        builder.setNegativeButton("Cancel", (dialog, which) -> {
            dialog.cancel();
        });
        builder.show();
    }
}