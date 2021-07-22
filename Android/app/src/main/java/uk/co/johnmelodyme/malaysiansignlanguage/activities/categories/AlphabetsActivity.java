package uk.co.johnmelodyme.malaysiansignlanguage.activities.categories;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
import uk.co.johnmelodyme.malaysiansignlanguage.components.TopicAdapter;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.Constants;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.ComponentFunctions;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.Functions;
import uk.co.johnmelodyme.malaysiansignlanguage.model.TopicItem;

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

public class AlphabetsActivity extends AppCompatActivity
{
    public final LogLevel LOG_LEVEL = LogLevel.DEBUG;
    public GridView gridView;
    public TopicAdapter topicAdapter;
    public ArrayList<TopicItem> topicItemArrayList;

    public void render_user_components(Bundle bundle)
    {
        Functions.log_output("render_user_components/1", 0, LOG_LEVEL);

        gridView = (GridView) findViewById(R.id.alphabet_layout);
        topicItemArrayList = new ArrayList<>();

        for (int i = 0; i < Constants.alphabet_image.length; i++)
        {
            TopicItem topicItem = new TopicItem();
            topicItem.setTopic_image(Constants.alphabet_image[i]);
            topicItem.setTopic_title(Constants.alphabets_title[i]);

            topicItemArrayList.add(topicItem);
        }

        topicAdapter = new TopicAdapter(this, topicItemArrayList);
        gridView.setAdapter(topicAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        /* Disable Dark Mode */
        ComponentFunctions.disable_dark_mode();

        /* Render User Components */
        render_user_components(savedInstanceState);
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