package hackethon1;

import java.util.ArrayList;
import java.util.Scanner;

public class LotteryTicket {

    /*

    A lottery ticket stall is selling tickets to a mega lottery. There are infinite tickets available, numbered from 1 to infinity, and n people are standing in a queue waiting to buy the ticket. The ith person wants to buy the ticket numbered arr[i]. The tickets are sold based on the following rules: The tickets are sold in the sequence of the queue, i.e., the first person followed by the second person, and so on. If the ticket required by the person in the front of the queue is available, they are sold the ticket and removed from the queue. If the ticket required by the person in the front of the queue is already sold, the ticket number required by them is incremented by 1 and they are pushed to the end of the queue.

Given an array arr representing the ticket numbers desired by the people in the queue, determine the final ticket number allocated to each person in the queue.

Example
Given n = 5, arr=[1, 2, 3, 2, 4], the tickets are assigned in the following manner -

Queue	Ticket Allocation	Action
[1(1), 2(2), 3(3), 2(4), 4(5)]	-	Ticket 1 is sold to person 1
[2(2), 3(3), 2(4), 4(5)]	1: 1	Ticket 2 is sold to person 2
[3(3), 2(4), 4(5)]		Ticket 3 is sold to person 3
[2(4), 4(5)]	1: 1, 2: 2, 3: 3	Ticket 2 is already sold , so the person is pushed to the end of the queue with the required ticket number increased by 1
[4(5), 3(4)]	1: 1, 2: 2, 3: 3	Ticket 4 is sold to person 5
[3(4)]	1: 1, 2: 2, 3: 3, 4: 5	Ticket 3 is sold , so person 4 is pushed again with ticket number incremented
[4(4)]	1: 1, 2: 2, 3: 3, 4: 5	Ticket 4 is sold, so person 4 is pushed again with ticket number incremented
[5(4)]	1: 1, 2: 2, 3: 3, 4: 5	Ticket 5 is sold to person 4
The final answer is [1, 2, 3, 5, 4].

Function Description Create the function getTicketAllocation in the editor below.

getTicketAllocation has the following parameter: int arr[n]: the desired ticket number of each person

Returns int[n]: the ticket numbers allotted to each person

Input Format

1st Line: Number of inputs(Ticket choices array length)
Next N Lines: Integer containing desired ticket number

Example:
5 1 2 3 2 4

Constraints

• 1 ≤ n ≤ 100000
• 1 ≤ arr[i] ≤ n

Output Format

1 3 4 2 5

Explanation: Each integer ticket number alloted in a new line.

Sample Input 0

5
1
2
3
2
4
Sample Output 0

1
2
3
5
4
Explanation 0

Queue	Ticket Allocation	Action
[1(1), 2(2), 3(3), 2(4), 4(5)]	-	Ticket 1 is sold to person 1
[2(2), 3(3), 2(4), 4(5)]	1: 1	Ticket 2 is sold to person 2
[3(3), 2(4), 4(5)]		Ticket 3 is sold to person 3
[2(4), 4(5)]	1: 1, 2: 2, 3: 3	Ticket 2 is already sold , so the person is pushed to the end of the queue with the required ticket number increased by 1
[4(5), 3(4)]	1: 1, 2: 2, 3: 3	Ticket 4 is sold to person 5
[3(4)]	1: 1, 2: 2, 3: 3, 4: 5	Ticket 3 is sold , so person 4 is pushed again with ticket number incremented
[4(4)]	1: 1, 2: 2, 3: 3, 4: 5	Ticket 4 is sold, so person 4 is pushed again with ticket number incremented
[5(4)]	1: 1, 2: 2, 3: 3, 4: 5	Ticket 5 is sold to person 4

     */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int noOfCustomer= sc.nextInt();

        int[] ticketChoices= new int[noOfCustomer];
        for (int i=0; i<noOfCustomer; i++){
            ticketChoices[i]= sc.nextInt();
        }

        LotteryTicket.ticketAllocation(noOfCustomer,ticketChoices);

    }


    public static void ticketAllocation(int noOfCustomer, int[] ticketChoices){
        int [] output= new int[noOfCustomer];
        boolean completed= false;

        ArrayList<Integer> notAvailable= new ArrayList<>();
        while(!completed){
            completed= true;
            for(int i=0; i<noOfCustomer; i++){
                if(output[i]==0){
                    if(!notAvailable.contains(ticketChoices[i])){
                        output[i]= ticketChoices[i];
                        notAvailable.add(ticketChoices[i]);
                    } else{
                        ticketChoices[i]= ticketChoices[i]+1;
                        completed= false;
                    }
                }
            }
        }
        for (int i:output){
            System.out.println(i);
        }
    }


}
