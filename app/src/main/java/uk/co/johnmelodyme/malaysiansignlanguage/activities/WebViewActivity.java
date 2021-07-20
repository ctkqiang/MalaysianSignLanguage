package uk.co.johnmelodyme.malaysiansignlanguage.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.ComponentFunctions;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.Functions;


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

public class WebViewActivity extends AppCompatActivity
{
    public static final LogLevel LOG_LEVEL = LogLevel.DEBUG;
    public ProgressBar progressBar;
    public WebView webView;

    /**
     * @param bundle required for user interface rendering at
     *               beginning of the Instance.
     */
    public void render_user_interface_components(Bundle bundle)
    {
        Functions.log_output("render_user_interface_components/1", 0, LOG_LEVEL);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon)
            {
                set_progress_bar_visibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url)
            {
                super.onPageFinished(view, url);
                set_progress_bar_visibility(View.GONE);

            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request,
                                        WebResourceError error)
            {
                super.onReceivedError(view, request, error);
                set_progress_bar_visibility(View.GONE);
            }
        });

        /* Render WebView */
        Functions.open_url_in_app(WebViewActivity.this, bundle, webView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        /* Render Back Button :: Action Bar */
        ComponentFunctions.render_back_button_action_bar(this);

        /* Render User Interface Components */
        render_user_interface_components(savedInstanceState);
    }

    private void set_progress_bar_visibility(int visibility)
    {
        if (progressBar != null)
        {
            Functions.log_output("set_progress_bar_visibility/1", 0, LOG_LEVEL);

            progressBar.setVisibility(visibility);
        }
    }

    @Override
    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }

    /**
     * Called when the activity h as detected the user's press of the back
     * key. The {@link #getOnBackPressedDispatcher() OnBackPressedDispatcher} will be given a
     * chance to handle the back button before the default behavior of
     * {@link Activity#onBackPressed()} is invoked.
     *
     * @see #getOnBackPressedDispatcher()
     */
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}