package hackethon1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RoomAllotment {

    /*

    A tourist group has arrived at a hotel requesting for accommodation. The hotel has rooms with different capacities. Given the number of persons requiring a room and a list of room capacities, determine the minimum number of rooms necessary to accommodate exactly the given number of people and no more. If there are no room combinations of the same or different sizes that can accommodate the exact specified number of people, return the value of -1.

Example N = 5 Capacities = [3, 5] One room can house exactly 5 people, so the function should return 1.

Function Description ** **getRooms(int n, ArrayList capacities) has the following parameter(s): int n: the number of people in the tourist group ArrayList capacities: an array list of room capacity available Returns: int: the minimum number of rooms required to accommodate exactly n people, or -1 if it is impossible

Input Format

Input from stdin will be processed as follows and passed to the function.

First Line – Integer, number of people in the tourist group. (N) Second Line – Integer, number of room capacity records (M) Next M Line – Each of the following M lines contains the room capacity

Sample Input

STDIN	Description
4	Number of Tourists = n = 3
2	Number of Capacities = M
2	Capacity ( 2 People)
4	Capacity (4 People)
Capacities = [2, 4]

Constraints

• 1 ≤ n, capacities[i], M ≤ 1000

Output Format


Example: n = 4 People, Capacity = [2,4]

Output: 1

The first room capacity can accommodate capacities[0] = 2 persons, and the second room can accommodate capacities[1] = 4 people. To accomodate exactly n = 4 persons, use either two rooms of type capacities[0] or one room of type capacities[1]. The minimal number is 1.

Sample Input 0

4
2
2
4
Sample Output 0

1
Explanation 0

The first capacity of room can cover capacities[0] = 2 people, and the second can cover capacities[1] = 4 people. To cover exactly n= 4 people, use either 2 rooms of type capacities[0] or 1 rooms of type capacities[1]. The minimal number is 1.


     */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int tourists= sc.nextInt();
        int noOfRooms= sc.nextInt();

        ArrayList<Integer> capacities_list = new ArrayList<>();

        for (int i= 0; i<noOfRooms; i++){
            try{
                capacities_list.add(i,sc.nextInt());
            } catch (Exception e){
                capacities_list.add(i,0) ;
            }
        }

        Collections.sort(capacities_list);

        System.out.println(RoomAllotment.getRooms(tourists, capacities_list));
    }
    private static int getRooms(int tourists, ArrayList<Integer> capacities) {
        int rooms = 0;
        for (int i=capacities.size()-1; i>=0; i--){
            if(tourists<capacities.get(i)){
                continue;
            }
            tourists= tourists - capacities.get(i);
            rooms++;
            if (tourists==0){
                return rooms;
            }
        }
        return -1;
    }
}

