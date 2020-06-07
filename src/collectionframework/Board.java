package collectionframework;

public class Board {
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

    public Board(String title, String content, String writer, String date, int hitcount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }
}
