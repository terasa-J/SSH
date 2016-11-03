package com.nextu.model;

import javax.persistence.*;

@Table(name = "clients_upload_reviews")
public class ClientsUploadReviews {
    @Id
    @Column(name = "client_upload_review_id")
    private Long clientUploadReviewId;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "last_review_number")
    private Long lastReviewNumber;

    /**
     * @return client_upload_review_id
     */
    public Long getClientUploadReviewId() {
        return clientUploadReviewId;
    }

    /**
     * @param clientUploadReviewId
     */
    public void setClientUploadReviewId(Long clientUploadReviewId) {
        this.clientUploadReviewId = clientUploadReviewId;
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
}