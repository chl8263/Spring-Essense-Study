package com.example.demo.eventPublisher;

public class MyEvent {//extends ApplicationEvent {

    private int data;

//    public MyEvent(Object source) {
//        super(source);
//    }

    public MyEvent(Object source, int data){
        //super(source);
        this.data = data;
        System.out.println(source.getClass());
    }

    public int getData(){
        return data;
    }
}
