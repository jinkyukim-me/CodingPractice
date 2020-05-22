package fieldex.practice;

import javax.swing.*;

public class MemberExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Jk's House");
        JLabel label = new JLabel("Hello World");

        frame.add(label);

        frame.pack();
        frame.setVisible(true);


        Member member = new Member("홍길동", "hong");
        System.out.println(member.name + "+" + member.id);


    }
}
