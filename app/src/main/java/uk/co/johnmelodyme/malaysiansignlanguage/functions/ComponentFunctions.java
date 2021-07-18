package uk.co.johnmelodyme.malaysiansignlanguage.functions;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
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
}
