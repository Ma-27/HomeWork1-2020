package Lv4;

import java.lang.invoke.MutableCallSite;

public class Main {
    public static void main(String[] args) {
        MutableArrayList list = new MutableArrayList();
        list.add("红岩网校android");
        list.remove(0);
        list.add(0,"加油");
        System.out.println(list.get(0));
        System.out.println("list内拥有"+list.size()+"个元素");
        //准备英竞，有缘再更
    }
}
