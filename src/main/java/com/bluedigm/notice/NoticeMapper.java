package com.bluedigm.notice;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

//Mapper.xml 과 Mapper.java를 연결해주는 방식은 NameSpace와 각 쿼리문의 id의 조합
@Mapper
public interface NoticeMapper {

    List<NoticeDto> getNoticeList();
    NoticeDto getNotice(Integer id);
    Integer createNotice(NoticeDto noticeDto);
    Integer updateNotice(NoticeDto noticeDto);
    Integer Hit(Integer id);
}
