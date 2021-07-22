/*
 * Copyright  © John Melody Me , 2024 - 2030
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package uk.co.johnmelodyme.malaysiansignlanguage.activities.categories;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
import uk.co.johnmelodyme.malaysiansignlanguage.components.TopicAdapter;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.Constants;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.ComponentFunctions;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.Functions;
import uk.co.johnmelodyme.malaysiansignlanguage.model.TopicItem;

public class NumbersActivity extends AppCompatActivity
{
    public final LogLevel LOG_LEVEL = LogLevel.DEBUG;
    public GridView gridView;
    public TopicAdapter topicAdapter;
    public ArrayList<TopicItem> topicItemArrayList;

    public void render_user_components(Bundle bundle)
    {
        Functions.log_output("render_user_components/1", 0, LOG_LEVEL);

        gridView = (GridView) findViewById(R.id.number_layout);
        topicItemArrayList = new ArrayList<>();

        for (int i = 0; i < Constants.numbers_image.length; i++)
        {
            TopicItem topicItem = new TopicItem();
            topicItem.setTopic_image(Constants.numbers_image[i]);
            topicItem.setTopic_title(Constants.numbers_title[i]);

            topicItemArrayList.add(topicItem);
        }

        topicAdapter = new TopicAdapter(this, topicItemArrayList);
        gridView.setAdapter(topicAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

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