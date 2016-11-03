package com.nextu.model;

import javax.persistence.*;

@Table(name = "clients_comments")
public class ClientsComments {
    @Id
    @Column(name = "client_comment_id")
    private Long clientCommentId;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "comment_content")
    private String commentContent;

    @Column(name = "live_room_number")
    private Long liveRoomNumber;

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
     * @return comment_content
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * @param commentContent
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
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
}