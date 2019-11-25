package com.anntly.design.pattern.behavioral.memento;

import java.util.Date;
import java.util.Stack;

/**
 * @author soledad
 * @Title: Editor
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2110:08
 */
public class Editor {

    private Doc doc;

    private Stack HISTORY_STACK = new Stack(); // 操作记录

    public Editor(Doc doc) {
        System.out.println("打开文档:"+doc.getTitle());
        this.doc = doc;
        backUp(); // 存记录
    }

    public void append(String statement){
        System.out.println("修改文档");
        doc.setContent(doc.getContent()+statement);
        doc.setUpdateTime(new Date());
        backUp(); // 存记录
    }

    public void remove(){ // 删除文档
        doc.setContent("");
        doc.setUpdateTime(new Date());
        System.out.println("删除成功");
    }

    public void show(){
        System.out.println("--------------");
        System.out.println(doc);
        System.out.println("--------------");
    }

    public void save() throws InterruptedException {
        System.out.println("保存中");
        Thread.sleep(3000);
        System.out.println("保存完成");
    }

    public void backUp(){ // 历史记录
        HISTORY_STACK.push(doc.createHistory()); // 历史记录
        System.out.println("添加操作历史");
    }

    public void undo(){ // 回退
        if(HISTORY_STACK.empty()){
            System.out.println("没有记录");
            return;
        }
        History history = (History) HISTORY_STACK.pop();
        doc.restorrHistory(history);
    }
}
