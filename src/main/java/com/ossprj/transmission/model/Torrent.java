package com.ossprj.transmission.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Torrent {

    /*
        "error": 0,
        "errorString": "",
        "eta": -1,
        "id": 2,
        "isFinished": false,
        "leftUntilDone": 401653760,
        "name": "Aerosmith 1975-09-18 Kiel Auditorium, St. Louis, MO FM (eeklair) Flac16",
        "peersGettingFromUs": 0,
        "peersSendingToUs": 0,
        "rateDownload": 0,
        "rateUpload": 0,
        "sizeWhenDone": 408100797,
        "status": 4,
        "uploadRatio": 0
    * */

    @JsonProperty("activityDate")
    private Long activityDate;          // number | tr_stat

    @JsonProperty("addedDate")
    private Long addedDate;            // number | tr_stat

    @JsonProperty("bandwidthPriority")
    private Long bandwidthPriority;  // number | tr_priority_t

    @JsonProperty("comment")
    private String comment;             // string | tr_info

    @JsonProperty("corruptEver")
    private Long corruptEver;           //      | number                      | tr_stat

    @JsonProperty("creator")
    private String creator;             // string | tr_info

    @JsonProperty("dateCreated")
    private Long dateCreated;         //        | number | tr_info

    @JsonProperty("desiredAvailable")
    private Long desiredAvailable;    //        | number | tr_stat

    @JsonProperty("doneDate")
    private Long doneDate;            //       | number | tr_stat

    @JsonProperty("downloadDir")
    private String downloadDir;       // string | tr_torrent

    @JsonProperty("downloadedEver")
    private Long downloadedEver;     //         | number                      | tr_stat

    @JsonProperty("downloadLimit")
    private Long downloadLimit;      // | number                      | tr_torrent

    @JsonProperty("downloadLimited")
    private Boolean downloadLimited; //             | boolean                     | tr_torrent

    @JsonProperty("editDate")
    private Long editDate; //     | number                      | tr_stat

    @JsonProperty("error")
    private TorrentError error;

    @JsonProperty("errorString")
    private String errorString;

    @JsonProperty("eta")
    private Integer eta;

    @JsonProperty("etaIdle")
    private Integer etaIdle;

    @JsonProperty("file-count")
    private Integer fileCount;

    @JsonProperty("files")
    private List<File> files;

    @JsonProperty("fileStats")
    private List<FileStats> fileStats;

    @JsonProperty("hashString")
    private String hashString;

    @JsonProperty("haveUnchecked")
    private Long haveUnchecked;          //     | number                      | tr_stat

    @JsonProperty("haveValid")
    private Long haveValid;              //    | number                      | tr_stat

    @JsonProperty("honorsSessionLimits")
    private Boolean honorsSessionLimits; //         | boolean                     | tr_torrent

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("isFinished")
    private boolean isFinished;

    @JsonProperty("isPrivate")
    private boolean isPrivate;

    @JsonProperty("isStalled")
    private boolean isStalled;

    @JsonProperty("labels")
    private List<String> labels; //   | array (see below)           | tr_torrent

    @JsonProperty("leftUntilDone")
    private Long leftUntilDone;

    @JsonProperty("magnetLink")
    private String magnetLink;              //                  | string                      | n/a

    @JsonProperty("manualAnnounceTime")
    private Long manualAnnounceTime;        //          | number                      | tr_stat

    @JsonProperty("maxConnectedPeers")
    private Long maxConnectedPeers;         //           | number                      | tr_torrent

    @JsonProperty("metadataPercentComplete")
    private Double metadataPercentComplete; //     | double                      | tr_stat

    @JsonProperty("name")
    private String name;

    // peer-limit                  | number                      | tr_torrent
    // peers                       | array (see below)           | n/a
    // peersConnected              | number                      | tr_stat
    // peersFrom                   | object (see below)          | n/a

    @JsonProperty("peersGettingFromUs")
    private Integer peersGettingFromUs;

    @JsonProperty("peersSendingToUs")
    private Integer peersSendingToUs;

    // percentDone                 | double                      | tr_stat
    // pieces                      | string (see below)          | tr_torrent
    // pieceCount                  | number                      | tr_info
    // pieceSize                   | number                      | tr_info
    // priorities                  | array (see below)           | n/a
    // primary-mime-type           | string                      | tr_torrent
    // queuePosition               | number                      | tr_stat

    @JsonProperty("rateDownload")
    private Integer rateDownload;

    @JsonProperty("rateUpload")
    private Integer rateUpload;

    // recheckProgress             | double                      | tr_stat
    // secondsDownloading          | number                      | tr_stat
    // secondsSeeding              | number                      | tr_stat
    // seedIdleLimit               | number                      | tr_torrent
    // seedIdleMode                | number                      | tr_inactvelimit
    // seedRatioLimit              | double                      | tr_torrent
    // seedRatioMode               | number                      | tr_ratiolimit

    @JsonProperty("sizeWhenDone")
    private Long sizeWhenDone;

    // sizeWhenDone                | number                      | tr_stat
    // startDate                   | number                      | tr_stat

    @JsonProperty("status")
    private TorrentStatus status;

    @JsonProperty("trackerStats")
    private List<TrackerStat> trackerStats;

    @JsonProperty("uploadRatio")
    private Double uploadRatio;

    // wanted                      | array (see below)           | n/a
    // webseeds                    | array (see below)           | n/a
    // webseedsSendingToUs         | number                      | tr_stat

}
