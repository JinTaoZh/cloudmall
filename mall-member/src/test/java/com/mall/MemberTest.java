package com.mall;

import com.mall.member.MallMemberApplication;
import com.mall.member.entity.MemberEntity;
import com.mall.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zjt
 * @date 2021-04-15
 */
@Slf4j
@SpringBootTest(classes = MallMemberApplication.class)
@RunWith(SpringRunner.class)
public class MemberTest {

    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    @Test
    public void queryTest() {
        List<MemberEntity> list = memberService.list();
        list.forEach(item -> System.out.println(item.toString()));
    }


}
