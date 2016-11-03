package com.nextu.model;

import javax.persistence.*;

@Table(name = "clients_upload_videos")
public class ClientsUploadVideos {
    @Id
    @Column(name = "client_upload_video_id")
    private Long clientUploadVideoId;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "video_number")
    private Long videoNumber;

    /**
     * @return client_upload_video_id
     */
    public Long getClientUploadVideoId() {
        return clientUploadVideoId;
    }

    /**
     * @param clientUploadVideoId
     */
    public void setClientUploadVideoId(Long clientUploadVideoId) {
        this.clientUploadVideoId = clientUploadVideoId;
    }

    /**
     * @return client_number
     */
    public String getClientNumber() {
        return clientNumber;
    }

    /**
     * @param clientNumber
     */
    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
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
}