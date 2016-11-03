package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Videos {
    @Id
    @Column(name = "video_id")
    private Long videoId;

    @Column(name = "video_number")
    private Long videoNumber;

    private String theme;

    private String remark;

    @Column(name = "upload_date")
    private Date uploadDate;

    @Column(name = "download_time")
    private Long downloadTime;

    /**
     * @return video_id
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * @param videoId
     */
    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    /**
     * @return video_number
     */
    public Long getVideoNumber() {
        return videoNumber;
    }

    /**
     * @param videoNumber
     */
    public void setVideoNumber(Long videoNumber) {
        this.videoNumber = videoNumber;
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