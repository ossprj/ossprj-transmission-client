package com.ossprj.transmission.model;

public enum TorrentStatus {

    STOPPED,        // = 0, /* Torrent is stopped */
    CHECK_WAIT,     //= 1, / * Queued to check files * /
    CHECK,          //= 2, / * Checking files * /
    DOWNLOAD_WAIT,  //= 3, / * Queued to download * /
    DOWNLOAD,       //= 4, / * Downloading * /
    SEED_WAIT,      //= 5, / * Queued to seed * /
    SEED;           //= 6  / * Seeding * /


    /*{
        TR_STATUS_STOPPED        = 0, / * Torrent is stopped * /
        TR_STATUS_CHECK_WAIT     = 1, / * Queued to check files * /
        TR_STATUS_CHECK          = 2, / * Checking files * /
        TR_STATUS_DOWNLOAD_WAIT  = 3, / * Queued to download * /
        TR_STATUS_DOWNLOAD       = 4, / * Downloading * /
        TR_STATUS_SEED_WAIT      = 5, / * Queued to seed * /
        TR_STATUS_SEED           = 6  / * Seeding * /
    }*/

}
