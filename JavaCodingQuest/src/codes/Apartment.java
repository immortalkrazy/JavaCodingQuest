package codes;

public class Apartment {

      private int rooms;
      private int squareMeters;
      private int pricePerSquareMeter;

      public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {

            this.rooms = rooms;
            this.squareMeters = squareMeters;
            this.pricePerSquareMeter = pricePerSquareMeter;

      }

      public int getRooms() {
            return rooms;
      }

      public void setRooms(int rooms) {
            this.rooms = rooms;
      }

      public int getSquareMeters() {
            return squareMeters;
      }

      public void setSquareMeters(int squareMeters) {
            this.squareMeters = squareMeters;
      }

      public int getPricePerSquareMeter() {
            return pricePerSquareMeter;
      }

      public void setPricePerSquareMeter(int pricePerSquareMeter) {
            this.pricePerSquareMeter = pricePerSquareMeter;
      }

      public boolean larger(Apartment otherApartment) {
            if (this.squareMeters > otherApartment.squareMeters) {
                  return true;
            } else {
                  return false;
            }
      }

      public int priceDifference(Apartment otherApartment) {

            return Math.abs((this.pricePerSquareMeter * this.squareMeters)
                        - (otherApartment.pricePerSquareMeter * otherApartment.squareMeters));
      }

      public boolean moreExpensiveThan(Apartment otherApartment) {
            if (this.pricePerSquareMeter * this.squareMeters > otherApartment.pricePerSquareMeter
                        * otherApartment.squareMeters) {
                  return true;
            } else {
                  return false;
            }
      }

}
