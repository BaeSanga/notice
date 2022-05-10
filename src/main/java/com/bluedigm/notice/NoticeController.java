package com.bluedigm.notice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 테이블 정보는 schema.sql과 data.sql을 참고하세요
 * 서버 실행 후 http://localhost:8080/h2-console 을 통해 데이터 베이스 정보 확인이 가능합니다.
 */

@Controller
public class NoticeController {

    private final NoticeService noticeService;

    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    // 전체 목록 조회
    @GetMapping("/main")
    public String list(Model model) {

        model.addAttribute("noticelist", noticeService.getNoticeList());    // TODO - 이곳에 기능을 넣으세요

        return "list";
    }

    // 개별 조회
    @GetMapping("/{id}")
    public String viewGetNotice(@PathVariable String id, Model model) {

        return "view";
    }

    // 등록 페이지 이동
    @GetMapping("/create")
    public String createNoticeForm() {
        return "create";
    }

    // 등록
    @PostMapping("/create")
    public String createNotice(@ModelAttribute NoticeDto noticeDao) {

        noticeService.createNotice(noticeDao);
        return "redirect:/create";
    }

    // 수정 페이지 이동
    @GetMapping("/update")
    public String updateNoticeForm() {
        return "update";
    }


    // 수정
    @PostMapping("/update")
    public String updateNotice(@ModelAttribute NoticeDto noticeDao) {

        // TODO - 이곳에 기능을 넣으세요

        return "redirect:/";
    }
}
