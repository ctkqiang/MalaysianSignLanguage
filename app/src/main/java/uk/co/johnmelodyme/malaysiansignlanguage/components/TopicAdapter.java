package uk.co.johnmelodyme.malaysiansignlanguage.components;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
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

public class TopicAdapter extends ArrayAdapter
{
    public Context context;
    public int layout_id;
    public ArrayList data = new ArrayList();

    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     */
    public TopicAdapter(@NonNull Context context, int resource, ArrayList data)
    {
        super(context, resource, data);

        this.layout_id = resource;
        this.context = context;
        this.data = data;
    }

    public static class ViewHolder
    {
        TextView title_topic;
        ImageView image_topic;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = convertView;
        ViewHolder holder = null;

        holder = new ViewHolder();

        if (view == null)
        {
            LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();

            view = layoutInflater.inflate(layout_id, parent, false);

            holder.image_topic = (ImageView) view.findViewById(R.id.topic_image);
            holder.title_topic = (TextView) view.findViewById(R.id.topic_title);

            view.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) view.getTag();
        }

        TopicItem topicItem = (TopicItem) data.get(position);

        holder.title_topic.setText(topicItem.getTopic_title());
        holder.image_topic.setImageBitmap(topicItem.getTopic_image());

        return view;
    }

}
