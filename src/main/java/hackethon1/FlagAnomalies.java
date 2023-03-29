package hackethon1;

import java.util.*;

public class FlagAnomalies {

    /*
    A legacy application uses Sign In and Sign Out logging in the application logs to analyse the user session patterns. After processing the log file, the data extracted from the logs is an array of strings with the following format for each string:

" <USER_ID>;<TIMESTAMP_IN_SECONDS>;<ACTION_TYPE>"

USER_ID: Integer, user ID
TIMESTAMP_IN_SECONDS: Integer, time in seconds since application startup/launch
ACTION_TYPE: Can be SIGNIN or SIGNOUT
Given that the log inputs are unsorted, return an array of USER_IDs (in ascending order) of users who logged out in less than 60 seconds.

Example logs = ["101;200;SIGNIN", "101;999;SIGNOUT", "500;60;SIGNIN", "199;560;SIGNIN", "500;80;SIGNOUT", "199;580;SIGNOUT", "9288;1234;SIGNIN"]

ID	SIGN IN	SIGN OUT	Session Duration
101	200	999	999-200 = 799
500	60	80	80 - 60 = 20
199	560	580	580 - 560 = 20
9288	1234	-	-
Since Users 500, 199 were logged in for 20 seconds only, which is less than 60 seconds, we return [199, 500].

Function Description

Create a function called flagAnamoly The function has the following parameter(s): Input string[] logs: each logs[i] denotes the ith entry in the logs

Returns Integer[] : An integer array of user id's sorted in ascending order(forusers whose logged in time is less than 60 seconds).

Input Format

1st Line - Integer - Number of inputs = n Next N Lines - String - "User_ID;Time_Stamp;Action"

Constraints

0 <= USER_ID, TIMESTAMP_IN_SECONDS <= 999999
Each User's sign-in timestamp < sign-out timestamp
There is only 1 sign in per user.
Output Format

An integer array of user id's sorted in ascending order for whome logged in time is less than 60 seconds. [user_id1, user_ud2, ...]
Example:
[199, 500]
IF array is empty print
N/A

Sample Input 0

7
101;200;SIGNIN
101;999;SIGNOUT
500;60;SIGNIN
199;560;SIGNIN
500;80;SIGNOUT
199;580;SIGNOUT
9288;1234;SIGNIN
Sample Output 0

199
500
Explanation 0

Since User 500, 199 were logged in for 20 seconds only which is less than 60 seconds, hence we return [199, 500]
     */
    public static List<Integer> flagAna(String[] logs) {
        Map<Integer, Integer> sessions_check = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (String log : logs) {
            String[] parts = log.split(";");
            int userId = Integer.parseInt(parts[0]);
            int timestamp = Integer.parseInt(parts[1]);
            String action = parts[2];
            if (action.equals("SIGNIN")) {
                sessions_check.put(userId, timestamp);
            } else {
                int duration = timestamp - sessions_check.get(userId);
                if (duration < 60) {
                    result.add(userId);
                }
                sessions_check.remove(userId);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] logs = new String[n];
        for (int i = 0; i < n; i++) {
            logs[i] = scanner.next();
        }
        List<Integer> result = flagAna(logs);
        if (result.isEmpty()) {
            System.out.println("N/A");
        } else {
            for (int userId : result) {
                System.out.println(userId);
            }
        }
    }
}
