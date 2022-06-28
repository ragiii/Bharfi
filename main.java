public class Bharfi {
    public static void main(String[] args) {
        String[][] digits = new String[7][4];

        for(int i =0; i <= 6; i++){
            for(int j = 0; j <= 3; j++){
                if((i==0 || i ==3 || i==6) && (j<3)) digits[i][j] = " * ";
                else if ((i == 1 || i == 2 || i == 4 || i == 5) && (j==0 || j == 3)) digits[i][j] = " * ";
                else digits[i][j] = "  ";
            }
        }
        for (int i = 0; i<=6; i ++){
            for(int j=0; j<=3; j++)
            System.out.print(digits[i][j]);
            System.out.println();
        }
    }
    
}
