/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long min = 1;
        long max = n;

        while (min <= max) {
            long mid = (min + max) / 2;
            int ans = guess((int) mid); // Chú ý ép kiểu vì phương thức `guess` yêu cầu kiểu int

            if (ans == -1) {
                max = mid - 1;
            } else if (ans == 1) {
                min = mid + 1;
            } else {
                return (int) mid;
            }
        }

        return -1;
    }


}