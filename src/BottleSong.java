public class BottleSong {
    void playSong () {
        int bottleNum = 10;
        String word = "bottles";
        while (bottleNum > 0) {
            System.out.println(bottleNum + " green " + word + ", hanging on the wall" );
            System.out.println(bottleNum + " green " + word + ", hanging on the wall" );
            System.out.println("And if one green bottle should accidentally fall,");
            bottleNum = bottleNum - 1;
            if (bottleNum == 1) {
                word = "bottle"; // Change the word for ONE bottle
            }
            if (bottleNum > 0) {
                System.out.println("There'll be " + bottleNum +" green " + word + ", hanging on the wall");
            }
            }
        System.out.println("There'll be no green bottles, hanging on the wall");
        }
    }

class TestDriveBottleSong {
    public static void main(String[] args) {
      BottleSong b = new BottleSong();
      b.playSong();
    }
}