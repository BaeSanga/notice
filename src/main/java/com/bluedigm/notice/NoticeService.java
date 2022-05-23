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

    public NoticeDto getNotice(Integer id) {
        return noticeMapper.getNotice(id);
    }

    public Integer createNotice(NoticeDto noticeDto) {

        return noticeMapper.createNotice(noticeDto);
    }

    public Integer updateNotice(NoticeDto noticeDto) {
        return noticeMapper.updateNotice(noticeDto);
    }

    public Integer Hit(Integer id){
        return noticeMapper.Hit(id);
    }
}
