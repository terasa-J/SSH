package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "clients_registers")
public class ClientsRegisters {
    @Id
    @Column(name = "client_register_id")
    private Long clientRegisterId;

    @Column(name = "client_number")
    private String clientNumber;

    private String name;

    private String sex;

    private String password;

    @Column(name = "relevant_certificate")
    private String relevantCertificate;

    @Column(name = "individual_resume")
    private String individualResume;

    @Column(name = "register_date")
    private Date registerDate;

    /**
     * @return client_register_id
     */
    public Long getClientRegisterId() {
        return clientRegisterId;
    }

    /**
     * @param clientRegisterId
     */
    public void setClientRegisterId(Long clientRegisterId) {
        this.clientRegisterId = clientRegisterId;
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
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return relevant_certificate
     */
    public String getRelevantCertificate() {
        return relevantCertificate;
    }

    /**
     * @param relevantCertificate
     */
    public void setRelevantCertificate(String relevantCertificate) {
        this.relevantCertificate = relevantCertificate;
    }

    /**
     * @return individual_resume
     */
    public String getIndividualResume() {
        return individualResume;
    }

    /**
     * @param individualResume
     */
    public void setIndividualResume(String individualResume) {
        this.individualResume = individualResume;
    }

    /**
     * @return register_date
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * @param registerDate
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}