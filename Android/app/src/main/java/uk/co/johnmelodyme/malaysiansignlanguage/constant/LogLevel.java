package uk.co.johnmelodyme.malaysiansignlanguage.constant;

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

public enum LogLevel
{
    DEBUG
            {
                public String toString()
                {
                    return Constants.DEBUG_LEVEL;
                }
            },
    ERROR
            {
                public String toString()
                {
                    return Constants.ERROR_LEVEL;
                }
            },
    WARN
            {
                public String toString()
                {
                    return Constants.WARN_LEVEL;
                }
            },
    INFO
            {
                public String toString()
                {
                    return Constants.INFO_LEVEL;
                }
            },
    VERBOSE
            {
                public String toString()
                {
                    return Constants.VERBOSE_LEVEL;
                }
            }
}