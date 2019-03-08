package com.jy.design.factory.simplefactory;

import com.jy.design.factory.simplefactory.entity.Catagory;
import com.jy.design.factory.simplefactory.entity.Issue;
import com.jy.design.factory.simplefactory.entity.JingDongIssue;
import com.jy.design.factory.simplefactory.entity.TaoBaoIssue;

/**
 * @author Administrator
 * @ClassName IssueFactory
 * @Description TODO
 * @Date 2019/2/4 0004
 * @Version 1.0
 */
public class IssueFactory {

    private IssueFactory(){}

    public static Issue createIssue(Catagory catagory){
          switch (catagory){
              case TAOBAO:
                  return new TaoBaoIssue();
              case JINGDONG:
                  return new JingDongIssue();
              default:
                  System.out.println("没有该商品!");
                  break;
          }
          return null;
    }
}
