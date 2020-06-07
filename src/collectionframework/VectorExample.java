package collectionframework;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        List<Board> list = new Vector<Board>();

        list.add(new Board("제목1","내용1", "글쓴이1","2020-04-05",100));
        list.add(new Board("제목2","내용2", "글쓴이2","2020-04-06",200));
        list.add(new Board("제목3","내용3", "글쓴이3","2020-04-07",300));
        list.add(new Board("제목4","내용4", "글쓴이4","2020-04-08",400));
        list.add(new Board("제목5","내용5", "글쓴이5","2020-04-09",500));

        list.remove(2);

        for(int i=0; i<list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.title + "\t" + board.content + "\t" + board.writer + "\t" + board.date + "\t" + board.hitcount);
        }
    }
}
