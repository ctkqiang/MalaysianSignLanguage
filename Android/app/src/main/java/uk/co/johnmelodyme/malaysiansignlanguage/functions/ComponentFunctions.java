package uk.co.johnmelodyme.malaysiansignlanguage.functions;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.Snackbar;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.Constants;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;

/**
 * @author John Melody Me <johnmelody@dingtalk.com>
 * <p>
 * This file is part of Malaysian Sign Language.
 * <p>
 * Malaysian Sign Language is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * Malaysian Sign Language is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with Malaysian Sign Language.  If not, see <https://www.gnu.org/licenses/>.
 */

public class ComponentFunctions extends Functions
{
    public static void hide_action_bar(Bundle bundle, AppCompatActivity activity)
    {
        log_output("hide_action_bar/1", 0, LogLevel.DEBUG);

        ActionBar actionBar = activity.getSupportActionBar();
        actionBar.hide();
    }

    /**
     * @param activity The User Current Instances of the Activity
     * @param bundle   The Instance of the class rendered
     */
    public static void render_action_bar(AppCompatActivity activity, Bundle bundle)
    {
        log_output("render_action_bar/2", 0, LogLevel.DEBUG);

        ActionBar actionbar = activity.getSupportActionBar();

        if (actionbar != null)
        {
            actionbar.setBackgroundDrawable(new ColorDrawable(activity.getResources().getColor(R.color.main)));
            activity.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            activity.getSupportActionBar().setCustomView(R.layout.action_bar);
        }
    }

    /**
     * @param activity Get Current UI Instances and renders color to bottom Navigation
     */
    public static void render_bottom_navigation(AppCompatActivity activity)
    {
        log_output("render_bottom_navigation/1", 0, LogLevel.DEBUG);

        activity.getWindow().setNavigationBarColor(ContextCompat.getColor(activity.getApplicationContext(), R.color.main));
    }

    /**
     * @param title   The Title Of the Alert dialogue
     * @param message The content of the dialogue
     * @param context current User's instance
     */
    public static void alert_prompt(String title, String message, Context context)
    {
        log_output("alert_prompt/3", 0, LogLevel.DEBUG);

        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(context);
        builder.setMessage(message).setCancelable(true).setNegativeButton(
                context.getResources().getString(R.string.ok),
                (dialog, which) -> dialog.cancel()
        ).setTitle(title).show();
    }

    /**
     * @param activity current User activity Component
     *                 Render Back Button For Action Bar
     */
    public static void render_back_button_action_bar(AppCompatActivity activity)
    {
        log_output("render_back_button_action_bar/1", 0, LogLevel.DEBUG);

        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * @param view    Get User's Current View Components
     * @param message User Custom input value
     *                #Required
     */
    public static void show_snack_bar(View view, String message)
    {
        log_output("show_snack_bar/2", 0, LogLevel.DEBUG);

        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * @param activity The User Current Activity
     * @param resource The Resources {@code R.mipmap.{#SOMETHING}}
     * @param title    #required User Input Title
     * @param text     #required User Input Text
     */
    public static void show_notification(Activity activity, int resource, String title, String text)
    {
        log_output("show_notification/5", 0, LogLevel.DEBUG);
        NotificationManager notification_manager;
        NotificationChannel notificationChannel;
        NotificationCompat.Builder builder;

        notification_manager = (NotificationManager) activity.getSystemService(
                Context.NOTIFICATION_SERVICE)
        ;

        builder = new NotificationCompat.Builder(activity, Constants.NOTIFICATION_CHANNEL_ID);
        builder.setContentTitle(title);
        builder.setContentText(text);
        builder.setSmallIcon(resource);
        builder.setAutoCancel(true);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O)
        {
            int importance = NotificationManager.IMPORTANCE_HIGH;

            notificationChannel = new NotificationChannel(
                    NOTIFICATION_CHANNEL_ID, "NOTIFICATION", importance
            );

            builder.setChannelId(Constants.NOTIFICATION_CHANNEL_ID);

            assert notification_manager != null;

            notification_manager.createNotificationChannel(notificationChannel);
        }

        assert notification_manager != null;

        notification_manager.notify((int) System.currentTimeMillis(), builder.build());
    }
}
