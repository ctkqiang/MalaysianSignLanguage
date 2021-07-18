package uk.co.johnmelodyme.malaysiansignlanguage.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.Constants;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.ComponentFunctions;

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

public class SplashActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /* Hide Action Bar */
        ComponentFunctions.hide_action_bar(savedInstanceState, this);

        on_intent(savedInstanceState);
    }

    /**
     * @param bundle Current State Instance
     *               On Navigate to
     *               {@link MalaysianSignLanguageActivity}
     */
    public void on_intent(Bundle bundle)
    {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                ComponentFunctions.route_to(SplashActivity.this, MalaysianSignLanguageActivity.class);

                finish();
            }
        }, Constants.SPLASH_SCREEN_TIME_OUT);
    }
}