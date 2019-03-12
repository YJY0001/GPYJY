package com.jy.design.prototype.deepclone;

import java.io.Serializable;

/**
 * @author Administrator
 * @ClassName JingGuBang
 * @Description TODO
 * @Date 2019/2/7 0007
 * @Version 1.0
 */
public class JingGuBang implements Serializable {

    private float h = 100;
    private float d = 10;

    public void big(){
        this.h = this.h * 2;
        this.d = this.d * 2;
    }

    public void small(){
        this.h = this.h / 2;
        this.d = this.d / 2;
    }
}
