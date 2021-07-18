package uk.co.johnmelodyme.malaysiansignlanguage.constant;


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