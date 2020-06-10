package fifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String[] args) {
        Queue<Coin> coinbox = new LinkedList<Coin>();

        coinbox.offer(new Coin(100));
        coinbox.offer(new Coin(50));
        coinbox.offer(new Coin(500));
        coinbox.offer(new Coin(10));

        while(!coinbox.isEmpty()) {
            Coin coin = coinbox.poll();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }

    }
}
