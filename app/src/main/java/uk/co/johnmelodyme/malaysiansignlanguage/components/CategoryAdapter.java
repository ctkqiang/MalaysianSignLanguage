package uk.co.johnmelodyme.malaysiansignlanguage.components;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.Constants;

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

public class CategoryAdapter extends ArrayAdapter<String>
{
    public Activity activity;
    public String[] title;
    public int[] image;


    /**
     * @param activity The Current activity
     * @param title   The User Input Title of Categories
     * @param image   The User Input Image of Categories
     */
    public CategoryAdapter(@NonNull Activity activity, String[] title, int[] image)
    {
        super(activity, R.layout.category_item, title);
        this.activity = activity;
        this.title = title;
        this.image = image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View view;
        LayoutInflater layoutInflater;

        layoutInflater = activity.getLayoutInflater();
        view = layoutInflater.inflate(R.layout.category_item, null , true);

        TextView title = (TextView) view.findViewById(R.id.category_title);
        ImageView image = (ImageView) view.findViewById(R.id.category_image);

        title.setText(Constants.category_title[position]);
        image.setImageResource(Constants.category_image[position]);

        return view;
    }
}
