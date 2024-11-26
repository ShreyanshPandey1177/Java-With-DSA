
public class Interface {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayers {

    void moves();

}

class Queen implements chessPlayers {

    public void moves() {
        System.out.println("up, down,right,diagonal");
    }
}

class Rook implements chessPlayers {

    public void moves() {
        System.out.println("up, down,right,diagonal");
    }
}

class King implements chessPlayers {

    public void moves() {
        System.out.println("up, down,right,diagonal");
    }
}
