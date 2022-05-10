package com.ossprj.transmission.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrackerStat {

    //announceState 	number 	tr_tracker_view
    //announce 	string 	tr_tracker_view
    //downloadCount 	number 	tr_tracker_view
    //hasAnnounced 	boolean 	tr_tracker_view
    //hasScraped 	boolean 	tr_tracker_view
    //host 	string 	tr_tracker_view
    //id 	number 	tr_tracker_view
    //isBackup 	boolean 	tr_tracker_view
    //lastAnnouncePeerCount 	number 	tr_tracker_view
    //lastAnnounceResult 	string 	tr_tracker_view
    //lastAnnounceStartTime 	number 	tr_tracker_view
    //lastAnnounceSucceeded 	boolean 	tr_tracker_view
    //lastAnnounceTime 	number 	tr_tracker_view
    //lastAnnounceTimedOut 	boolean 	tr_tracker_view
    //lastScrapeResult 	string 	tr_tracker_view
    //lastScrapeStartTime 	number 	tr_tracker_view
    //lastScrapeSucceeded 	boolean 	tr_tracker_view
    //lastScrapeTime 	number 	tr_tracker_view
    //lastScrapeTimedOut 	boolean 	tr_tracker_view

    //leecherCount 	number 	tr_tracker_view
    @JsonProperty("leecherCount")
    private Integer leecherCount;

    //nextAnnounceTime 	number 	tr_tracker_view
    //nextScrapeTime 	number 	tr_tracker_view
    //scrapeState 	number 	tr_tracker_view
    //scrape 	string 	tr_tracker_view
    //seederCount 	number 	tr_tracker_view

    @JsonProperty("seederCount")
    private Integer seederCount;

    //sitename 	string 	tr_tracker_view
    //tier 	number 	tr_tracker_view


}
