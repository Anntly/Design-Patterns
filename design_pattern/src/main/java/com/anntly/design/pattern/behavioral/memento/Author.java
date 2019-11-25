package com.anntly.design.pattern.behavioral.memento;

import java.util.Date;

/**
 * @author soledad
 * @Title: Author
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2110:27
 */
public class Author {

    public static void main(String[] args) {
        Doc doc = new Doc();
        doc.setTitle("于谦");
        doc.setContent("于谦他爸爸呀......八大铁帽之王--绿帽子王");
        doc.setUpdateTime(new Date());

        Editor editor = new Editor(doc);
        editor.append(" 大肠刺生");

        editor.append(" 冷面杀手");

        editor.append(" 阿依土鳖公主");

        editor.append(" 大哥大，噗");

        editor.show();

        editor.remove(); // 钢的锅愉快的的创作中，途中小姐，被郭小宝这熊孩子给删除了

        editor.undo(); // 还好有历史记录，腚眼一看

        editor.show();
    }
}
