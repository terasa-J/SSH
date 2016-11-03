package com.nextu.model;

import javax.persistence.*;

@Table(name = "clients_collections_reviews")
public class ClientsCollectionsReviews {
    @Id
    @Column(name = "client_collection_review_id")
    private Long clientCollectionReviewId;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "last_review_number")
    private Long lastReviewNumber;

    /**
     * @return client_collection_review_id
     */
    public Long getClientCollectionReviewId() {
        return clientCollectionReviewId;
    }

    /**
     * @param clientCollectionReviewId
     */
    public void setClientCollectionReviewId(Long clientCollectionReviewId) {
        this.clientCollectionReviewId = clientCollectionReviewId;
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