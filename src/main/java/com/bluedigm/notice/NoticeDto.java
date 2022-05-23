package com.bluedigm.notice;
import java.time.LocalDateTime;
//데이터 전송 객체
//DB에서 데이터를 얻어 Service나  Controller등으로 보낼때 사용하는 객체
public class NoticeDto {

    private int id;
    private String userId;
    private String title;
    private String contents;
    private LocalDateTime regDate;
    private int hit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public LocalDateTime  getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime  regDate) {
        this.regDate = regDate;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
