import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj długość: ");
    int l = in.nextInt();
    for(int i=0; i<l+1; i++){
      for(int j=0; j<i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int b=0; b<l; b++){
      for(int n=0; n<l-b-1; n++){
        System.out.print(" ");
      }
      for(int m=0; m<b+1; m++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}