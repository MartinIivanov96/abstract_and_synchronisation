package unidue.de;

public class SportSeat implements Seat {
   private Color color;

   public SportSeat(Color color){
       this.color = color;
   }
    @Override
    public Color getColor() {
        return this.color;
    }
}
