package com.dutycode.learn.designpattern.strategypro;

import com.dutycode.learn.designpattern.strategy.AbsStrategy;
import com.dutycode.learn.designpattern.strategy.StrategyA;
import com.dutycode.learn.designpattern.strategy.StrategyB;
import com.dutycode.learn.designpattern.strategy.StrategyC;

/**
 * 策略工厂，策略模式+简单工厂模式
 * @author zhangzhonghua
 * @version 0.0.1
 * @date 2020-03-31
 */
public class ContextFactory {

    /**
     * 策略A
     */
    final static int STARTEGY_A = 1;
    /**
     * 策略B
     */
    final static int STARTEGY_B = 2;
    /**
     * 策略C
     */
    final static int STARTEGY_C = 3;

    private AbsStrategy strategy = null;

    /**
     * 结合工厂，将策略对象初始化放在Context中处理。对外不暴露实例化细节
     * @param algorithmType
     */
    public ContextFactory(int algorithmType){
        switch (algorithmType){
            case STARTEGY_A:
                strategy = new StrategyA();
                break;
            case STARTEGY_B:
                strategy = new StrategyB();
                break;
            case STARTEGY_C:
                strategy = new StrategyC();
                break;
            default:break;
        }
    }

    public void contextAlgorithm(){
        strategy.algorithm();
    }



}
