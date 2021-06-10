package com.mall.member.controller;

import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;
import com.mall.member.entity.MemberEntity;
import com.mall.member.feign.CouponRPCService;
import com.mall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员
 *
 * @author zjt
 * @email zjintao12581@gmail.com
 * @date 2021-04-15 11:32:34
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    private CouponRPCService couponRPCService;

    @Autowired
    public void setCouponRPCService(CouponRPCService couponRPCService) {
        this.couponRPCService = couponRPCService;
    }

    @GetMapping("/coupon")
    public R getUserCoupon() {
        return couponRPCService.getAllCouponByUser();
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
