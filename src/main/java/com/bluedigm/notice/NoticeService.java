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
        return noticeMapper.getNoticeList();
    }

    public NoticeDto getNotice(String id) {
        return noticeMapper.getNotice(id);
    }

    public Integer createNotice(NoticeDto noticeDao) {

        return noticeMapper.createNotice(noticeDao);
    }

    public Integer updateNotice(NoticeDto noticeDao) {
        return null;
    }
}
