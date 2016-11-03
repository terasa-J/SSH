package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "clients_comments_return")
public class ClientsCommentsReturn {
    @Id
    @Column(name = "client_comment_return_id")
    private Long clientCommentReturnId;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "client_comment_id")
    private Long clientCommentId;

    @Column(name = "return_content")
    private String returnContent;

    @Column(name = "return_comment_date")
    private Date returnCommentDate;

    /**
     * @return client_comment_return_id
     */
    public Long getClientCommentReturnId() {
        return clientCommentReturnId;
    }

    /**
     * @param clientCommentReturnId
     */
    public void setClientCommentReturnId(Long clientCommentReturnId) {
        this.clientCommentReturnId = clientCommentReturnId;
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
     * @return client_comment_id
     */
    public Long getClientCommentId() {
        return clientCommentId;
    }

    /**
     * @param clientCommentId
     */
    public void setClientCommentId(Long clientCommentId) {
        this.clientCommentId = clientCommentId;
    }

    /**
     * @return return_content
     */
    public String getReturnContent() {
        return returnContent;
    }

    /**
     * @param returnContent
     */
    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent;
    }

    /**
     * @return return_comment_date
     */
    public Date getReturnCommentDate() {
        return returnCommentDate;
    }

    /**
     * @param returnCommentDate
     */
    public void setReturnCommentDate(Date returnCommentDate) {
        this.returnCommentDate = returnCommentDate;
    }
}