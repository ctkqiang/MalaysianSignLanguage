package uk.co.johnmelodyme.malaysiansignlanguage.functions;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

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
}
