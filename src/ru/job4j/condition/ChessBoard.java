package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int n1 = Math.abs(y1 - x1);
        int n2 = Math.abs(y2 - x2);
        if ((x1 < 0) || (x2 > 7) || (y1 < 0) || (y2 > 7) || (x2 < 0) || (x1 > 7) || (y2 < 0) || (y1 > 7)) {
            return rsl;
        }
        if (n1 == n2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int result = ChessBoard.way(6, 7, 1, 2);
        System.out.println(result);
        result = ChessBoard.way(7, 0, 0, 7);
        System.out.println(result);
        result = ChessBoard.way(2, 6, 4, 1);
        System.out.println(result);
        result = ChessBoard.way(-1, 6, 4, 1);
        System.out.println(result);
        result = ChessBoard.way(2, -1, 4, 1);
        System.out.println(result);
        result = ChessBoard.way(2, 6, -1, 1);
        System.out.println(result);
        result = ChessBoard.way(2, 6, 4, -1);
        System.out.println(result);
        result = ChessBoard.way(10, 6, 4, 1);
        System.out.println(result);
        result = ChessBoard.way(2, 10, 4, 1);
        System.out.println(result);
        result = ChessBoard.way(2, 6, 10, 1);
        System.out.println(result);
        result = ChessBoard.way(2, 6, 4, 10);
        System.out.println(result);
    }
}