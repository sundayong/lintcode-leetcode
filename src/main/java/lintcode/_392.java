package lintcode;;

public class _392 {

    public static long houseRobber(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        if (A.length == 1) {
            return A[0];
        }
        if (A.length == 2) {
            return Math.max(A[1], A[0]);
        }
        long DP_i_1 = Math.max(A[1], A[0]);
        long DP_i_2 = A[0];

        for (int i = 2; i < A.length; i++) {
            long temp = DP_i_1;
            DP_i_1 = Math.max(temp, DP_i_2 + A[i]);
            DP_i_2 = temp;
        }
        return DP_i_1;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2, 1, 5};
        System.out.println(houseRobber(A));

    }
}
