package com.slabs.uservice.controller;

import com.slabs.uservice.core.response.Result;
import com.slabs.uservice.core.response.ResultGenerator;
import com.slabs.uservice.model.RolePermission;
import com.slabs.uservice.service.RolePermissionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author BingYe
 * @date 2019/03/17
 */
@RestController
@RequestMapping("/role/permission")
public class RolePermissionController {
    @Resource
    private RolePermissionService rolePermissionService;

    @PostMapping
    public Result add(@RequestBody RolePermission rolePermission) {
rolePermissionService.save(rolePermission);
        return ResultGenerator.genOkResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
rolePermissionService.deleteById(id);
        return ResultGenerator.genOkResult();
    }

    @PutMapping
    public Result update(@RequestBody RolePermission rolePermission) {
rolePermissionService.update(rolePermission);
        return ResultGenerator.genOkResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Long id) {
RolePermission rolePermission = rolePermissionService.findById(id);
        return ResultGenerator.genOkResult(rolePermission);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RolePermission> list = rolePermissionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genOkResult(pageInfo);
    }
}
