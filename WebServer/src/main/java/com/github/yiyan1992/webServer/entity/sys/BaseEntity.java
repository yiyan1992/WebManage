package com.github.yiyan1992.webServer.entity.sys;

import lombok.Data;

import javax.persistence.Transient;
import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {

    @Transient
    private int page;

    @Transient
    private int limit;

}
