import java.util.ArrayList;

public class spiralMatrix {

    public static void main(String[] args) {

        int[][] matrix = { {1,2,3},{4,5,6}};
        ArrayList<Integer> spiralMat = new ArrayList<>();

        if(matrix == null || matrix.length ==0 || matrix[0].length ==0){
            
            return;
        }


        int dir = 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[top].length - 1;
        int nos = matrix.length * matrix[0].length;

        while (left <= right && top <= bottom) {

            if (nos > 0) {

                if (dir == 1) {

                    for (int i = left; i <= right; i++) {

                        spiralMat.add(matrix[top][i]);
                        nos--;

                    }
                }

                top++;
                dir = 2;

                if (nos > 0) {

                    if (dir == 2) {

                        for (int i = top; i <= bottom; i++) {
                            spiralMat.add(matrix[i][right]);
                            nos--;
                        }
                    }
                }

                right--;
                dir = 3;

                if (nos > 0) {

                    if (dir == 3) {

                        for (int i = right; i >= left; i--) {
                            spiralMat.add(matrix[bottom][i]);
                            nos--;
                        }
                    }
                }

                dir = 4;
                bottom--;

                if (nos > 0) {

                    if (dir == 4) {

                        for (int i = bottom; i >= top; i--) {
                            spiralMat.add(matrix[i][left]);
                            nos--;
                        }
                    }
                }

                left++;

                dir = 1;
            }
        }

        System.out.println(spiralMat);

    }

}