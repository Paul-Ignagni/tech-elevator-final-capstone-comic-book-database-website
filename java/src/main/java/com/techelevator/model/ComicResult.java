package com.techelevator.model;

import java.util.Date;

public class ComicResult {
    private String title;
    private int serialNumber;
    public int issueNumber;
    public Date releaseDate;
    private ComicImage [] images;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ComicImage[] getImages() {
        return images;
    }

    public void setImages(ComicImage[] images) {
        this.images = images;
    }
}
