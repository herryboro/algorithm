package programmers.level2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Document {
    int index;
    int prioritiyVal;

    public Document(int index, int prioritiyVal) {
        this.index = index;
        this.prioritiyVal = prioritiyVal;
    }
}

public class Printer {
//    public int solution(int[] priorities, int location) {
//        Queue<Document> queue = new LinkedList<Document>();
//        int answer = 0;
//
//        // 일단 queue에 문서들을 다 넣어준다.
//        for (int i = 0; i < priorities.length; i++) {
//            queue.offer(new Document(i, priorities[i]));
//        }
//
//        while (!queue.isEmpty()) {
//            boolean isTopVal = true;
//
//            // 가장 상위의 queue 값을 꺼내준다.
//            Document topDocu = queue.poll();
//            int topPrioritiyVal = topDocu.prioritiyVal;
//
//
//            for (Document document : queue) {
//                // 가장 상위의 queue의 우선순위 값이 나머지 queue에 남아 있는 우선순위 값들과 비교해서 더 큰게 발견된다면 queue의 뒤쪽으로 다시 넣어준다.
//                if (topPrioritiyVal < document.prioritiyVal) {
//                    queue.offer(topDocu);
//                    isTopVal = false;
//                    break;
//                }
//            }
//            /*
//                isTopVal이 true 라는 의미는 [가장 상위의 queue의 우선순위 값]이 [queue에 남아 있는 우선순위 값들]과 비교해서 더 이상 큰게 없다.
//                즉 인쇄를 해야된다는 뜻.
//             */
//            if (isTopVal) {
//                // 주어진 location 값이 일치하는 Docu를 찾을때까지 answer++ 해주다가 발견시 해당 index를 return 하면 그게 정답
//                answer++;
//                if (topDocu.index == location) return answer;
//            }
//        }
//        return answer;
//    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Document> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Document(i, priorities[i]));
        }

        while (!queue.isEmpty()) {
            Document docu = queue.poll();
            int prioritiyVal = docu.prioritiyVal;
            boolean largerThanPriorVal = true;

            for (Document document : queue) {
                if (prioritiyVal < document.prioritiyVal) {
                    queue.offer(docu);
                    largerThanPriorVal = false;
                    break;
                }
            }


            if(largerThanPriorVal) {
                answer++;

                if (location == docu.index) {
                    if(largerThanPriorVal) return answer;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] priorities = new int[s.length];

        for (int i = 0; i < priorities.length; i++) {
            priorities[i] = Integer.parseInt(s[i]);
        }

        int location = Integer.parseInt(br.readLine());

        Printer printer = new Printer();
        // 2 1 3 2, 2
        // 1 1 9 1 1 1, 0
        System.out.println(printer.solution(priorities, location));
    }
}
