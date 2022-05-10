package com.ossprj.transmission.model;

public enum TorrentError {

    OK,
    WARNING,
    ERROR_TRACKER,
    ERROR_LOCAL;

    /*
    typedef enum
    {
    / * everything's fine * /
    TR_STAT_OK = 0,
    / * when we anounced to the tracker, we got a warning in the response * /
    TR_STAT_TRACKER_WARNING = 1,
    / * when we anounced to the tracker, we got an error in the response * /
    TR_STAT_TRACKER_ERROR = 2,
    / * local trouble, such as disk full or permissions error * /
    TR_STAT_LOCAL_ERROR = 3
    }
    * */
}
