package com.slabs.uservice.model;

import javax.persistence.*;

public class Permission {
    /**
     * 权限Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 权限对应的资源
     */
    private String resource;

    /**
     * 权限的代码/通配符,对应代码中@hasAuthority(xx)
     */
    private String code;

    /**
     * 对应的资源操作
     */
    private String handle;

    /**
     * 获取权限Id
     *
     * @return id - 权限Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置权限Id
     *
     * @param id 权限Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取权限对应的资源
     *
     * @return resource - 权限对应的资源
     */
    public String getResource() {
        return resource;
    }

    /**
     * 设置权限对应的资源
     *
     * @param resource 权限对应的资源
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * 获取权限的代码/通配符,对应代码中@hasAuthority(xx)
     *
     * @return code - 权限的代码/通配符,对应代码中@hasAuthority(xx)
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置权限的代码/通配符,对应代码中@hasAuthority(xx)
     *
     * @param code 权限的代码/通配符,对应代码中@hasAuthority(xx)
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取对应的资源操作
     *
     * @return handle - 对应的资源操作
     */
    public String getHandle() {
        return handle;
    }

    /**
     * 设置对应的资源操作
     *
     * @param handle 对应的资源操作
     */
    public void setHandle(String handle) {
        this.handle = handle;
    }
}