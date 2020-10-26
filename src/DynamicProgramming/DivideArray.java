package DynamicProgramming;

import java.util.ArrayList;

public class DivideArray {
    public static void main(String[] args) {
        int a[] = {2, 1, 2, 3, 4, 8};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        ArrayList<Integer> ans = new ArrayList<>();
        boolean isPossible = (sum & 1) == 0 && partition(a, sum / 2, 0, ans);

        if (isPossible) {
            for (int e : ans)
                System.out.print(e + " ");
        } else {
            System.out.print("Not Possible!");
        }

    }

    static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans) {
        if (i >= a.length || sum < 0) return false;
        if (sum == 0) return true;

        ans.add(a[i]);
        boolean leftPossible = partition(a, sum - a[i], i + 1, ans);
        if (leftPossible) return true;

        // Back Track
        ans.remove(ans.size() - 1);

        return partition(a, sum, i + 1, ans);

    }
}
