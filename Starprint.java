public class Starprint {

  // print star pattern
  // * * * * *
  // * * * * *
  // * * * * *
  // * * * * *
  // int numberofcoloums=5;
  // int numberofRows=5;
  // for (int index = 1; index <numberofRows; index++) {
  // for (int j= 1; j <=numberofcoloums ;j++) {
  // System.out.print(" * ");
  // }
  // System.out.println();

  // star printing using method
  // public static void printStar(int numberofcoloums, int numberofRows){
  // for (int index = 1; index <numberofRows; index++) {
  // for (int j= 1; j <=numberofcoloums ;j++) {
  // System.out.print(" * ");
  // }
  // System.out.println();

  // }
  // }
  // public static void main(String[] args) {
  // int numberofcoloums=5;
  // int numberofRows=5;
  // printStar(numberofcoloums, numberofRows);

  // }

  // print star pattern using recurion
  // public static void printcols(int col, int maxcols) {
  // if (col>maxcols) {
  // return;
  // }
  // System.out.print(" * ");
  // printcols(col+1 , maxcols);
  // }

  // public static void printRows(int row, int maxRows, int col) {
  // if (row>maxRows) {
  // return;
  // }
  // printcols( col , maxRows);
  // System.out.println();
  // printRows(row+1, maxRows, col);
  // }
  // public static void main(String[] args) {
  // int numberofcoloum=5;

  // printRows(1, numberofcoloum, 1);

  // }

  // gatke tarika
  // public static void printcols(int col) {
  // if (col==0) {
  // return;
  // }
  // System.out.print(" * ");
  // printcols(col-1 );
  // }

  // public static void printRows(int row, int maxRows) {
  // if (row==0) {
  // return;
  // }
  // printcols( maxRows);
  // System.out.println();
  // printRows(row-1, maxRows);
  // }
  // public static void main(String[] args) {
  // int numberofcoloum=5;

  // printRows(numberofcoloum, numberofcoloum);

  // }
  // }
  // public static void printcols(int num) {
  // if (num>5) {
  // return;
  // }
  // System.out.print(num);
  // printcols(num+1 );
  // }

  // public static void printRows(int row) {
  // if (row>5) {
  // return;
  // }
  // printcols( 1);
  // System.out.println();
  // printRows(row+1);
  // }
  // public static void main(String[] args) {
  // int row=1;

  // printRows(row );

  // }
  // }
  // print pattern

  // public static void printcols(int row, int col) {
  // if (col>5) {
  // return;
  // }
  // System.out.print(row+col);
  // printcols( row, col+1 );
  // }

  // public static void printRows(int row) {
  // if (row>5) {
  // return;
  // }
  // printcols( row,1);
  // System.out.println();
  // printRows(row+1);
  // }
  // public static void main(String[] args) {
  // int row =1;

  // printRows(row );

  // }
  // }
  // print star pattern
  // 54321
  // 54321
  // 54321
  // 54321

  // public static void printcols(int num) {
  // if (num== 0) {
  // return;
  // }
  // System.out.print(num + " ");
  // printcols(num - 1);
  // }

  // public static void printRows(int row) {
  // if (row == 0) {
  // return;
  // }
  // printcols(5);
  // System.out.println();
  // printRows(row - 1);
  // }

  // public static void main(String[] args) {
  // int row = 5;

  // printRows(row);

  // }

  // +++ vala method
  // 1 2 3 4 5
  // 1 2 3 4 5
  // 1 2 3 4 5
  // 1 2 3 4 5
  // 1 2 3 4 5

  // public static void printcols(int col) {
  // if (col>5) {
  // return;
  // }
  // System.out.print(col+" ");
  // printcols(col+ 1);
  // }

  // public static void printRows(int row) {
  // if (row >5) {
  // return;
  // }
  // printcols(1);
  // System.out.println();
  // printRows(row + 1);
  // }

  // public static void main(String[] args) {
  // int row = 1;

  // printRows(row);

  // }

  // print patern
  // 10101
  // 10101
  // 10101
  // 10101
  // 10101
  // public static void printcols(int num) {
  // if (num>5) {
  // return;
  // }
  // if (num%2==1) {
  // System.out.print(1 +" ");
  // }else{
  // System.out.print(0 +" ");
  // }
  // printcols(num+1);
  // }

  // public static void printRows(int row) {
  // if (row >5) {
  // return;
  // }
  // printcols(1);
  // System.out.println();
  // printRows(row + 1);
  // }

  // public static void main(String[] args) {
  // int row = 1;

  // printRows(row);

  // }
  // triangle pattern
  /*
   * 
   * *
   * * *
   * * * *
   * * * * *
   * 
   */

  // badhke tarika
  // star printing using method
  // public static void printStar(int maxRows){
  // for (int row = 0; row <maxRows; row++) {
  // for (int col= 0; col <=row ;col++) {
  // System.out.print(" * ");
  // }
  // System.out.println();

  // }
  // }
  // public static void main(String[] args) {

  // int maxRows=5;
  // printStar(maxRows);

  // }

  // second method of gatke tarika

  // public static void printStar(int maxRows){
  // for (int row = maxRows; row <=1; row--) {
  // for (int col= maxRows; col <=row ;col--) {
  // System.out.print(" * ");
  // }
  // System.out.println();

  // }
  // }
  // public static void main(String[] args) {

  // int maxRows=5;
  // printStar(maxRows);

  // }

  // public static void printcols( int row, int col) {
  // if (row>5) {
  // return;
  // }
  // if (col >row) {

  // System.out.println();
  // printcols(row+1, 1);
  // return;
  // }
  // System.out.print(" * ");
  // printcols(row, col+1);

  // }

  // public static void main(String[] args) {
  // int row = 1;

  // printcols(row, row);
  // }

  // gatke vala method

  // public static void printcols(int row, int col) {
  // if (row == 0) {
  // return;
  // }
  // if (col == 0) {

  // System.out.println();
  // printcols(row - 1, row - 1);
  // return;
  // }
  // System.out.print(" * ");
  // printcols(row, col - 1);

  // }

  // public static void main(String[] args) {
  // int row = 5;

  // printcols(row, row);
  // }

  // best method of star printing
  // print

  // public static void printcol( int col,int maxcol ) {
  // if (col>) {

  // }
  // }
  // public static void main(String[] args) {

  // print this pattern
  /*
   * 1
   * 1 2
   * 1 2 3
   * 1 2 3 4
   * 1 2 3 4 5
   */

  /*
   * *
   * * *
   * * * *
   * * * * *
   * * * *
   * * *
   * *
   * 
   */
  // public static void printCols(int col, int maxCols) {
  // if (col > maxCols) {
  // return;
  // }
  // System.out.print(" * ");
  // printCols(col + 1, maxCols);

  // }

  // public static void printRows(int row, int maxRows, int col) {
  // if (row == 2 * maxRows) {
  // return;
  // }
  // int numOfCols=maxRows>row ?row : 2*maxRows-row;
  // printCols(col, numOfCols);
  // System.out.println();
  // printRows(row + 1, maxRows, col);
  // }

  // public static void main(String[] args) {
  // int numberOfRows = 5;
  // int col = 1;
  // int row = 1;
  // printRows(row, numberOfRows, col);

  // }

  /*  
   *
  **
   ***
   ****
  *****
  */

  // public static void main(String[] args) {
  // int maxrow=5;
  // for (int row = 1; row <= maxrow; row++) {
  // for (int Space= 1; Space < maxrow-row; Space++) {
  // System.out.print(" ");
  // }

  // for (int col = 1; col <=row; col++) {
  // System.out.print("*");
  // }
  // System.out.println();
  // }

  // using recurion
  // gatke tarika

  // public static void space(int n) {
  // if (n==0) {
  // return;
  // }
  // System.out.print(" ");
  // space(n-1);
  // }
  // public static void Star(int n) {
  // if (n==0) {
  // return;
  // }
  // System.out.print("*");
  // Star(n-1);
  // }
  // public static void Pattern(int row) {
  // if (row==0) {
  // return;
  // }
  // Pattern(row-1);
  // space(5-row);
  // Star(row);
  // System.out.println();

  // }
  // public static void main(String[] args) {
  // Pattern(5);
  // }

  // badhke tarika

  // public static void space(int row , int col, int maxrow) {
  // if (col>maxrow) {
  // return;
  // }
  // System.out.print(" ");
  // space(row, col+1, maxrow);;
  // }
  // public static void number(int row , int col) {
  // if (col>row) {
  // return;
  // }
  // System.out.print( " * ");
  // number(row, col+1);
  // }
  // public static void Pattern(int row, int maxrow) {
  // if (row>maxrow) {
  // return;
  // }

  // space(row, row+1, maxrow);
  // number(row, 1);
  // System.out.println();

  // Pattern(row+1 , maxrow);

  // }
  // public static void main(String[] args) {
  // Pattern(1,5);

  // }
  /*
   * ^# ^# ^# ^# 1
   * ^# ^# ^# 1 2
   * ^# ^# 1 2 3
   * ^# 1 2 3 4
   * 1 2 3 4 5
   * 
   */
  // public static void space(int row , int col, int maxrow) {
  // if (col>maxrow) {
  // return;
  // }
  // System.out.print(" ^# ");
  // space(row, col+1, maxrow);;
  // }
  // public static void number(int row , int col) {
  // if (col>row) {
  // return;
  // }
  // System.out.print( col+" ");
  // number(row, col+1);
  // }
  // public static void Pattern(int row, int maxrow) {
  // if (row>maxrow) {
  // return;
  // }

  // space(row, row+1, maxrow);
  // number(row, 1);
  // System.out.println();

  // Pattern(row+1 , maxrow);

  // }
  // public static void main(String[] args) {
  // Pattern(1,5);

  // }

  // priont patern using recurion
  /*
   * 0 1 2 3 4 5 1
   * 1 2 3 4 5 1 2
   * 2 3 4 5 1 2 3
   * 3 4 5 1 2 3 4
   * 4 5 1 2 3 4 5
   */

  // * * * * *
  // // * * * *
  // * * *
  // } * *
  // *

  // public static void main(String[] args) {
  // int n=5;
  // for (int row = 1; row<=5; row++) {
  // for (int space = 1; space <row; space++) {
  // System.out.print(" ");
  // }
  // for (int col= 1; col<=n-row+1; col++) {
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // }

  // using recurion
  // public static void space(int row , int space) {
  // if (space>row) {
  // return;
  // }
  // System.out.print(" ");
  // space(row, space+1);;
  // }
  // public static void col(int row , int col, int maxrowrow) {
  // if (col>=maxrowrow-row+1) {
  // return;
  // }
  // System.out.print( "*");
  // col(row, col+1,maxrowrow);
  // }
  // public static void row(int row, int maxrow, int space) {
  // if (row>maxrow) {
  // return;
  // }

  // space(row, space+1);
  // col(row, 1,maxrow);
  // System.out.println();

  // row(row+1 , maxrow, space);

  // }
  // public static void main(String[] args) {
  // int row=1;
  // int maxrow=6;
  // int space=1;
  // row(row, maxrow, space);

  // }

  /*
   * // 1 2 3 4 5
   * 1 1 2 3 4
   * 2 1 1 2 3
   * 3 2 1 1 2
   * 4 3 2 1 1
   */

  // public static void main(String[] args) {
  // int maxrow=5;
  // for (int row = 1; row<=maxrow; row++) {
  // for (int space = 1; space <=maxrow-row; space++) {
  // System.out.print(" ");
  // }
  // for (int col= 1; col<=2*row-1; col++) {
  // System.out.print(" *");
  // }
  // System.out.println();
  // }
  // }

  // }
  /*
   * using recurion
   *
   * * *
   * * * * *
   * * * * * * *
   * * * * * * * * *
   * 
   */
  // public static void space(int row , int space, int maxrow) {
  // if (space>maxrow-row) {
  // return;
  // }
  // System.out.print(" ");
  // space(row, space+1, maxrow);;
  // }
  // public static void col(int row , int col, int maxrowrow) {
  // if (col>2*row-1) {
  // return;
  // }
  // System.out.print( " *");
  // col(row, col+1,maxrowrow);
  // }
  // public static void row(int row, int maxrow, int space) {
  // if (row>=maxrow) {
  // return;
  // }

  // space(row, space+1, maxrow);
  // col(row, 1,maxrow);
  // System.out.println();

  // row(row+1 , maxrow, space);

  // }
  // public static void main(String[] args) {
  // int row=1;
  // int maxrow=6;
  // int space=1;
  // row(row, maxrow, space);

  // }

  // print this pattern
  /*
   * * * * * * * * * * *
   * * * * * * * * *
   * * * * * * *
   * * * * *
   * * *
   *
   * 
   * 
   */

  // public static void main(String[] args) {
  // int maxrow=5;
  // int i=1;
  // for (int row = 1; row<=maxrow; row++) {
  // for (int space = 1; space <=maxrow-row+i; space++) {
  // System.out.print(" ");
  // }
  // for (int col= 1; col<=2*maxrow-i; col++) {
  // System.out.print(" *");

  // }
  // i+=2;
  // System.out.println();
  // }

  // }

  // print this pattern using recurion
  /*
   * * * * * * * * * * *
   * * * * * * * * *
   * * * * * * *
   * * * * *
   * * *
   *
   * 
   * 
   */
  // public static void space(int row , int space, int maxrow) {

  // if (space>row) {
  // return;
  // }
  // System.out.print(" ");
  // space(row, space+1, maxrow);;
  // }
  // public static void col(int row, int col, int maxrow) {

  // if (col>2*(maxrow -row)+1) {
  // return;
  // }

  // System.out.print( " *");
  // col(row, col+1,maxrow);
  // }
  // public static void row(int row, int maxrow, int space) {
  // if (row>maxrow) {
  // return;
  // }

  // space(row, space+1, maxrow);
  // col(row, 1,maxrow);
  // System.out.println();

  // row(row+1 , maxrow, space);

  // }
  // public static void main(String[] args) {
  // int row=1;
  // int maxrow=6;
  // int space=1;

  // row(row, maxrow, space);

  // }

  // Hollow pyramid pattern using recurion
  /*
   *
   * *
   * *
   * *
   *********
   */

  // public static void main(String[] args) {
  // int maxrow = 5;
  // for (int row = 1; row <= maxrow; row++) {
  // for (int space = 1; space <= maxrow - row; space++) {
  // System.out.print(" ");
  // }
  // for (int col = 1; col <= 2 * row - 1; col++) {

  // if (row == maxrow || col == 1 || col == 2 * row - 1) {
  // System.out.print("*");
  // } else {
  // System.out.print(" ");
  // }
  // }

  // System.out.println();
  // }
  // }

  // using recurion

  // public static void space(int row , int space, int maxrow) {
  // if (space>maxrow-row) {
  // return;
  // }
  // System.out.print(" ");
  // space(row, space+1, maxrow);;
  // }
  // public static void col(int row , int col, int maxrowrow) {
  // if (col>2*row-1) {
  // return;
  // }
  // if (row==maxrowrow || col==1 || col==2*row-1) {
  // System.out.print("*");
  // }else{
  // System.out.print(" ");
  // }

  // col(row, col+1,maxrowrow);
  // }
  // public static void row(int row, int maxrow, int space) {
  // if (row>maxrow) {
  // return;
  // }

  // space(row, 1, maxrow);
  // col(row, 1,maxrow);
  // System.out.println();

  // row(row+1 , maxrow, 1);

  // }
  // public static void main(String[] args) {
  // int row=1;
  // int maxrow=5;
  // int space=1;
  // row(row, maxrow, space);

  // }

  // print star petterrn
  /*
   * 
   * * *
   * * * * *
   * * * * * * *
   * * * * * * * * *
   * * * * * * * * *
   * * * * * * *
   * * * * *
   * * *
   * 
   * 
   */

  // public static void main(String[] args) {
  // int maxrow=5;
  // for (int row = 1; row <=maxrow; row++) {
  // for (int star = 1; star <= maxrow -row; star++) {
  // System.out.print(" ");
  // }
  // for (int col =1; col<= 2*row-1; col++) {
  // System.err.print("* ");
  // }
  // System.out.println();
  // }
  // // lower row of diamond
  // for (int row = maxrow; row >=1; row--) {
  // for (int star = 1; star <= maxrow -row; star++) {
  // System.out.print(" ");
  // }
  // for (int col =1; col<= 2*row-1; col++) {
  // System.err.print("* ");
  // }
  // System.err.println();
  // }

  // }

  // using recurion

  // public static void star(int row , int maxrow, int space ) {
  // if (space >=maxrow-row) {
  // return;
  // }
  // System.out.print(" ");
  // star(row, maxrow, space+1);
  // }
  // public static void col(int row, int col) {
  // if (col>2*row-1) {
  // return;
  // }
  // System.err.print("* ");
  // col(row, col+1);
  // }
  // public static void UpperRow(int row , int col ,int maxrow) {
  // if (row>maxrow) {
  // return;
  // }
  // star(row, maxrow, 0);
  // col(row, col);
  // System.out.println();
  // UpperRow(row+1, col, maxrow);

  // }
  // public static void lowerRow(int row, int col, int maxrow) {
  // if (row<1) {
  // return;
  // }
  // star(row, maxrow, 0);
  // col(row, col);
  // System.out.println();
  // lowerRow(row-1, col, maxrow);

  // }
  // public static void main(String[] args) {
  // UpperRow(1, 1, 5);
  // lowerRow(5, 1, 5);
  // }
  // print this pattern
  /*
   *
   * *
   * *
   * *
   * *
   * *
   * *
   * *
   *
   */

  // outer loop
  // public static void main(String[] args) {
  // int maxrow=5;
  // for (int row = 1; row<=maxrow; row++) {
  // for (int space = 1; space <=maxrow-row; space++) {
  // System.out.print(" ");
  // }
  // for (int col= 1; col<=2*row-1; col++) {
  // System.out.print((col==1|| col==2*row-1)? "*" :" ");
  // }

  // System.out.println();
  // }
  // //
  // // inner loop
  // for (int row = maxrow -1; row>=1; row--) {
  // for (int space = 1; space <=maxrow-row; space++) {
  // System.out.print(" ");
  // }
  // for (int col= 1; col<=2*row-1; col++) {
  // System.out.print((col==1|| col==2*row-1)? "*" :" ");
  // }

  // System.out.println();
  // }

  // }

  // using recurion
  public static void star(int row, int maxrow, int space) {
    if (space >= maxrow - row) {
      return;
    }
    System.out.print("  ");
    star(row, maxrow, space + 1);
  }

  public static void col(int row, int col, int maxrowrow) {
    if (col > 2 * row - 1) {
      return;
    }
   System.out.print((col==1|| col==2*row-1)? "* " :"  ");
  


    col(row, col + 1, 5);
  }

  public static void UpperRow(int row, int col, int maxrow) {
    if (row > maxrow) {
      return;
    }
    star(row, maxrow, 0);
    col(row, col, 5);
    System.out.println();
    UpperRow(row + 1, col, maxrow);

  }

  public static void lowerRow(int row, int col, int maxrow) {
    if (row < 1) {
      return;
    }
    star(row, maxrow, 0);
    col(row, col, 5);
    System.out.println();
    lowerRow(row - 1, col, maxrow);

  }

  public static void main(String[] args) {
    UpperRow(1, 1, 5);
    lowerRow(5, 1, 5);
  }

}
