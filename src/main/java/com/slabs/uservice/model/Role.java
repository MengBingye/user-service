package com.slabs.uservice.model;

import javax.persistence.*;

public class Role {
    /**
     * 角色Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 获取角色Id
     *
     * @return id - 角色Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置角色Id
     *
     * @param id 角色Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }
}