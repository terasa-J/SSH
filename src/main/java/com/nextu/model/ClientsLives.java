package com.nextu.model;

import javax.persistence.*;

@Table(name = "clients_lives")
public class ClientsLives {
    @Id
    @Column(name = "client_live_id")
    private Long clientLiveId;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "live_room_number")
    private Long liveRoomNumber;

    @Column(name = "live_room_people")
    private Long liveRoomPeople;

    /**
     * @return client_live_id
     */
    public Long getClientLiveId() {
        return clientLiveId;
    }

    /**
     * @param clientLiveId
     */
    public void setClientLiveId(Long clientLiveId) {
        this.clientLiveId = clientLiveId;
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
     * @return live_room_number
     */
    public Long getLiveRoomNumber() {
        return liveRoomNumber;
    }

    /**
     * @param liveRoomNumber
     */
    public void setLiveRoomNumber(Long liveRoomNumber) {
        this.liveRoomNumber = liveRoomNumber;
    }

    /**
     * @return live_room_people
     */
    public Long getLiveRoomPeople() {
        return liveRoomPeople;
    }

    /**
     * @param liveRoomPeople
     */
    public void setLiveRoomPeople(Long liveRoomPeople) {
        this.liveRoomPeople = liveRoomPeople;
    }
}