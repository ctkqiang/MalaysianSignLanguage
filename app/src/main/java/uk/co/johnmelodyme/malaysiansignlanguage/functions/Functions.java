package uk.co.johnmelodyme.malaysiansignlanguage.functions;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;

import uk.co.johnmelodyme.malaysiansignlanguage.constant.Constants;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;

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

public class Functions extends Constants
{
    public static String TAG = TAG_NAME;

    public static void log_output(@NonNull String string, int ok, LogLevel logLevel)
    {
        switch (logLevel)
        {
            case DEBUG:
            case INFO:
            case ERROR:
            case VERBOSE:
            case WARN:
            {
                if (ok == 0)
                {
                    Log.d(TAG, logLevel.toString() + " {:ok " + string + "}");
                }
                else
                {
                    Log.d(TAG, logLevel.toString() + " {:error " + string + "}");
                }
                break;
            }
            default:
            {
                Log.d(TAG, " {:unknown " + string + "}");
                break;
            }
        }

    }

    /**
     * @param context   required Context for register
     * @param classname required for routing {@link #route_to(Context, Class)}
     */
    public static void route_to(Context context, Class<?> classname)
    {
        log_output("route_to/2, to:" + classname.getSimpleName(), 0, LogLevel.DEBUG);

        Intent navigation = new Intent(context, classname);
        context.startActivity(navigation);
    }

}
