package com.nextu.model;

import javax.persistence.*;

@Table(name = "clients_collections_videos")
public class ClientsCollectionsVideos {
    @Id
    @Column(name = "client_collection_video_id")
    private Long clientCollectionVideoId;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "video_number")
    private Long videoNumber;

    /**
     * @return client_collection_video_id
     */
    public Long getClientCollectionVideoId() {
        return clientCollectionVideoId;
    }

    /**
     * @param clientCollectionVideoId
     */
    public void setClientCollectionVideoId(Long clientCollectionVideoId) {
        this.clientCollectionVideoId = clientCollectionVideoId;
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