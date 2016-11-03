package com.nextu.model;

import javax.persistence.*;

public class Clients {
    @Id
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "client_number")
    private String clientNumber;

    private String name;

    private Long rank;

    @Column(name = "rank_people")
    private Long rankPeople;

    /**
     * @return client_id
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * @param clientId
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return rank
     */
    public Long getRank() {
        return rank;
    }

    /**
     * @param rank
     */
    public void setRank(Long rank) {
        this.rank = rank;
    }

    /**
     * @return rank_people
     */
    public Long getRankPeople() {
        return rankPeople;
    }

    /**
     * @param rankPeople
     */
    public void setRankPeople(Long rankPeople) {
        this.rankPeople = rankPeople;
    }
}