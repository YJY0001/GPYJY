package com.jy.design.prototype.deepclone;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/2/7 0007
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        try{
            QiTianDaSheng qtds = new QiTianDaSheng();
            QiTianDaSheng qtdsClone = (QiTianDaSheng)qtds.clone();
            System.out.println(qtds.getJingGuBang() == qtdsClone.getJingGuBang());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
