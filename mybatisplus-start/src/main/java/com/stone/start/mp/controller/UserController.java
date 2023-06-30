package com.stone.start.mp.controller;


import com.stone.start.mp.common.CommonResult;
import com.stone.start.mp.dal.entity.User;
import com.stone.start.mp.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author stone
 * @since 2023-06-22
 */
@RestController
@RequestMapping("/shop-user")
@Api(value = "用户信息接口", tags = "用户接口")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user/get-by-id")
    @ApiOperation(value = "根据id获取用户信息接口")
    public CommonResult getUserById(@RequestParam Integer id) {
        User shopUser = this.userService.getById(id);
        return CommonResult.ok(shopUser);
    }

    @PostMapping("/user/add")
    @ApiOperation(value = "添加用户接口")
    public CommonResult addUser(@RequestBody User shopUser) {
        this.userService.save(shopUser);
        return CommonResult.ok();
    }

}

