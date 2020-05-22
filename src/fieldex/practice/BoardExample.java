package fieldex.practice;

public class BoardExample {
    public static void main(String[] args) {

        Board board1 = new Board("제목","내용");
        System.out.println(board1.title);
        System.out.println(board1.content);
        System.out.println(board1.writer);
        System.out.println(board1.date);
        System.out.println(board1.hitcount);
        System.out.println();

        Board board2 = new Board("제목","내용","작가");
        System.out.println(board2.title);
        System.out.println(board2.content);
        System.out.println(board2.writer);
        System.out.println(board2.date);
        System.out.println(board2.hitcount);
        System.out.println();

        Board board3 = new Board("제목","내용","작가","날짜");
        System.out.println(board3.title);
        System.out.println(board3.content);
        System.out.println(board3.writer);
        System.out.println(board3.date);
        System.out.println(board3.hitcount);
        System.out.println();

        Board board4 = new Board("제목","내용","작가","날짜",123);
        System.out.println(board4.title);
        System.out.println(board4.content);
        System.out.println(board4.writer);
        System.out.println(board4.date);
        System.out.println(board4.hitcount);
        System.out.println();

    }
}
