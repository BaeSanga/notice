package com.bluedigm.notice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NoticeController {

    private final NoticeService noticeService;                      

    public NoticeController(NoticeService noticeService) {          //private은 클래스 외부에서 이 변수를 마음대로 접근할 수 없게 돼서
                                                                    //어떤 객체를 인스턴스로 생성할 때 이 변수들에 일정한값을 주며 생성하기 위해선 생성자이용
        this.noticeService = noticeService;
    }

    // 전체 목록 조회                                                     //get은 서버에서 어떤 데이터를 가져와서 보여줄때 사용
    @GetMapping("/main")
    public String list(Model model) {
        model.addAttribute("list", noticeService.getNoticeList());      //이름, 넘길값
        return "list";
    }

    // 상세 조회
    @GetMapping("/main/{id}")                                      //{ } 안에 들어있는 이름과 @PathVariable를 사용한 변수명이 일치해야 한다.
                                                                     //주소 뒤에 {id} 이렇게 id를 받을 때는 @PathVariable을 사용하면 주소의 id로 받음.
    public String viewGetNotice(@PathVariable Integer id, Model model) {
        model.addAttribute("point", noticeService.getNotice(id));
        noticeService.Hit(id);
        return "view";
    }

    // 등록 페이지 이동
    @GetMapping("/create")
    public String createNoticeForm() {
        return "create";
    }

    // 등록
    @PostMapping("/create")                                                //post는 서버상의 데이터 값이나 상태를 바꾸기 위해서 사용
    public String createNotice(@ModelAttribute NoticeDto noticeDto) {
        noticeService.createNotice(noticeDto);
        return "redirect:/main";
    }

    // 수정 페이지 이동
    @GetMapping("/update/{id}")
    public String updateNoticeForm(@PathVariable Integer id, Model model) {
        model.addAttribute("update", noticeService.getNotice(id));
        return "update";
    }

    // 수정
    @PostMapping("/update")
    public String updateNotice(@ModelAttribute NoticeDto noticeDto) {
        noticeService.updateNotice(noticeDto);
        return "redirect:/main";
    }
}
