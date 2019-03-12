package com.jy.design.prototype.deepclone;

import java.io.*;
import java.util.Date;

/**
 * @author Administrator
 * @ClassName QiTianDaSheng
 * @Description 深克隆
 * @Date 2019/2/7 0007
 * @Version 1.0
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    private JingGuBang jingGuBang;

    public QiTianDaSheng(){
        this.setBirthday(new Date());
        this.setJingGuBang(new JingGuBang());
    }

    public JingGuBang getJingGuBang() {
        return jingGuBang;
    }

    public void setJingGuBang(JingGuBang jingGuBang) {
        this.jingGuBang = jingGuBang;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return this.deepClone();
    }


    public Object deepClone(){

        QiTianDaSheng copy = null;

        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            copy = (QiTianDaSheng)ois.readObject();
            copy.setBirthday(new Date());
        }catch (Exception e){
            e.printStackTrace();
        }
        return copy;
    }
}
