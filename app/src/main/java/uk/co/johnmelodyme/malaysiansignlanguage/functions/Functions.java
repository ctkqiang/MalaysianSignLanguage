package uk.co.johnmelodyme.malaysiansignlanguage.functions;

import android.util.Log;

import androidx.annotation.NonNull;

import uk.co.johnmelodyme.malaysiansignlanguage.constant.Constants;
import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;

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
}
