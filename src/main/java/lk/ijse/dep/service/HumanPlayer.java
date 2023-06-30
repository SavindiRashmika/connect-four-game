package lk.ijse.dep.service;

public class HumanPlayer extends Player {
   public HumanPlayer(Board board) {
      super(board);
   }

   @Override
   public void movePiece(int col) {
      board.updateMove(col, Piece.BLUE);
      board.getBoardUI().update(col, true);
      Winner winner = board.findWinner();

       if (winner.getWinningPiece()==Piece.BLUE){
           board.getBoardUI().notifyWinner(winner);
       } else if (board.existLegalMoves()==false){
           board.getBoardUI().notifyWinner(winner);
       }
   }
}

