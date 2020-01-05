package com.dongzhi.spring.cloud.configclient.demo;

import java.util.*;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/1/4 22:02
 * @description：spring cloud config事件机制-观察者模式
 * @modified By：
 * @version: 1.0$
 */
public class ObserverDemo {

    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        //增加订阅者
        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(arg);
            }
        });
        observable.setChanged();
        //发布者通知，订阅者是被动感知（推模式）
        observable.notifyObservers("Hello,World");

        echoIterator();
    }

    private static void echoIterator(){
        List<Integer> values = Arrays.asList(1,2,3,4,5);
        Iterator<Integer> integerIterable = values.iterator();
        //通过循环，主动去获取
        while (integerIterable.hasNext()){
            System.out.println(integerIterable.next());
        }
    }
    public static class MyObservable extends Observable{
        @Override
        public void setChanged(){
            super.setChanged();
        }
    }
}
