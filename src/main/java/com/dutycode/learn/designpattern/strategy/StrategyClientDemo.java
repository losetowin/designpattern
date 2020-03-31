package com.dutycode.learn.designpattern.strategy;

/**
 * 策略模式客户端调用示例
 * @author zhangzhonghua
 * @version 0.0.1
 * @date 2020-03-31
 */
public class StrategyClientDemo {

    public static void main(String[] args) {

        Context context;

        //策略A
        context = new Context(new StrategyA());
        context.contextAlgorithm();

        //策略B
        context = new Context(new StrategyB());
        context.contextAlgorithm();

        //策略C
        context = new Context(new StrategyC());
        context.contextAlgorithm();



    }
}
