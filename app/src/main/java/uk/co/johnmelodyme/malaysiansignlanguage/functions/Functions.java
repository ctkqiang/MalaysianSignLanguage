package uk.co.johnmelodyme.malaysiansignlanguage.functions;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

import uk.co.johnmelodyme.malaysiansignlanguage.constant.Constants;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;

/**
 * @author Johnmelodyme
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

public class Functions extends Constants
{
    public static String TAG = TAG_NAME;

    public static void log_output(@NonNull String string, int _status_, LogLevel logLevel)
    {
        switch (logLevel)
        {
            case DEBUG:
            case INFO:
            case ERROR:
            case VERBOSE:
            case WARN:
            {
                if (_status_ == 0)
                {
                    Log.d(TAG, logLevel.toString() + " {:ok " + string + "}");
                }
                else
                {
                    Log.d(TAG, logLevel.toString() + " {:error " + string + "}");
                }
                break;
            }
            default:
            {
                Log.d(TAG, " {:unknown " + string + "}");
                break;
            }
        }

    }

    /**
     * @param context Current instance of the application are required for
     *                getting user permission either accepted or denied.
     */
    public static void get_user_permission(@NonNull Context context)
    {
        LogLevel permission = LogLevel.DEBUG;

        Dexter.withContext(context).withPermissions(
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CALL_PHONE
        ).withListener(new MultiplePermissionsListener()
        {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport)
            {
                log_output("get_user_permission/1", 0, permission);
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> l,
                                                           PermissionToken pt)
            {

                if (pt != null)
                {
                    log_output("get_user_permission/1", 0, permission);
                }

            }
        }).onSameThread().check();
    }

    /**
     * @param context   required Context for register
     * @param classname required for routing {@link #route_to(Context, Class)}
     */
    public static void route_to(Context context, Class<?> classname)
    {
        log_output("route_to/2, to:" + classname.getSimpleName(), 0, LogLevel.DEBUG);

        Intent navigation = new Intent(context, classname);
        context.startActivity(navigation);
    }

    /**
     * @param activity The Current instance of the activity for opening url in app.
     * @param webView  Link to the webview activity, required for resource
     */
    @SuppressLint("SetJavaScriptEnabled")
    public static void open_url_in_app(@NonNull AppCompatActivity activity, Bundle bundle,
                                       WebView webView)
    {
        String url;

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        bundle = activity.getIntent().getExtras();
        url = bundle.getString("url");

        log_output("open_url_in_app/3", 0, LogLevel.DEBUG);

        webView.animate();
        webView.loadUrl(url);
    }

    public static void parse_url(@NonNull String url, Context context, @NonNull Class<?> classname)
    {
        Intent intent = new Intent(context, classname);
        intent.putExtra("url", url);
        context.startActivity(intent);

        log_output("parse_url/3", 0, LogLevel.DEBUG);
    }
}
