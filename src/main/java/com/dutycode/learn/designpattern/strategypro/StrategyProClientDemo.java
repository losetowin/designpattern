package com.dutycode.learn.designpattern.strategypro;

import com.dutycode.learn.designpattern.strategy.Context;
import com.dutycode.learn.designpattern.strategy.StrategyA;
import com.dutycode.learn.designpattern.strategy.StrategyB;
import com.dutycode.learn.designpattern.strategy.StrategyC;

/**
 * 策略模式+简单工厂客户端调用示例
 * @author zhangzhonghua
 * @version 0.0.1
 * @date 2020-03-31
 */
public class StrategyProClientDemo {

    public static void main(String[] args) {

        ContextFactory contextFactory;

        //策略A
        contextFactory = new ContextFactory(ContextFactory.STARTEGY_A);
        contextFactory.contextAlgorithm();
        //策略B
        contextFactory = new ContextFactory(ContextFactory.STARTEGY_B);
        contextFactory.contextAlgorithm();
        //策略C
        contextFactory = new ContextFactory(ContextFactory.STARTEGY_C);
        contextFactory.contextAlgorithm();



    }
}
