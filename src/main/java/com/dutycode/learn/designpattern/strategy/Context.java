package com.dutycode.learn.designpattern.strategy;

/**
 * 上下文关系，连接客户端和策略
 * @author zhangzhonghua
 * @version 0.0.1
 * @date 2020-03-31
 */
public class Context {

    private AbsStrategy strategy;

    /**
     * 初始化时，传入具体的策略对象
     * @param strategy
     */
    public Context(AbsStrategy strategy){
        this.strategy = strategy;
    }

    /**
     * 根据具体策略对象，执行具体的策略算法
     */
    public void contextAlgorithm(){

        strategy.algorithm();

    }
}
