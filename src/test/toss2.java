package test;

import java.util.*;

public class toss2 {
    public static void main(String[] args) {
        int[][] relationship = {{1, 2}, {2, 3}, {2, 6}, {3, 4}, {4, 5}};
        System.out.println(solution(relationship,1, 2));
    }

    static int solution(int[][] relationships, int target, int limit) {
        Map<Integer, Set<Integer>> friendsMap = new HashMap<>();

        for (int[] pair : relationships) {
            int friend1 = pair[0];
            int friend2 = pair[1];

            friendsMap.putIfAbsent(friend1, new HashSet<>());
            friendsMap.putIfAbsent(friend2, new HashSet<>());

            friendsMap.get(friend1).add(friend2);
            friendsMap.get(friend2).add(friend1);
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(target);
        visited.add(target);

        int numNewFriends = 0;
        int numOldFriends = 0;
        int depth = 0;
        int currentLevelSize = 1;

        while (!queue.isEmpty() && depth < limit) {
            int currentFriend = queue.poll();
            currentLevelSize--;

            Set<Integer> friends = friendsMap.get(currentFriend);

            for (int friend : friends) {
                if (!visited.contains(friend)) {
                    if (isAlreadyKnownFriend(relationships, target, friend)) {
                        visited.add(friend);
                        numOldFriends++;
                    } else {
                        numNewFriends++;
                        visited.add(friend);
                    }
                    queue.offer(friend);
                }
            }

            if (currentLevelSize == 0) {
                depth++;
                currentLevelSize = queue.size();
            }
        }

        int reward = (numNewFriends * 10 + numOldFriends * 5) + 2;
        return reward;
    }

    static boolean isAlreadyKnownFriend(int[][] relationships, int target, int friend) {
        for (int[] pair : relationships) {
            int friend1 = pair[0];
            int friend2 = pair[1];

            if ((friend1 == target && friend2 == friend) || (friend1 == friend && friend2 == target)) {
                return true;
            }
        }
        return false;
    }
}

