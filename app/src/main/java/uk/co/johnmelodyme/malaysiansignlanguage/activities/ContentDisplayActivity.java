package uk.co.johnmelodyme.malaysiansignlanguage.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
import uk.co.johnmelodyme.malaysiansignlanguage.components.TopicAdapter;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.Functions;

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

public class ContentDisplayActivity extends AppCompatActivity
{
    public final LogLevel LOG_LEVEL = LogLevel.DEBUG;
    public GridView gridView;
    public TopicAdapter topicAdapter;


    public void render_user_components(Bundle bundle)
    {
        Functions.log_output("render_user_components/1", 0, LOG_LEVEL);

        gridView = (GridView) findViewById(R.id.alphabet_layout);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_display);

        /* Render User Components */
        render_user_components(savedInstanceState);

    }
}