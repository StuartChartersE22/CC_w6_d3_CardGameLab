public enum SuitType {

    DIAMONDS(1),
    CLUBS(2),
    HEARTS(3),
    SPADES(4);

    private final int rank;

    SuitType(int rank) {this.rank = rank;}

    public int getRank() {return this.rank;}

}
