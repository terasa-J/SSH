package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "live_rooms")
public class LiveRooms {
    @Id
    @Column(name = "live_room_id")
    private Long liveRoomId;

    @Column(name = "live_room_number")
    private Long liveRoomNumber;

    private String theme;

    private String remark;

    @Column(name = "show_picture")
    private String showPicture;

    @Column(name = "create_date")
    private Date createDate;

    /**
     * @return live_room_id
     */
    public Long getLiveRoomId() {
        return liveRoomId;
    }

    /**
     * @param liveRoomId
     */
    public void setLiveRoomId(Long liveRoomId) {
        this.liveRoomId = liveRoomId;
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
     * @return theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return show_picture
     */
    public String getShowPicture() {
        return showPicture;
    }

    /**
     * @param showPicture
     */
    public void setShowPicture(String showPicture) {
        this.showPicture = showPicture;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}