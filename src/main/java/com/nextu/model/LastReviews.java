package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "last_reviews")
public class LastReviews {
    @Id
    @Column(name = "last_review_id")
    private Long lastReviewId;

    @Column(name = "last_review_number")
    private Long lastReviewNumber;

    private String theme;

    private String remark;

    @Column(name = "upload_date")
    private Date uploadDate;

    @Column(name = "download_time")
    private Long downloadTime;

    /**
     * @return last_review_id
     */
    public Long getLastReviewId() {
        return lastReviewId;
    }

    /**
     * @param lastReviewId
     */
    public void setLastReviewId(Long lastReviewId) {
        this.lastReviewId = lastReviewId;
    }

    /**
     * @return last_review_number
     */
    public Long getLastReviewNumber() {
        return lastReviewNumber;
    }

    /**
     * @param lastReviewNumber
     */
    public void setLastReviewNumber(Long lastReviewNumber) {
        this.lastReviewNumber = lastReviewNumber;
    }

    /**
     * @return theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return upload_date
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * @param uploadDate
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * @return download_time
     */
    public Long getDownloadTime() {
        return downloadTime;
    }

    /**
     * @param downloadTime
     */
    public void setDownloadTime(Long downloadTime) {
        this.downloadTime = downloadTime;
    }
}