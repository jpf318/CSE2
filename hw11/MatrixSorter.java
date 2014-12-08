//Juan Pablo Ferrer
//December 5, 2014
//CSE2 Sec 111
//HW11 - MatrixSorter
/*This program will design its own random 3D array / matrix
  and with the help of certain methods, it will also
  find the smallest entry in the matrix as well as, sort
  the third slab of the matrix. This program utilizes methods,
  3D arrays and sorting*/
  
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d = buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
//1st Method focuses on buidling the 3D Array
   public static int[][][] buildMat3d () {
       int [][][] slab = new int [3][7][9];
       
       //Given that each slab has a different amount of rows,
       //3 different nested for loops must be initialized for
       //each slab
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j <= i; j++) {
               slab[0][i][j] = (int) ((Math.random()*99) + 1);
           }
       }
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j <= i+1; j++) {
               slab[1][i][j] = (int) ((Math.random()*99) + 1);
           }
       }
       for (int i = 0; i < 7; i++) {
           for (int j = 0; j <= i+2; j++) {
               slab[2][i][j] = (int) ((Math.random()*99) + 1);
           }
       }
       return slab;
   }

   //2nd Method focuses on printing out the 3D array according to the
   //instructions given
   
   public static void show(int [][][] x) {
       int lines = 3;
       for (int i = 0; i < x.length; i++) {
           int counter = 0;
           System.out.println("---------------------------Slab "+(i+1));
           for (int j = 0; j < x[i].length; j++) {
               for (int k = 0; k < x[i][j].length; k++) {
                   if (x[i][j][k] != 0) {
                     System.out.print(" "+x[i][j][k]);
                   }
               }
               counter++;
              
               //By including this counter, the program is avoiding
               //printing out more lines then required.
               
               if(counter <= lines) {
                   System.out.println();
               }
            }
            //By adding two to the number of lines, the program
            //will be able to print out the amount of lines necessary
            //without printing more than needed
            lines = lines+2;
        }
   }

   //3rd Method focuses on finding the minimum entry in the matrix
   //by analyzing all the entries and comparing it with a choosen minimum
   
   public static int findMin(int [][][] x) {
       int min = x[0][0][0];
       //This nested loop allows to get all possible entries in
       //the matrix in order to be compared
       for (int i = 0; i < x.length; i++) {
           for (int j = 0; j < x[i].length; j++) {
               for (int k = 0; k < x[i][j].length; k++) {
                   if (x[i][j][k] < min && x[i][j][k] != 0) {
                       min = x[i][j][k];
                   }
               }
           }
       }
       return min;
   }

   //4th Method focuses on sorting only a single slab,
   //depending on what the programmer wants, in this case
   //the third slab will sorted
   
   public static void sort(int [][] x) {
       for (int i = 0; i < x.length; i++) {
           sortRow(x[i]);
       }
     sortRows(x);
   }

   //5th Method only focuses on sorting, in ascending order,
   //the numbers inside every row of the slab
   
   public static void sortRow (int [] y) {
       for (int i = 0; i < y.length; i++) {
           for (int j = 0; j < y.length; j++) {
              if (y[i] < y[j]) {
                   int temp = y[i];
                   y[i] = y[j];
                   y[j] = temp;
               }
           }
       }
   }

    //6th Method sorts the rows, in ascending order, inside the slab
    //according to the value of their smallest entry / first entry
    //in their respective rows
    
    public static void sortRows(int [][] x) {
    	int [] temp;
    	int position;

    	for (int i = 1; i < x.length; i++) {
    		temp = x[i];
    		position = i - 1;

    		while ((position >= 0) && (firstNonZero(temp) < firstNonZero(x[position]) )) {
    			x[position + 1] = x[position];
    			position--;
    		}
    		x[position + 1] = temp;
    	}
    }

    //7th Method is necessary so the program wouldn't recognize
    //the unesessary 0s which are found but not displayed in the
    //arrays and alllow the rows to be organized accordingly
    
    public static int firstNonZero(int [] y) {
    	for (int i : y) {
    	    if(i>0) {
    	        return i;
    	    }
    	}
    	return 0;
    }
}