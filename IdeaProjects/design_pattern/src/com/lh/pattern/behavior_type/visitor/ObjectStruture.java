package com.lh.pattern.behavior_type.visitor;

import java.util.Random;

public class ObjectStruture {
    // 对象生成器 通过一个方法来模拟
    public static Element createElement(){
        Random random = new Random();
        if(random.nextInt(100) > 50){
            return new ConcreteElement1();
        }else{
            return new ConcreteElement2();
        }
    }
}
