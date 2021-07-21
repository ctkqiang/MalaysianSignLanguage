package uk.co.johnmelodyme.malaysiansignlanguage.constant;

import uk.co.johnmelodyme.malaysiansignlanguage.R;
import uk.co.johnmelodyme.malaysiansignlanguage.components.CategoryAdapter;

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

public class Constants
{
    /* Application Name */
    public static final String APP_NAME = "Malaysian Sign Language";

    /**
     * Defines several constants used between
     * {@link uk.co.johnmelodyme.malaysiansignlanguage.activities.MalaysianSignLanguageActivity}
     * {@link uk.co.johnmelodyme.malaysiansignlanguage.activities.WebViewActivity}
     * {@link uk.co.johnmelodyme.malaysiansignlanguage.activities.SplashActivity}
     * {@link CategoryAdapter}
     * {@link uk.co.johnmelodyme.malaysiansignlanguage.functions.ComponentFunctions}
     * {@link uk.co.johnmelodyme.malaysiansignlanguage.functions.Functions}
     */

    /* Debugging */
    public static String TAG_NAME = "MSL";

    /* Log Level */
    public static String DEBUG_LEVEL = "[DEBUG] -> ";
    public static String INFO_LEVEL = "[INFO] -> ";
    public static String ERROR_LEVEL = "[ERROR] -> ";
    public static String WARN_LEVEL = "[WARNING] -> ";
    public static String VERBOSE_LEVEL = "[VERBOSE] -> ";

    public static String DEV_PROFILE_URL = "https://tinyurl.com/johnmelodyme";
    public static String FORUM_URL = "https://tinyurl.com/33umw6jf";

    public static String NOTIFICATION_CHANNEL_ID = "default";

    /* Splash Screen Time OUt Set To Be 2000 m/s */
    public static int SPLASH_SCREEN_TIME_OUT = 0x7d0;

    /**
     * Category Title and Image
     * Of Malaysian Sign Language on the
     * {@link uk.co.johnmelodyme.malaysiansignlanguage.activities.MalaysianSignLanguageActivity}
     */
    public static String[] category_title = {
            "Alphabets",
            "Numbers",
            "Greetings",
            "Questions",
            "Adjectives",
            "Colours",
            "Family",
            "Time",
            "Nature",
            "Date",
            "Religion & Culture",
            "Public Holidays",
            "Animals",
            "Food & Beverages",
            "Health & Medicine",
            "Establishments",
            "Sentiments",
            "States in Malaysia"
    };

    public static int[] category_image = {
            R.mipmap.alphabet,
            R.mipmap.numbers,
            R.mipmap.greeting,
            R.mipmap.questions,
            R.mipmap.adjectives,
            R.mipmap.colours,
            R.mipmap.family,
            R.mipmap.time,
            R.mipmap.nature,
            R.mipmap.date,
            R.mipmap.religion,
            R.mipmap.holiday,
            R.mipmap.animals,
            R.mipmap.fnb,
            R.mipmap.health,
            R.mipmap.establishments,
            R.mipmap.sentiments,
            R.mipmap.malaysianstates
    };

    public static String[] alphabets_title = {
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z"
    };

    public static int[] alphabet_image = {
            R.mipmap.a,
            R.mipmap.b,
            R.mipmap.c,
            R.mipmap.d,
            R.mipmap.e,
            R.mipmap.f,
            R.mipmap.g,
            R.mipmap.h,
            R.mipmap.i,
            R.mipmap.j,
            R.mipmap.k,
            R.mipmap.l,
            R.mipmap.m,
            R.mipmap.n,
            R.mipmap.o,
            R.mipmap.p,
            R.mipmap.q,
            R.mipmap.r,
            R.mipmap.s,
            R.mipmap.t,
            R.mipmap.u,
            R.mipmap.v,
            R.mipmap.w,
            R.mipmap.x,
            R.mipmap.y,
            R.mipmap.z
    };
}
