package fifo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("sendMail","David"));
        messageQueue.offer(new Message("sendSMS","Julie"));
        messageQueue.offer(new Message("sendKakaotalk","Jane"));

        while(!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.getCommand()) {
                case "sendMail":
                    System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.getTo() + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
