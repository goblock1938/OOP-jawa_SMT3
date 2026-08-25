package trial;

public class dataType {
  public static void main(String[] args) {
    // type data nomor
    byte iniByte = 100;
    short iniShort = 1000;
    int iniInt = 10000;
    long iniLong = 100000;
    long iniLong2 = 100000L;

    System.out.println(iniByte);
    System.out.println(iniShort);
    System.out.println(iniInt);
    System.out.println(iniLong);
    System.out.println(iniLong2);

    // type data desimal
    float iniFloat = 10.10F;
    double iniDouble = 100.100F;
    System.out.println(iniFloat);
    System.out.println(iniDouble);

    // type data literal
    int desimalInt = 25;
    int hexInt = 0xA132B;
    int binInt = 0b01010101;
    System.out.println(desimalInt);
    System.out.println(hexInt);
    System.out.println(binInt);

    // underscrore
    long balance = 1_000_000_000L;
    int sum = 60_000_000;
    System.out.println(balance);
    System.out.println(sum);

    // konversi auto integer
    // konversi auto terjadi jika variable penampung > variable yang
    // ditampung
    byte thisByte = 100;
    short thisShort = thisByte;
    int thisInt = thisShort;
    long thisLong = thisInt;
    float thisFloat = thisLong;
    double thisDouble = thisFloat;
    System.out.println(thisByte);
    System.out.println(thisShort);
    System.out.println(thisInt);
    System.out.println(thisLong);
    System.out.println(thisFloat);
    System.out.println(thisDouble);

    // konversi manual integer
    // konversi manual dilakukan jika variable penampung < variable
    // yang ditampung
    thisFloat = (float) thisDouble;
    thisLong = (long) thisFloat;
    thisInt = (int) thisLong;
    thisShort = (short) thisInt;
    thisByte = (byte) thisShort;
    System.out.println(thisByte);
    System.out.println(thisShort);
    System.out.println(thisInt);
    System.out.println(thisLong);
    System.out.println(thisFloat);

    // type data char

  }
}
