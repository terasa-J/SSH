package com.nextu.model;

import javax.persistence.*;

@Table(name = "client_concern")
public class ClientConcern {
    @Id
    @Column(name = "concern_id")
    private Long concernId;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "concerned_client_number")
    private String concernedClientNumber;

    /**
     * @return concern_id
     */
    public Long getConcernId() {
        return concernId;
    }

    /**
     * @param concernId
     */
    public void setConcernId(Long concernId) {
        this.concernId = concernId;
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
     * @return concerned_client_number
     */
    public String getConcernedClientNumber() {
        return concernedClientNumber;
    }

    /**
     * @param concernedClientNumber
     */
    public void setConcernedClientNumber(String concernedClientNumber) {
        this.concernedClientNumber = concernedClientNumber;
    }
}