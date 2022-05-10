package com.bluedigm.notice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    private final NoticeMapper noticeMapper;

    public NoticeService(NoticeMapper noticeMapper) {
        this.noticeMapper = noticeMapper;
    }

    public List<NoticeDto> getNoticeList() {
        return null;   // TODO - 잘못된 코드입니다. 정상적으로 동작하도록 수정하세요.
    }

    public NoticeDto getNotice() {
        return null;    // TODO - 잘못된 코드입니다. 정상적으로 동작하도록 수정하세요.
    }

    public Integer createNotice(NoticeDto noticeDao) {

        return null;    // TODO - 잘못된 코드입니다. 정상적으로 동작하도록 수정하세요.
    }

    public Integer updateNotice(NoticeDto noticeDao) {
        return null;    // TODO - 잘못된 코드입니다. 정상적으로 동작하도록 수정하세요.
    }
}
