public class Findbit {
  public static void main(String[] args) {
    // Set the bits and the index of the bit you want to find
    String bits = "1010";
    int index = 1; // The 3rd bit (index 2)

    // Convert the bits to a number in decimal form
    int num = Integer.parseInt(bits, 2);

    // Divide the number by 2 raised to the power of the index of the bit you want to find
    // The remainder of this division will be the value of the ith bit
    int ithBit = num / (int) Math.pow(2, index) % 2;

    // Print the result
    System.out.println("The value of the " + (index + 1) + "th bit is: " + ithBit);
  }
}