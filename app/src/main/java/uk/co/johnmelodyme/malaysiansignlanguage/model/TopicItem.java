package uk.co.johnmelodyme.malaysiansignlanguage.model;

import android.graphics.Bitmap;

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

public class TopicItem
{
    public Bitmap topic_image;
    public String topic_title;

    public TopicItem(Bitmap topic_image, String topic_title)
    {
        this.topic_image = topic_image;
        this.topic_title = topic_title;
    }

    public Bitmap getTopic_image()
    {
        return topic_image;
    }

    public void setTopic_image(Bitmap topic_image)
    {
        this.topic_image = topic_image;
    }

    public String getTopic_title()
    {
        return topic_title;
    }

    public void setTopic_title(String topic_title)
    {
        this.topic_title = topic_title;
    }
}
